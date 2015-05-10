package com.tutsplus.zoo.activities;

import android.content.res.Configuration;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.squareup.otto.Subscribe;
import com.tutsplus.zoo.R;
import com.tutsplus.zoo.events.DrawerSectionItemClickedEvent;
import com.tutsplus.zoo.fragments.ExhibitsListFragment;
import com.tutsplus.zoo.fragments.GalleryFragment;
import com.tutsplus.zoo.fragments.ZooMapFragment;
import com.tutsplus.zoo.utils.EventBus;


public class MainActivity extends ActionBarActivity {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mActionBarDrawerToggle;
    private String mCurrentFragmentTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById( R.id.toolbar );
        setSupportActionBar( toolbar );
        getSupportActionBar().setDisplayShowHomeEnabled( true );
        getSupportActionBar().setHomeButtonEnabled( true );

        mDrawerLayout = (DrawerLayout) findViewById( R.id.drawer_layout );
        mActionBarDrawerToggle = new ActionBarDrawerToggle( this, mDrawerLayout, R.string.drawer_opened, R.string.drawer_closed ) {
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                if( getSupportActionBar() != null )
                    getSupportActionBar().setTitle( R.string.drawer_opened );
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                if( getSupportActionBar() != null )
                    getSupportActionBar().setTitle( R.string.drawer_closed );
            }
        };

        mDrawerLayout.setDrawerListener( mActionBarDrawerToggle );

        displayInitialFragment();
    }

    private void displayInitialFragment() {
        getSupportFragmentManager().beginTransaction().replace( R.id.container, ExhibitsListFragment.getInstance() ).commit();
        mCurrentFragmentTitle = getString( R.string.section_exhibits );
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mActionBarDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mActionBarDrawerToggle.onConfigurationChanged( newConfig );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        if( mActionBarDrawerToggle.onOptionsItemSelected( item ) )
            return true;

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onStart() {
        super.onStart();
        EventBus.getInstance().register( this );
    }

    @Override
    protected void onStop() {
        EventBus.getInstance().unregister( this );
        super.onStop();
    }

    @Subscribe
    public void onDrawerSectionItemClickEvent( DrawerSectionItemClickedEvent event ) {
        mDrawerLayout.closeDrawers();

        if( event == null || TextUtils.isEmpty( event.section ) || event.section.equalsIgnoreCase( mCurrentFragmentTitle ) ) {
            return;
        }

        Toast.makeText( this, "MainActivity: Section Clicked: " + event.section, Toast.LENGTH_SHORT ).show();

        if( event.section.equalsIgnoreCase( getString( R.string.section_map ) ) ) {
            getSupportFragmentManager().beginTransaction().replace( R.id.container, ZooMapFragment.getInstance() ).commit();
        } else if( event.section.equalsIgnoreCase( getString( R.string.section_gallery ) ) ) {
            getSupportFragmentManager().beginTransaction().replace( R.id.container, GalleryFragment.getInstance() ).commit();
        } else if( event.section.equalsIgnoreCase( getString( R.string.section_exhibits ) ) ) {
            getSupportFragmentManager().beginTransaction().replace( R.id.container, ExhibitsListFragment.getInstance() ).commit();
        } else {
            return;
        }

        mCurrentFragmentTitle = event.section;
    }
}
