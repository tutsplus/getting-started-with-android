package com.tutsplus.zoo.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;

import com.google.android.gms.maps.SupportMapFragment;
import com.tutsplus.zoo.R;
import com.tutsplus.zoo.models.Pin;
import com.tutsplus.zoo.utils.PinsApiInterface;

import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by paulruiz on 4/8/15.
 */
public class ZooMapFragment extends SupportMapFragment {

    public static ZooMapFragment getInstance() {
        ZooMapFragment fragment = new ZooMapFragment();

        return fragment;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RestAdapter adapter = new RestAdapter.Builder()
                .setEndpoint( getString( R.string.pins_feed ) )
                .build();

        PinsApiInterface pinsApiInterface = adapter.create( PinsApiInterface.class );

        pinsApiInterface.getStreams( new Callback<List<Pin>>() {
            @Override
            public void success(List<Pin> pins, Response response) {
                for( Pin pin : pins ) {
                    Log.e("Zoo", pin.getName() );
                }
            }

            @Override
            public void failure(RetrofitError error) {

            }
        });
    }
}
