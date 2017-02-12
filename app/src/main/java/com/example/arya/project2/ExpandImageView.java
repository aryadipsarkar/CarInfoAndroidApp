package com.example.arya.project2;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;


public class ExpandImageView extends AppCompatActivity implements View.OnClickListener {
    int position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.expand_image_layout);
        Intent intent = getIntent();
        position = intent.getExtras().getInt("positionImage");
        CustomAdapterForExpandImageView imageAdapter = new CustomAdapterForExpandImageView(this);

        ImageView imageView = (ImageView) findViewById(R.id.imageView2);
        int resId = imageAdapter.images[position];
        imageView.setImageResource(resId);

        imageView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Resources res=getResources();
        String[] links=res.getStringArray(R.array.links);

        Uri URL= Uri.parse(links[position]) ;
        Intent intent1 = new Intent(Intent.ACTION_VIEW);
        intent1.setData(URL);
        startActivity(intent1);
    }
}

