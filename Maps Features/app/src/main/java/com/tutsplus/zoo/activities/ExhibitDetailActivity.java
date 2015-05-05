package com.tutsplus.zoo.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.tutsplus.zoo.R;
import com.tutsplus.zoo.models.Animal;

/**
 * Created by paulruiz on 4/29/15.
 */
public class ExhibitDetailActivity extends ActionBarActivity {

    public static final String EXTRA_ANIMAL = "extra_animal";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exhibit_detail);

        Toolbar toolbar = (Toolbar) findViewById( R.id.toolbar );
        setSupportActionBar( toolbar );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );

        Animal animal = getIntent().getExtras().getParcelable( EXTRA_ANIMAL );

        TextView species = (TextView) findViewById( R.id.species );
        TextView description = (TextView) findViewById( R.id.description );
        ImageView image = (ImageView) findViewById( R.id.image );

        species.setText( animal.getSpecies() );
        description.setText( animal.getDescription() );

        Picasso.with( this ).load( animal.getImage() ).into( image );
    }
}
