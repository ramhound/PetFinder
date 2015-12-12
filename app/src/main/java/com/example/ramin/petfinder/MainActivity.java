package com.example.ramin.petfinder;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Item[] itemsArray = new Item[10];
        Bitmap icon = BitmapFactory.decodeResource(getResources(),
                R.mipmap.ic_launcher);

        for(int i = 0; i < itemsArray.length; i++) {

            itemsArray[i] = new Item(icon,i);
        }


        ItemAdapter adapter = new ItemAdapter(this, R.layout.list_item, itemsArray);

        //ItemAdapter<String> adapter = new ArrayAdapter<String>(this,
                //R.layout.list_item, R.id.itemName, myStringArray);


        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}
