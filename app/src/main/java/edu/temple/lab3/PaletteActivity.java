package edu.temple.lab3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class PaletteActivity extends AppCompatActivity {

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);
        setTitle("Palette Activity");

        //Set Colors
        final String myColors[] = {"White","Red","Blue","Yellow","Green"};

        //Find Spinner
        spinner = findViewById(R.id.spinner);

        //Adapter
        ColorAdapter adapter = new ColorAdapter(this,myColors);
        spinner.setAdapter(adapter);

        //Listener
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
