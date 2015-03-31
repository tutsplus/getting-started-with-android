package com.tutsplus.zoo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by paulruiz on 3/30/15.
 */
public class NavigationDrawerListAdapter extends ArrayAdapter<String> {

    public NavigationDrawerListAdapter(Context context, int resource) {
        super(context, resource);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if( convertView == null ) {
            holder = new ViewHolder();
            convertView = LayoutInflater.from( getContext() ).inflate( R.layout.view_navigation_list_item, parent, false );
            convertView.setTag( holder );
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.title = (TextView) convertView.findViewById( R.id.title );
        holder.title.setText( getItem( position ) );

        return convertView;
    }

    public class ViewHolder {
        TextView title;
    }
}
