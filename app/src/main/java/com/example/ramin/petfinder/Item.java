package com.example.ramin.petfinder;

import android.graphics.Bitmap;
import android.media.Image;

/**
 * Created by Ramin on 12/11/2015.
 */
public class Item {

    private Bitmap icon;
    private int text;


    public Item(Bitmap i, int d){
        this.icon = i;
        this.text = d;
    }

    public Bitmap getImage() {
        return icon;
    }

    public void setDetails(Bitmap icon) {
        this.icon = icon;
    }

    public int getText() {
        return text;
    }

    public void setName(int text) {
        this.text = text;
    }

}
