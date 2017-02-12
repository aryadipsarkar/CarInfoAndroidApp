package com.example.arya.project2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

class CustomAdapterForDealerInfo extends ArrayAdapter<String> {
    Context context;
    String[] names;
    String[] addresses;

    CustomAdapterForDealerInfo(Context context, String[] names, String[] addresses) {
        super(context, R.layout.single_row_dealer_info,R.id.textView2,names);
        this.context=context;
        this.names=names;
        this.addresses=addresses;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.single_row_dealer_info, parent, false);

        TextView name= (TextView) row.findViewById(R.id.textView2);
        TextView address= (TextView) row.findViewById(R.id.textView3);

        name.setText(names[position]);
        address.setText(addresses[position]);
        return row;
    }
}