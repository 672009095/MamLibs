package id.codigo.mamlib.service.main;

import android.content.Context;

import id.codigo.mamlib.service.base.BaseActivity;
import id.codigo.mamlib.service.connection.MamCallback;
import id.codigo.mamlib.service.presenter.GetCategoryListPresenter;
import id.codigo.mamlib.service.response.GetCategoryListResponse;

public class GetCategory extends BaseActivity<MamCallback,GetCategoryListPresenter> implements MamCallback<GetCategoryListResponse> {
    private Context context;
    private String credential;
    private MamCallback<GetCategoryListResponse>callback;

    private GetCategory(Context context){
        this.context = context;
    }

    public static GetCategory make(Context context){
        return new GetCategory(context);
    }

    public GetCategory setCredential(String credential){
        this.credential = credential;
        return this;
    }

    public MamCallback<GetCategoryListResponse> create (final MamCallback<GetCategoryListResponse> callback){
        this.callback = callback;
        getMvpPresenter().getCategoryList(this.credential);
        return this.callback;
    }

    @Override
    public GetCategoryListPresenter createPresenter() {
        return new GetCategoryListPresenter(this.context);
    }

    @Override
    public void onSuccess(GetCategoryListResponse response) {
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
