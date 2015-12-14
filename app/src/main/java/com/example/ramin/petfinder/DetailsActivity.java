package com.example.ramin.petfinder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    private boolean found;
    private String pet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            found = extras.getBoolean("found");
            pet = extras.getString("pet");
        }

        TextView t1 = (TextView) findViewById(R.id.textView7);



    }



    public void nextClick(View v) {
    //if any field is null, ask to complete all fields
    }
}
