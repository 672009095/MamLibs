package id.codigo.mamlib.service.main;

import android.content.Context;

import id.codigo.mamlib.service.base.BaseActivity;
import id.codigo.mamlib.service.connection.MamCallback;
import id.codigo.mamlib.service.presenter.GetProgramDetailPresenter;
import id.codigo.mamlib.service.response.GetProgramDetailResponse;

public class GetProgramDetail extends BaseActivity<MamCallback,GetProgramDetailPresenter> implements MamCallback<GetProgramDetailResponse>{

    private Context context;
    private String program_id;
    private String credential;
    private MamCallback<GetProgramDetailResponse>callback;

    private GetProgramDetail(Context context){
        this.context = context;
    }
    public static GetProgramDetail make(Context context){
        return new GetProgramDetail(context);
    }

    public GetProgramDetail setProgram_Id(String program_id){
        this.program_id = program_id;
        return this;
    }
    public GetProgramDetail setCredential(String credential){
        this.credential = credential;
        return this;
    }
    public MamCallback<GetProgramDetailResponse> create (final MamCallback<GetProgramDetailResponse> callback){
        this.callback = callback;
        getMvpPresenter().getDetailProgram(this.program_id,this.credential);
        return this.callback;
    }

    @Override
    public GetProgramDetailPresenter createPresenter() {
        return new GetProgramDetailPresenter(this.context);
    }

    @Override
    public void onSuccess(GetProgramDetailResponse response) {
        callback.onSuccess(response);
    }

    @Override
    public void onFailure(String message) {
        callback.onFailure(message);
    }
}
