package id.codigo.mamlib.service.connection;

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
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MamAPI {
    @GET("getAuth")
    Call<GetAuthResponse> getAuth(
            @Query("cs")String cs,
            @Query("ck")String ck);

    @GET("getCategory")
    Call<GetCategoryListResponse>getCategory();

    @GET("getProgram")
    Call<GetProgramListResponse>getProgram();

    @GET("getProgram/{id_program}")
    Call<GetProgramDetailResponse>getProgramDetail(
            @Path("id_program")String id_program
    );
    @GET("getFeed")
    Call<GetFeedResponse>getFeed(
            @Query("start") String start,
            @Query("count")String count,
            @Query("sort")String sort,
            @Query("by")String by
    );
    @GET("searchFeed")
    Call<SearchFeedResponse>searchFeed(
            @Query("q")String query
    );
    @GET("searchFeed/tag")
    Call<SearchTagResponse>searchTag(
            @Query("t")String tag
    );
    @GET("searchFeed/cat")
    Call<SearchCategoryResponse>searchCategory(
            @Query("q")String category
    );
    @GET("getFeed/{video_id}")
    Call<GetVideoResponse>getVideo(
            @Path("video_id") String video_id
    );
    @GET("getTokenVideo/{video_id}")
    Call<GetVideoTokenResponse>getVideoToken(
            @Path("video_id")String video_id
    );
}
