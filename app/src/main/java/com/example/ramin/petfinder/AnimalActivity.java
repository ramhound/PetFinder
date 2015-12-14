package com.example.ramin.petfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AnimalActivity extends AppCompatActivity {

    private boolean found;
    private String pet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            found = extras.getBoolean("found");
        }

    }

    public void dogClick(View v) {
        pet = "Dog";
        Intent intent = new Intent(this, DetailsActivity.class);
        intent.putExtra("found", found);
        intent.putExtra("pet", pet);
        startActivity(intent);
    }
    public void catClick(View v) {
        pet = "Cat";
        Intent intent = new Intent(this, DetailsActivity.class);
        intent.putExtra("found", found);
        intent.putExtra("pet", pet);
        startActivity(intent);
    }

    public void otherClick(View v) {

    }
}
