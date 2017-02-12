package com.example.arya.project2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

class CustomAdapterForExpandImageView extends BaseAdapter {
    private static final int PADDING = 8;
    private static final int WIDTH = 300;
    private static final int HEIGHT = 300;
    private Context context;
    Integer[] images={R.drawable.bugatti,R.drawable.ferrari,R.drawable.jaguar,R.drawable.koenigsegg,
            R.drawable.lamborghini,R.drawable.maserati,R.drawable.porsche,R.drawable.tesla};

    public CustomAdapterForExpandImageView(Context context){
        this.context = context;
    }
    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return images[position];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(images[position]);

        imageView.setLayoutParams(new GridView.LayoutParams(WIDTH, HEIGHT));
        imageView.setPadding(PADDING, PADDING, PADDING, PADDING);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return null;
    }
}
