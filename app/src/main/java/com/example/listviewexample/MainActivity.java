package com.example.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
         private ListView n;
         String[] values = new String[] {"dog","cat","loin","tiger"

         };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n = findViewById(R.id.lstanimals);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,values);
        n.setAdapter(arrayAdapter);
    }
}
