package com.example.ramin.petfinder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String[] myStringArray = new String[] { "1Android List View",
                "2Adapter implementation",
                "1Simple List View In Android",
                "1Create List View Android",
                "2Android Example",
                "2List View Source Code",
                "1List View Array Adapter",
                "2Android Example List View",
                "2Adapter implementation",
                "2Simple List View In Android",
                "2Create List View Android",
                "1Android Example",
                "1List View Source Code",
                "2List View Array Adapter",
                "1Android Example List View"
        };


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.mylist, R.id.itemName, myStringArray);


        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}
