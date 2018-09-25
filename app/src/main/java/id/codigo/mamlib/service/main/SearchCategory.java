package id.codigo.mamlib.service.main;

import android.content.Context;

import id.codigo.mamlib.service.base.BaseActivity;
import id.codigo.mamlib.service.connection.MamCallback;
import id.codigo.mamlib.service.presenter.SearchCategoryPresenter;
import id.codigo.mamlib.service.response.SearchCategoryResponse;

public class SearchCategory extends BaseActivity<MamCallback,SearchCategoryPresenter> implements MamCallback<SearchCategoryResponse> {
    private Context context;
    private String category;
    private String credential;
    private MamCallback<SearchCategoryResponse> callback;

    private SearchCategory (Context context){
        this.context = context;
    }

    public static SearchCategory make(Context context){
        return new SearchCategory(context);
    }

    public SearchCategory setCategory(String category){
        this.category = category;
        return this;
    }

    public SearchCategory setCredential(String credential){
        this.credential = credential;
        return this;
    }

    public MamCallback<SearchCategoryResponse> create (final MamCallback<SearchCategoryResponse> callback){
        this.callback = callback;
        getMvpPresenter().searchCategory(this.category,this.credential);
        return this.callback;
    }

    @Override
    public SearchCategoryPresenter createPresenter() {
        return new SearchCategoryPresenter(this.context);
    }

    @Override
    public void onSuccess(SearchCategoryResponse response) {
        callback.onSuccess(response);
    }

    @Override
    public void onFailure(String message) {
        callback.onFailure(message);
    }
}
