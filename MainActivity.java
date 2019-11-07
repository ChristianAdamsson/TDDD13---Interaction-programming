package com.example.chris.lab2;


import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.*;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView);
        ArrayList<String> data = new ArrayList<String>();
        for(int x =0;x<60;x++)
            data.add("Data "+x );
        adapter = new ArrayAdapter<>(this,
                R.layout.activity_main_adapter,R.id.textView,
                data);
        ChristiansAdapter aa = new ChristiansAdapter(this,data);

        listView.setAdapter(aa);
        ( (Button) findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addStuff();
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,
                                    View view,
                                    int position, long id) {
                view.setBackgroundColor(Color.BLUE);

            }
        });
    }

    private void addStuff() {
        adapter.add("New added");
    }
}