package id.codigo.mamlib.service.main;

import android.content.Context;

import id.codigo.mamlib.service.base.BaseActivity;
import id.codigo.mamlib.service.connection.MamCallback;
import id.codigo.mamlib.service.presenter.GetVideoPresenter;
import id.codigo.mamlib.service.response.GetVideoResponse;

public class GetVideo extends BaseActivity<MamCallback,GetVideoPresenter>implements MamCallback<GetVideoResponse> {
    private Context context;
    private String video_id;
    private String credential;
    private MamCallback<GetVideoResponse> callback;

    private GetVideo(Context context){
        this.context = context;
    }

    public static GetVideo make(Context context){
        return new GetVideo(context);
    }

    public GetVideo setVideo_Id(String video_id){
        this.video_id = video_id;
        return this;
    }

    public GetVideo setCredential(String credential){
        this.credential = credential;
        return this;
    }
    public MamCallback<GetVideoResponse> create (final MamCallback<GetVideoResponse> callback){
        this.callback = callback;
        getMvpPresenter().getVideo(this.video_id,this.credential);
        return this.callback;
    }
    @Override
    public GetVideoPresenter createPresenter() {
        return new GetVideoPresenter(this.context);
    }

    @Override
    public void onSuccess(GetVideoResponse response) {
        callback.onSuccess(response);
    }

    @Override
    public void onFailure(String message) {
        callback.onFailure(message);
    }
}
