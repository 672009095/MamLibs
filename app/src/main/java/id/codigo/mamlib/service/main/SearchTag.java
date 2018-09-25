package id.codigo.mamlib.service.main;

import android.content.Context;

import id.codigo.mamlib.service.base.BaseActivity;
import id.codigo.mamlib.service.connection.MamCallback;
import id.codigo.mamlib.service.presenter.SearchTagPresenter;
import id.codigo.mamlib.service.response.SearchTagResponse;

public class SearchTag extends BaseActivity<MamCallback,SearchTagPresenter> implements MamCallback<SearchTagResponse>{
    private Context context;
    private String tag;
    private String credential;
    private MamCallback<SearchTagResponse> callback;

    private SearchTag(Context context){
        this.context = context;
    }
    public static SearchTag make(Context context){
        return new SearchTag(context);
    }

    public SearchTag setTag(String tag){
        this.tag = tag;
        return this;
    }

    public SearchTag setCredential(String credential){
        this.credential = credential;
        return this;
    }

    public MamCallback<SearchTagResponse> create (final MamCallback<SearchTagResponse> callback){
        this.callback = callback;
        getMvpPresenter().searchTag(this.tag,this.credential);
        return this.callback;
    }

    @Override
    public SearchTagPresenter createPresenter() {
        return new SearchTagPresenter(this.context);
    }

    @Override
    public void onSuccess(SearchTagResponse response) {
        callback.onSuccess(response);
    }

    @Override
    public void onFailure(String message) {
        callback.onFailure(message);
    }
}
