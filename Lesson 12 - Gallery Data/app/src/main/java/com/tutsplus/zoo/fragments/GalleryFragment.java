package com.tutsplus.zoo.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;

import com.tutsplus.zoo.R;
import com.tutsplus.zoo.models.GalleryImage;
import com.tutsplus.zoo.utils.GalleryApiInterface;

import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by paulruiz on 4/8/15.
 */
public class GalleryFragment extends Fragment {

    public static GalleryFragment getInstance() {
        GalleryFragment fragment = new GalleryFragment();

        return fragment;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint( getString( R.string.gallery_feed ) )
                .build();

        GalleryApiInterface galleryApiInterface = restAdapter.create( GalleryApiInterface.class );

        galleryApiInterface.getStreams( new Callback<List<GalleryImage>>() {
            @Override
            public void success(List<GalleryImage> galleryImages, Response response) {
                if( galleryImages == null || galleryImages.isEmpty() )
                    return;

                for( GalleryImage image : galleryImages ) {
                    Log.e("Zoo", image.getThumbnail() );
                }
            }

            @Override
            public void failure(RetrofitError error) {

            }
        });
    }
}
