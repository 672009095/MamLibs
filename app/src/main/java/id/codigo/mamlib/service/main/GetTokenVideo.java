package id.codigo.mamlib.service.main;

import android.content.Context;

import id.codigo.mamlib.service.base.BaseActivity;
import id.codigo.mamlib.service.connection.MamCallback;
import id.codigo.mamlib.service.presenter.GetTokenVideoPresenter;
import id.codigo.mamlib.service.response.GetVideoTokenResponse;

public class GetTokenVideo extends BaseActivity<MamCallback,GetTokenVideoPresenter>implements MamCallback<GetVideoTokenResponse>{
    private Context context;
    private String video_id;
    private String credential;
    private MamCallback<GetVideoTokenResponse>callback;

    private GetTokenVideo(Context context){
        this.context = context;
    }

    public static GetTokenVideo make(Context context){
        return new GetTokenVideo(context);
    }

    public GetTokenVideo setVideo_id(String video_id){
        this.video_id = video_id;
        return this;
    }

    public GetTokenVideo setCredential(String credential){
        this.credential = credential;
        return  this;
    }

    public MamCallback<GetVideoTokenResponse> create (final MamCallback<GetVideoTokenResponse> callback){
        this.callback = callback;
        getMvpPresenter().getVideoToken(this.video_id,this.credential);
        return this.callback;
    }

    @Override
    public GetTokenVideoPresenter createPresenter() {
        return new GetTokenVideoPresenter(this.context);
    }

    @Override
    public void onSuccess(GetVideoTokenResponse response) {
        callback.onSuccess(response);
    }

    @Override
    public void onFailure(String message) {
        callback.onFailure(message);
    }
}
