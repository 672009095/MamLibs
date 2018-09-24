package id.codigo.mamlib.service.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import id.codigo.mamlib.service.base.BaseModel;
import id.codigo.mamlib.service.base.BaseView;

public class GetAuthResponse extends BaseModel {

    @Expose
    @SerializedName("data")
    private Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public static class Data {
        @Expose
        @SerializedName("auth")
        private String auth;

        public String getAuth() {
            return auth;
        }

        public void setAuth(String auth) {
            this.auth = auth;
        }
    }
}
