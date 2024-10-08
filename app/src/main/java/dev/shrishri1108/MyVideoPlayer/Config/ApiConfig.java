package dev.shrishri1108.MyVideoPlayer.Config;

import dev.shrishri1108.MyVideoPlayer.Model.VideoWatchlist;
import dev.shrishri1108.MyVideoPlayer.Model.Video_listResponse.VideoListResponse;

import retrofit2.Call;

import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ApiConfig {


    @Headers({ "Content-Type: application/json;charset=UTF-8"})
    @GET("video_watchlist")
    Call<VideoWatchlist> getWatchLIstVideos(
            @Header ("Authorization")String token
    );


    @POST("video_list")
    Call<VideoListResponse> getVideoListResponse( @Header("Authorization")
                                                             String token);
}
