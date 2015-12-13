package com.example.ramin.petfinder;

import android.graphics.Bitmap;

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

    public void setImage(Bitmap icon) {
        this.icon = icon;
    }

    public int getText() {
        return text;
    }

    public void setName(int text) {
        this.text = text;
    }

}
