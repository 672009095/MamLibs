package id.codigo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import id.codigo.mamlib.service.connection.MamCallback;
import id.codigo.mamlib.service.main.GetAuth;
import id.codigo.mamlib.service.response.GetAuthResponse;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView text = findViewById(R.id.text_hello);
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
}
