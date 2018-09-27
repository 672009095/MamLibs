package id.codigo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import id.codigo.mamlib.service.connection.MamCallback;
import id.codigo.mamlib.service.main.GetAuth;
import id.codigo.mamlib.service.main.GetCategory;
import id.codigo.mamlib.service.main.GetFeed;
import id.codigo.mamlib.service.main.GetProgramDetail;
import id.codigo.mamlib.service.main.GetProgramList;
import id.codigo.mamlib.service.main.GetTokenVideo;
import id.codigo.mamlib.service.main.GetVideo;
import id.codigo.mamlib.service.main.SearchCategory;
import id.codigo.mamlib.service.main.SearchFeed;
import id.codigo.mamlib.service.main.SearchTag;
import id.codigo.mamlib.service.response.GetAuthResponse;
import id.codigo.mamlib.service.response.GetCategoryListResponse;
import id.codigo.mamlib.service.response.GetFeedResponse;
import id.codigo.mamlib.service.response.GetProgramDetailResponse;
import id.codigo.mamlib.service.response.GetProgramListResponse;
import id.codigo.mamlib.service.response.GetVideoResponse;
import id.codigo.mamlib.service.response.GetVideoTokenResponse;
import id.codigo.mamlib.service.response.SearchCategoryResponse;
import id.codigo.mamlib.service.response.SearchFeedResponse;
import id.codigo.mamlib.service.response.SearchTagResponse;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    String credential = "MVg4t9jWSayY9jMtJrzHhyBcSxQkfstV";
    TextView txt1;
    TextView txt2;
    TextView txt3;
    TextView txt4;
    TextView txt5;
    TextView txt6;
    TextView txt7;
    TextView txt8;
    TextView txt9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView text = findViewById(R.id.text_hello);
        Button btn1 = findViewById(R.id.button_1);
        Button btn2 = findViewById(R.id.button_2);
        Button btn3 = findViewById(R.id.button_3);
        Button btn4 = findViewById(R.id.button_4);
        Button btn5 = findViewById(R.id.button_5);
        Button btn6 = findViewById(R.id.button_6);
        Button btn7 = findViewById(R.id.button_7);
        Button btn8 = findViewById(R.id.button_8);
        Button btn9 = findViewById(R.id.button_9);
        txt1 = findViewById(R.id.text_1);
        txt2 = findViewById(R.id.text_2);
        txt3 = findViewById(R.id.text_3);
        txt4 = findViewById(R.id.text_4);
        txt5 = findViewById(R.id.text_5);
        txt6 = findViewById(R.id.text_6);
        txt7 = findViewById(R.id.text_7);
        txt8 = findViewById(R.id.text_8);
        txt9 = findViewById(R.id.text_9);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);

        GetAuth.make(this)
                .setCk("MVg4t9jWSayY9jMtJrzHhyBcSxQkfstV")
                .setCs("3323f0e0b1d9f9eb6f0c0fad13c50ae0")
                .create(new MamCallback<GetAuthResponse>() {
                    @Override
                    public void onSuccess(GetAuthResponse response) {
                        text.setText(response.getData().getAuth());
                        Toast.makeText(MainActivity.this,response.getData().getAuth(),Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFailure(String message) {
                        text.setText(message);
                        Toast.makeText(MainActivity.this,"Fail cause : "+message,Toast.LENGTH_SHORT).show();
                    }
                });

    }

    @Override
    public void onClick(View v) {
        //int id = v.getId();
        switch (v.getId()){
            case R.id.button_1:
                GetCategory.make(this).setCredential(credential).create(new MamCallback<GetCategoryListResponse>() {
                    @Override
                    public void onSuccess(GetCategoryListResponse response) {
                        txt1.setText(response.getData().toString());
                    }

                    @Override
                    public void onFailure(String message) {
                        txt1.setText(message);
                    }
                });
                break;
            case R.id.button_2:
                GetFeed.make(this).setStart("0").setCount("7").setSort("obj_id").setBy("DESC").setCredential(credential).create(new MamCallback<GetFeedResponse>() {
                    @Override
                    public void onSuccess(GetFeedResponse response) {
                        txt2.setText(response.getData().toString());
                    }

                    @Override
                    public void onFailure(String message) {
                        txt2.setText(message);
                    }
                });
                break;
            case R.id.button_3:
                GetProgramDetail.make(this).setProgram_Id("6905").setCredential(credential).create(new MamCallback<GetProgramDetailResponse>() {
                    @Override
                    public void onSuccess(GetProgramDetailResponse response) {
                        txt3.setText(response.getData().toString());
                    }

                    @Override
                    public void onFailure(String message) {
                        txt3.setText(message);
                    }
                });
                break;
            case R.id.button_4:
                GetProgramList.make(this).setCredential(credential).create(new MamCallback<GetProgramListResponse>() {
                    @Override
                    public void onSuccess(GetProgramListResponse response) {
                        txt4.setText(response.getData().toString());
                    }

                    @Override
                    public void onFailure(String message) {
                        txt4.setText(message);
                    }
                });
                break;
            case R.id.button_5:
                GetTokenVideo.make(this).setVideo_id("").setCredential(credential).create(new MamCallback<GetVideoTokenResponse>() {
                    @Override
                    public void onSuccess(GetVideoTokenResponse response) {
                        txt5.setText(response.getData().toString());
                    }

                    @Override
                    public void onFailure(String message) {
                        txt5.setText(message);
                    }
                });
                break;
            case R.id.button_6:
                GetVideo.make(this).setVideo_Id("").setCredential(credential).create(new MamCallback<GetVideoResponse>() {
                    @Override
                    public void onSuccess(GetVideoResponse response) {
                        txt6.setText(response.getData().toString());
                    }

                    @Override
                    public void onFailure(String message) {
                        txt6.setText(message);
                    }
                });
                break;
            case R.id.button_7:
                SearchCategory.make(this).setCategory("").setCredential(credential).create(new MamCallback<SearchCategoryResponse>() {
                    @Override
                    public void onSuccess(SearchCategoryResponse response) {
                        txt7.setText(response.getData().toString());
                    }

                    @Override
                    public void onFailure(String message) {
                        txt7.setText(message);
                    }
                });
                break;
            case R.id.button_8:
                SearchFeed.make(this).setCredential(credential).setQuery("").create(new MamCallback<SearchFeedResponse>() {
                    @Override
                    public void onSuccess(SearchFeedResponse response) {
                        txt8.setText(response.getData().toString());
                    }

                    @Override
                    public void onFailure(String message) {
                        txt8.setText(message);
                    }
                });
                break;
            case R.id.button_9:
                SearchTag.make(this).setTag("").setCredential(credential).create(new MamCallback<SearchTagResponse>() {
                    @Override
                    public void onSuccess(SearchTagResponse response) {
                        txt9.setText(response.getData().toString());
                    }

                    @Override
                    public void onFailure(String message) {
                        txt9.setText(message);
                    }
                });
                break;

        }
    }
}
