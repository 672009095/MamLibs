package id.codigo.mamlib.service.main;

import android.content.Context;

import id.codigo.mamlib.service.base.BaseActivity;
import id.codigo.mamlib.service.connection.MamCallback;
import id.codigo.mamlib.service.presenter.GetFeedPresenter;
import id.codigo.mamlib.service.response.GetFeedResponse;

public class GetFeed extends BaseActivity<MamCallback,GetFeedPresenter>implements MamCallback<GetFeedResponse>{
    private Context context;
    private String start;
    private String count;
    private String sort;
    private String by;
    private String credential;
    private MamCallback<GetFeedResponse> callback;

    private GetFeed (Context context){
        this.context = context;
    }
    public static GetFeed make(Context context){
        return new GetFeed(context);
    }

    public GetFeed setStart(String start){
        this.start = start;
        return this;
    }
    public GetFeed setCount(String count){
        this.count = count;
        return this;
    }
    public GetFeed setSort(String sort){
        this.sort = sort;
        return this;
    }
    public GetFeed setBy(String by){
        this.by = by;
        return this;
    }
    public GetFeed setCredential(String credential){
        this.credential = credential;
        return this;
    }

    public MamCallback<GetFeedResponse> create (final MamCallback<GetFeedResponse> callback){
        this.callback = callback;
        getMvpPresenter().getFeed(
                this.start,
                this.count,
                this.sort,
                this.by,
                this.credential
        );
        return this.callback;
    }

    @Override
    public GetFeedPresenter createPresenter() {
        return new GetFeedPresenter(this.context);
    }

    @Override
    public void onSuccess(GetFeedResponse response) {
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
