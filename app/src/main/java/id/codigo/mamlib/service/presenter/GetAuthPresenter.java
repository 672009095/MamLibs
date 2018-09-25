package id.codigo.mamlib.service.presenter;

import android.content.Context;

import id.codigo.mamlib.BuildConfig;
import id.codigo.mamlib.service.base.BasePresenter;
import id.codigo.mamlib.service.connection.MamCallback;
import id.codigo.mamlib.service.connection.MamService;
import id.codigo.mamlib.service.connection.MamSession;
import id.codigo.mamlib.service.response.GetAuthResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GetAuthPresenter extends BasePresenter<MamCallback>{
    private Context context;
    public GetAuthPresenter(Context context){
        this.context = context;
    }
    public void getAuth(String cs,String ck){
        Call<GetAuthResponse> call = MamService.create().getAuth(cs,ck);
        call.enqueue(new Callback<GetAuthResponse>() {
            @Override
            public void onResponse(Call<GetAuthResponse> call, Response<GetAuthResponse> response) {
                if(response.isSuccessful()){
                    if(response.body().getStatus()==200){
                        MamSession.init(context).storeAuth(response.body().getData().getAuth());
                        getMvpView().onSuccess(response.body());
                    }else{
                        getMvpView().onFailure(response.body().getMessage());
                    }
                }
            }

            @Override
            public void onFailure(Call<GetAuthResponse> call, Throwable t) {
                getMvpView().onFailure(t.getLocalizedMessage());
            }
        });

    }
}
