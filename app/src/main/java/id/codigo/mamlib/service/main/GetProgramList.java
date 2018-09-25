package id.codigo.mamlib.service.main;

import android.content.Context;

import id.codigo.mamlib.service.base.BaseActivity;
import id.codigo.mamlib.service.connection.MamCallback;
import id.codigo.mamlib.service.presenter.GetProgramListPresenter;
import id.codigo.mamlib.service.response.GetProgramListResponse;

public class GetProgramList extends BaseActivity<MamCallback,GetProgramListPresenter> implements MamCallback<GetProgramListResponse> {
    private Context context;
    private String credential;
    private MamCallback<GetProgramListResponse>callback;
    private GetProgramList(Context context){
        this.context = context;
    }
    public static GetProgramList make(Context context){
        return new GetProgramList(context);
    }

    public GetProgramList setCredential(String credential){
        this.credential = credential;
        return this;
    }

    @Override
    public GetProgramListPresenter createPresenter() {
        return new GetProgramListPresenter(this.context);
    }

    public MamCallback<GetProgramListResponse> create (final MamCallback<GetProgramListResponse> callback){
        this.callback = callback;
        getMvpPresenter().getProgramList(this.credential);
        return this.callback;
    }

    @Override
    public void onSuccess(GetProgramListResponse response) {
        callback.onSuccess(response);
    }

    @Override
    public void onFailure(String message) {
        callback.onFailure(message);
    }
}
