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

    ArrayList<Item> itemArray = new ArrayList<>();
    Context context;

    public ItemAdapter(Context context, int textViewResourceId, ArrayList<Item> objects) {
        super(context, textViewResourceId, objects);
        this.itemArray = objects;
        this.context = context;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.list_item, null);
        }

        Item i = itemArray.get(position);

        if(i != null) {
            TextView tt = (TextView) v.findViewById(R.id.itemName);
            ImageView icon = (ImageView) v.findViewById(R.id.icon);


            if(icon != null) {
                icon.setImageBitmap(i.getImage());
            }

            if(tt != null) {
                String s = Integer.toString(i.getText());
                if(i.getText() % 3 == 0) {
                    tt.setText("Lost");
                    tt.setBackgroundColor(context.getResources().getColor(R.color.lost));
                } else {
                    tt.setText("Found");
                    tt.setBackgroundColor(context.getResources().getColor(R.color.found));

                }
            }

        }

        return v;
    }


}


