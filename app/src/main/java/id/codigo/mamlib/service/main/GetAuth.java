package id.codigo.mamlib.service.main;

import android.content.Context;

import id.codigo.mamlib.service.base.BaseActivity;
import id.codigo.mamlib.service.connection.MamCallback;
import id.codigo.mamlib.service.presenter.GetAuthPresenter;
import id.codigo.mamlib.service.response.GetAuthResponse;

public class GetAuth extends BaseActivity<MamCallback,GetAuthPresenter> implements MamCallback<GetAuthResponse>{
    private Context context;
    private String cs;
    private String ck;
    private MamCallback<GetAuthResponse> callback;


    private GetAuth (Context context){
        this.context = context;
    }

    public static GetAuth make(Context context){
        return new GetAuth(context);
    }

    public GetAuth setCs(String cs){
        this.cs = cs;
        return this;
    }

    public GetAuth setCk(String ck){
        this.ck = ck;
        return this;
    }

    public MamCallback<GetAuthResponse> create (final MamCallback<GetAuthResponse> callback){
        this.callback = callback;
        getMvpPresenter().getAuth(this.cs,this.ck);
        return this.callback;
    }

    @Override
    public GetAuthPresenter createPresenter() {
        return new GetAuthPresenter(this.context);
    }

    @Override
    public void onSuccess(GetAuthResponse response) {
        if (response!=null){
            callback.onSuccess(response);

        }else{
            callback.onFailure(response.getMessage());
        }

    }

    @Override
    public void onFailure(String message) {
        callback.onFailure(message);
    }
}
