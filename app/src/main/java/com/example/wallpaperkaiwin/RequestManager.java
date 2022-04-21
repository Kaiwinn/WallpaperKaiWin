package com.example.wallpaperkaiwin;

import android.content.Context;

import com.example.wallpaperkaiwin.Model.CuratedApiResponse;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public class RequestManager {
    Context context;
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.pexels.com/v1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    // Create Constructor with Context

    public RequestManager(Context context) {
        this.context = context;
    }

    private interface CallWallpaperList{
        @Headers( {
                "Accept: application/json",
                "Authorization: 563492ad6f91700001000001e53e65cd31254f3e996ecb1b5d927d61"
        })

        @GET("curated/")
        Call<CuratedApiResponse> getWallpapers(
                @Query("page") String page,
                @Query("per_page") String per_page
        );
    }
}
