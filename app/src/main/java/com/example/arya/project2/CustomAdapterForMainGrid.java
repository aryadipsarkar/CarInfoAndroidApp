package com.example.arya.project2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

class CustomAdapterForMainGrid extends ArrayAdapter<String> {
    Context context;
    int[] car_images;
    String[] car_make;

    CustomAdapterForMainGrid(Context context,String[] make, int[]images) {
        super(context,R.layout.single_row_of_main_grid,R.id.textView, make);
        this.context=context;
        this.car_images=images;
        this.car_make=make;

    }

    public View getView(int position, View convertView, ViewGroup parent){

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.single_row_of_main_grid, parent, false);
        ImageView myImage= (ImageView)row.findViewById(R.id.imageView);
        TextView myText= (TextView) row.findViewById(R.id.textView);

        Picasso.with(context)
                .load(car_images[position])
                .resize(550,300)
                .into(myImage);

        myText.setText(car_make[position]);
        return row;
    }
}
