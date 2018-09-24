package id.codigo.mamlib.service.connection;

import id.codigo.mamlib.service.response.GetAuthResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MamAPI {
    @GET("getAuth")
    Call<GetAuthResponse> getAuth(
            @Query("cs")String cs,
            @Query("ck")String ck);

}
