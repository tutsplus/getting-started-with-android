package com.tutsplus.zoo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by paulruiz on 3/30/15.
 */
public class DrawerNavigationListView extends ListView implements AdapterView.OnItemClickListener {
    public DrawerNavigationListView(Context context) {
        this(context, null);
    }

    public DrawerNavigationListView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DrawerNavigationListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        NavigationDrawerListAdapter adapter = new NavigationDrawerListAdapter( getContext(), 0 );
        adapter.add( "Exhibits" );
        adapter.add( "Gallery" );
        adapter.add( "Maps" );
        setAdapter( adapter );
        setOnItemClickListener( this );
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText( getContext(), "Item Clicked! " + getItemAtPosition( position ), Toast.LENGTH_SHORT ).show();
    }
}
