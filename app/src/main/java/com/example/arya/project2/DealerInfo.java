package com.example.arya.project2;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

public class DealerInfo extends AppCompatActivity {

    ListView list;
    String[] bugatti_names, ferrari_names, jaguar_names, koenigsegg_names,lamborghini_names,maserati_names,porsche_names,tesla_names;
    String[] bugatti_address, ferrari_address,jaguar_address,koenigsegg_address,lamborghini_address,maserati_address,porsche_address,tesla_address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_of_dealer_info);

        list = (ListView) findViewById(R.id.listView);
        Resources res = getResources();
        bugatti_names = res.getStringArray(R.array.bugatti_dealer_names);
        bugatti_address = res.getStringArray(R.array.bugatti_dealer_address);
        ferrari_names = res.getStringArray(R.array.ferrari_dealer_names);
        ferrari_address = res.getStringArray(R.array.ferrari_dealer_address);
        jaguar_names = res.getStringArray(R.array.jaguar_dealer_names);
        jaguar_address = res.getStringArray(R.array.jaguar_dealer_address);
        koenigsegg_names = res.getStringArray(R.array.koenigsegg_dealer_names);
        koenigsegg_address = res.getStringArray(R.array.koenigsegg_dealer_address);
        lamborghini_names = res.getStringArray(R.array.lamborghini_dealer_names);
        lamborghini_address = res.getStringArray(R.array.lamborghini_dealer_address);
        maserati_names = res.getStringArray(R.array.maserati_dealer_names);
        maserati_address = res.getStringArray(R.array.maserati_dealer_address);
        porsche_names = res.getStringArray(R.array.porsche_dealer_names);
        porsche_address = res.getStringArray(R.array.porsche_dealer_address);
        tesla_names = res.getStringArray(R.array.tesla_dealer_names);
        tesla_address = res.getStringArray(R.array.tesla_dealer_address);

        Intent intent = getIntent();
        String position = intent.getStringExtra("positionSent");

        if (position.contentEquals("0")) {
            CustomAdapterForDealerInfo adapter1 = new CustomAdapterForDealerInfo(this, bugatti_names, bugatti_address);
            list.setAdapter(adapter1);
        }
        if (position.contentEquals("1")) {
            CustomAdapterForDealerInfo adapter1 = new CustomAdapterForDealerInfo(this, ferrari_names, ferrari_address);
            list.setAdapter(adapter1);
        }
        if (position.contentEquals("2")) {
            CustomAdapterForDealerInfo adapter1 = new CustomAdapterForDealerInfo(this, jaguar_names, jaguar_address);
            list.setAdapter(adapter1);
        }
        if (position.contentEquals("3")) {
            CustomAdapterForDealerInfo adapter1 = new CustomAdapterForDealerInfo(this, koenigsegg_names, koenigsegg_address);
            list.setAdapter(adapter1);
        }
        if (position.contentEquals("4")) {
            CustomAdapterForDealerInfo adapter1 = new CustomAdapterForDealerInfo(this, lamborghini_names, lamborghini_address);
            list.setAdapter(adapter1);
        }
        if (position.contentEquals("5")) {
            CustomAdapterForDealerInfo adapter1 = new CustomAdapterForDealerInfo(this, maserati_names, maserati_address);
            list.setAdapter(adapter1);
        }
        if (position.contentEquals("6")) {
            CustomAdapterForDealerInfo adapter1 = new CustomAdapterForDealerInfo(this, porsche_names, porsche_address);
            list.setAdapter(adapter1);
        }
        if (position.contentEquals("7")) {
            CustomAdapterForDealerInfo adapter1 = new CustomAdapterForDealerInfo(this, tesla_names, tesla_address);
            list.setAdapter(adapter1);
        }
    }
}