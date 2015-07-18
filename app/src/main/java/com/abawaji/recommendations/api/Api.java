package com.abawaji.recommendations.api;

import com.abawaji.recommendations.model.ActiveListings;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by iObsa on 5/28/15.
 */
public interface Api {


    @GET("/listings/active")
    void activeListings(@Query("includes") String includes,
                        Callback<ActiveListings> callback);
}
