package com.tutsplus.zoo.utils;

import com.tutsplus.zoo.models.GalleryImage;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by paulruiz on 4/29/15.
 */
public interface GalleryApiInterface {

    @GET( "/gallery.json" )
    void getStreams( Callback<List<GalleryImage>> callback );

}
