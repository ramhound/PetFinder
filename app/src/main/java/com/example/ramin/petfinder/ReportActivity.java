package com.example.ramin.petfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ReportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
    }


    public void lostClick(View v) {
    boolean found = false;
        Intent intent = new Intent(this, DetailsActivity.class);
        intent.putExtra("found", found);
        startActivity(intent);

    }
    public void foundClick(View v) {
        boolean found = true;
        Intent intent = new Intent(this, DetailsActivity.class);
        intent.putExtra("found", found);
        startActivity(intent);

    }
}
