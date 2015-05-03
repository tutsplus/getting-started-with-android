package com.tutsplus.zoo.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.tutsplus.zoo.R;

/**
 * Created by paulruiz on 5/3/15.
 */
public class GalleryDetailActivity extends ActionBarActivity {

    public static final String EXTRA_IMAGE = "extra_image";
    public static final String EXTRA_CAPTION = "extra_caption";

    private TextView mCaptionTextView;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_detail );
        Toolbar toolbar = (Toolbar) findViewById( R.id.toolbar );
        setSupportActionBar( toolbar );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );

        mCaptionTextView = (TextView) findViewById( R.id.caption );
        mImageView = (ImageView) findViewById( R.id.image );

        if( getIntent() != null && getIntent().getExtras() != null ) {
            if( getIntent().getExtras().containsKey( EXTRA_IMAGE ) ) {
                Picasso.with(this).load( getIntent().getExtras().getString( EXTRA_IMAGE ) ).into( mImageView );
            }

            if( getIntent().getExtras().containsKey( EXTRA_CAPTION ) ) {
                mCaptionTextView.setText( getIntent().getExtras().getString( EXTRA_CAPTION ) );
            }
        }
    }
}
