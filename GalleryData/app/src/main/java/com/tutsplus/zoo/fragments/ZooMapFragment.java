package com.tutsplus.zoo.fragments;

import com.google.android.gms.maps.SupportMapFragment;

/**
 * Created by paulruiz on 4/8/15.
 */
public class ZooMapFragment extends SupportMapFragment {

    public static ZooMapFragment getInstance() {
        ZooMapFragment fragment = new ZooMapFragment();

        return fragment;
    }

}
