package com.tutsplus.zoo.utils;

import com.tutsplus.zoo.models.Animal;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by paulruiz on 4/14/15.
 */
public interface AnimalApiInterface {

    @GET( "/Exhibits.json" )
    void getStreams( Callback<List<Animal>> callback );

}
