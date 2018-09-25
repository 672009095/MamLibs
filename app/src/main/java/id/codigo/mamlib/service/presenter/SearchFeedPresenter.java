package id.codigo.mamlib.service.presenter;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import id.codigo.mamlib.service.base.BasePresenter;
import id.codigo.mamlib.service.connection.Header;
import id.codigo.mamlib.service.connection.MamCallback;
import id.codigo.mamlib.service.connection.MamService;
import id.codigo.mamlib.service.connection.MamSession;
import id.codigo.mamlib.service.response.SearchFeedResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SearchFeedPresenter extends BasePresenter<MamCallback>{
    private Context context;
    public SearchFeedPresenter(Context context){
        this.context = context;
    }
    public void searchFeed(String query,String credential){
        Call<SearchFeedResponse> call = MamService.createWithHeader(setHeader(credential))
                .searchFeed(query);
        call.enqueue(new Callback<SearchFeedResponse>() {
            @Override
            public void onResponse(Call<SearchFeedResponse> call, Response<SearchFeedResponse> response) {
                if(response.isSuccessful()){
                    if(response.body().getStatus()==200){
                        getMvpView().onSuccess(response.body());
                    }else{
                        getMvpView().onFailure(response.body().getMessage());
                    }
                }
            }

            @Override
            public void onFailure(Call<SearchFeedResponse> call, Throwable t) {
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
