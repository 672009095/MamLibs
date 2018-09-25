package id.codigo.mamlib.service.main;

import android.content.Context;

import id.codigo.mamlib.service.base.BaseActivity;
import id.codigo.mamlib.service.connection.MamCallback;
import id.codigo.mamlib.service.presenter.SearchFeedPresenter;
import id.codigo.mamlib.service.response.SearchFeedResponse;

public class SearchFeed extends BaseActivity<MamCallback,SearchFeedPresenter>implements MamCallback<SearchFeedResponse>{
    private Context context;
    private String query;
    private String credential;
    private MamCallback<SearchFeedResponse>callback;

    private SearchFeed (Context context){
        this.context = context;
    }
    public static SearchFeed make(Context context){
        return new SearchFeed(context);
    }

    public SearchFeed setQuery(String query){
        this.query = query;
        return this;
    }

    public SearchFeed setCredential(String credential){
        this.credential = credential;
        return this;
    }
    public MamCallback<SearchFeedResponse> create (final MamCallback<SearchFeedResponse> callback){
        this.callback = callback;
        getMvpPresenter().searchFeed(this.query,this.credential);
        return this.callback;
    }
    @Override
    public SearchFeedPresenter createPresenter() {
        return new SearchFeedPresenter(this.context);
    }

    @Override
    public void onSuccess(SearchFeedResponse response) {
        callback.onSuccess(response);
    }

    @Override
    public void onFailure(String message) {
        callback.onFailure(message);
    }
}
