package edu.temple.lab3;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ColorAdapter extends BaseAdapter {
    Context context;
    String myColorData[];

    public ColorAdapter (Context context, String myColorData[]){
        this.context = context;
        this.myColorData = myColorData;
    }

    @Override
    public int getCount() {
        return myColorData.length;
    }

    @Override
    public Object getItem(int position) {
        return myColorData[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView = new TextView(context);

        textView.setText(myColorData[position]);
        textView.setBackgroundColor(Color.parseColor(myColorData[position]));

        return textView;
    }
}
