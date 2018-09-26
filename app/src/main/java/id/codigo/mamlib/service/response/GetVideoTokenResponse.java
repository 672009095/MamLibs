package id.codigo.mamlib.service.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import id.codigo.mamlib.service.base.BaseModel;

public class GetVideoTokenResponse extends BaseModel {

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
        @SerializedName("token_ttl")
        private int token_ttl;
        @Expose
        @SerializedName("play_token")
        private String play_token;
        @Expose
        @SerializedName("anvack_key")
        private String anvack_key;
        @Expose
        @SerializedName("anvack_type")
        private String anvack_type;
        @Expose
        @SerializedName("video_id")
        private String video_id;

        public int getToken_ttl() {
            return token_ttl;
        }

        public void setToken_ttl(int token_ttl) {
            this.token_ttl = token_ttl;
        }

        public String getPlay_token() {
            return play_token;
        }

        public void setPlay_token(String play_token) {
            this.play_token = play_token;
        }

        public String getAnvack_key() {
            return anvack_key;
        }

        public void setAnvack_key(String anvack_key) {
            this.anvack_key = anvack_key;
        }

        public String getAnvack_type() {
            return anvack_type;
        }

        public void setAnvack_type(String anvack_type) {
            this.anvack_type = anvack_type;
        }

        public String getVideo_id() {
            return video_id;
        }

        public void setVideo_id(String video_id) {
            this.video_id = video_id;
        }
    }
}
