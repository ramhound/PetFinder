package com.example.ramin.petfinder;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TabFragment2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tab_fragment2, container, false);

        ArrayList<Item> lostArray = new ArrayList();

        for(int i = 0; i < MainActivity.itemsArray.size(); i++) {
            if((MainActivity.itemsArray.get(i).getText() % 3) == 0) {
                lostArray.add(MainActivity.itemsArray.get(i));
            }
        }

        ItemAdapter adapter = new ItemAdapter(getActivity().getApplicationContext(), R.layout.list_item, lostArray);

        ListView listView = (ListView) rootView.findViewById(R.id.listView);
        listView.setAdapter(adapter);

        return rootView;
    }
}