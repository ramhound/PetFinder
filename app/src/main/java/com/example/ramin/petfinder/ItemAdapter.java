package com.example.ramin.petfinder;

/**
 * Created by Ramin on 12/11/2015.
 */

import android.content.Context;
import android.graphics.Color;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.*;

public class ItemAdapter extends ArrayAdapter<Item> {

    Item[] itemArray;

    public ItemAdapter(Context context, int textViewResourceId, Item[] objects) {
        super(context, textViewResourceId, objects);
        this.itemArray = objects;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.list_item, null);
        }

        Item i = itemArray[position];

        if(i != null) {
            TextView tt = (TextView) v.findViewById(R.id.itemName);
            ImageView icon = (ImageView) v.findViewById(R.id.icon);

            if(icon != null) {
                icon.setImageBitmap(i.getImage());
            }

            if(tt != null) {
                String s = Integer.toString(i.getText());
                tt.setText(s);
                if(i.getText() % 2 == 0) {
                    v.setBackgroundColor(Color.GREEN);
                } else {
                    v.setBackgroundColor(Color.RED);

                }
            }

        }

        return v;
    }


}


