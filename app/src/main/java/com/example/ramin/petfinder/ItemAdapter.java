package com.example.ramin.petfinder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


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
            TextView tt2 = (TextView) v.findViewById(R.id.textView);
            TextView tt3 = (TextView) v.findViewById(R.id.textView2);


            ImageView icon = (ImageView) v.findViewById(R.id.icon);


            if(icon != null) {
                icon.setImageBitmap(i.getIcon());
            }

            if(tt != null) {
                if(i.isFound()) {
                    tt.setText("Found");
                    tt.setBackgroundColor(context.getResources().getColor(R.color.found));

                } else {
                    tt.setText("Lost");
                    tt.setBackgroundColor(context.getResources().getColor(R.color.lost));
                }
            }
            if(tt2 != null) {
                tt2.setText(i.getPet());
            }
            if(tt3 != null) {
                tt3.setText(i.getBreed());
            }

        }

        return v;
    }


}


