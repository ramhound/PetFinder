package com.example.ramin.petfinder;

import android.graphics.Bitmap;

public class Item {
    private boolean found;
    private String pet;
    private String breed;
    private String color;
    private String desc;
    private Bitmap icon;

    public Item(boolean found, String pet, String breed, String color,
                String desc, Bitmap icon){

        this.found = found;
        this.pet = pet;
        this.breed = breed;
        this.color = color;
        this. desc = desc;
        this.icon = icon;
    }

    public boolean isFound() {
        return found;
    }

    public void setFound(boolean found) {
        this.found = found;
    }

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Bitmap getIcon() {
        return icon;
    }

    public void setIcon(Bitmap icon) {
        this.icon = icon;
    }

}
