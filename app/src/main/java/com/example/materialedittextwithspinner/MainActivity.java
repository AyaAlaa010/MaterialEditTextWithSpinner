package com.example.materialedittextwithspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
AutoCompleteTextView autoCompleteTextView;
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        autoCompleteTextView=(AutoCompleteTextView)findViewById(R.id.autoComp);
        String [] names={"aya","ahmad","metawea"};
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,names);
    autoCompleteTextView.setAdapter(adapter);
    autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            String selectedName=names[position];
            Log.i(TAG, "onItemClick: "+selectedName);

        }
    });

    }
}