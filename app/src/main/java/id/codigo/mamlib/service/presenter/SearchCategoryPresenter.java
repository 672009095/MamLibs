package id.codigo.mamlib.service.presenter;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import id.codigo.mamlib.service.base.BasePresenter;
import id.codigo.mamlib.service.connection.Header;
import id.codigo.mamlib.service.connection.MamCallback;
import id.codigo.mamlib.service.connection.MamService;
import id.codigo.mamlib.service.connection.MamSession;
import id.codigo.mamlib.service.response.SearchCategoryResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SearchCategoryPresenter extends BasePresenter<MamCallback>{
    private Context context;
    public SearchCategoryPresenter(Context context){
        this.context = context;
    }
    public void searchCategory(String category,String credential){
        Call<SearchCategoryResponse> call = MamService.createWithHeader(setHeader(credential))
                .searchCategory(category);
        call.enqueue(new Callback<SearchCategoryResponse>() {
            @Override
            public void onResponse(Call<SearchCategoryResponse> call, Response<SearchCategoryResponse> response) {
                if(response.isSuccessful()){
                    if(response.body().getStatus()==200){
                        getMvpView().onSuccess(response.body());
                    }else{
                        getMvpView().onFailure(response.body().getMessage());
                    }
                }
            }

            @Override
            public void onFailure(Call<SearchCategoryResponse> call, Throwable t) {
                getMvpView().onFailure(t.getLocalizedMessage());
            }
        });
    }
    public List<Header> setHeader(String credential){
        List<Header>headers = new ArrayList<>();
        Header h1 = new Header("Authorization", MamSession.init(context).getAuth());
        Header h2 = new Header("Credential",credential);
        headers.add(h1);
        headers.add(h2);
        return headers;
    }
}
