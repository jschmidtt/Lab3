package edu.temple.lab3;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CanvasActivity extends AppCompatActivity {

    final  static public String DATA_KEY = "data_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);
        setTitle("Canvas Activity");

        Intent intent = getIntent();
        String myColor = intent.getStringExtra(DATA_KEY);

        getWindow().getDecorView().setBackgroundColor(Color.parseColor(myColor));

    }
}
