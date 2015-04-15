package com.tutsplus.zoo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.tutsplus.zoo.R;
import com.tutsplus.zoo.models.Animal;

/**
 * Created by paulruiz on 4/14/15.
 */
public class ExhibitsAdapter extends ArrayAdapter<Animal> {

    public ExhibitsAdapter(Context context, int resource) {
        super(context, resource);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if( convertView == null ) {
            holder = new ViewHolder();
            convertView = LayoutInflater.from( getContext() ).inflate( R.layout.view_exhibit_list_item, parent, false );

            holder.name = (TextView) convertView.findViewById( R.id.name );
            holder.species = (TextView) convertView.findViewById( R.id.species );
            holder.thumbnail = (ImageView) convertView.findViewById( R.id.thumbnail );

            convertView.setTag( holder );
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.name.setText( getItem( position ).getName() );
        holder.species.setText( getItem( position ).getSpecies() );

        Picasso.with(getContext()).load( getItem( position ).getThumbnail() ).into( holder.thumbnail );

        return convertView;
    }

    class ViewHolder {
        ImageView thumbnail;
        TextView name;
        TextView species;
    }
}
