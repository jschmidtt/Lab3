package edu.temple.lab3;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CalendarView;
import android.widget.Spinner;

public class PaletteActivity extends AppCompatActivity {

    Spinner spinner;
    final private int REQUEST_CODE_MESSAGE_DISPLAY = 934;
    Boolean first = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);
        setTitle("Palette Activity");

        //Set Colors
        final String myColors[] = {"White","Red","Blue","Yellow","Green","Cyan","Gray"};

        //Find Spinner
        spinner = findViewById(R.id.spinner);

        //Adapter
        ColorAdapter adapter = new ColorAdapter(this,myColors);
        spinner.setAdapter(adapter);

        //Listener
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Check to see if first launch so does not instantly launch
                if(!first) {
                    String colorData = (String) parent.getItemAtPosition(position);
                    Intent startActivityIntent = new Intent(PaletteActivity.this, CanvasActivity.class);
                    startActivityIntent.putExtra(CanvasActivity.DATA_KEY, colorData);
                    startActivity(startActivityIntent);
                }
                first = false;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
