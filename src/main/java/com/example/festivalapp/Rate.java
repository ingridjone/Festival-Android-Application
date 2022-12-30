package com.example.festivalapp;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import static java.util.Arrays.asList;


public class Rate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate);

        //Identifying the ListView through its id
        ListView rateListView = findViewById(R.id.rateListView);

        //Adding items to the ArrayList
        final ArrayList<String> star= new ArrayList<String>(asList("Incredible (5 stars)", "Good (4 stars)", "Decent (3 stars)", "Could be better (2 stars)", "Unplayable (1 star)", "Retire as a developer (0 stars)"));

        //Building an adapter for the ArrayList
        ArrayAdapter<String> arrayAdapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,star);

        //Setting adapter to ListView
        rateListView.setAdapter(arrayAdapter);

        //Creating a method for when the user clicks an item from the ListView
        rateListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "I rate Festival Survival as " + star.get(i), Toast.LENGTH_LONG).show();
            }
        });

    }
}
