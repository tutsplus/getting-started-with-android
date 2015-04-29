package com.tutsplus.zoo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.tutsplus.zoo.R;
import com.tutsplus.zoo.models.GalleryImage;

/**
 * Created by paulruiz on 4/29/15.
 */
public class GalleryImageAdapter extends ArrayAdapter<GalleryImage> {
    public GalleryImageAdapter(Context context, int resource) {
        super(context, resource);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if( convertView == null ) {
            holder = new ViewHolder();
            convertView = LayoutInflater.from( getContext() ).inflate( R.layout.view_gallery_thumbnail, parent, false );
            holder.image = (ImageView) convertView.findViewById( R.id.image );
            convertView.setTag( holder );
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Picasso.with( getContext() ).load( getItem( position ).getThumbnail() ).into( holder.image );

        return convertView;
    }

    private class ViewHolder {
        ImageView image;
    }
}
