package com.example.arya.project2;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainGrid extends AppCompatActivity {
    GridView grid;
    String[] make;
    String[]links;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_grid);

        grid= (GridView) findViewById(R.id.gridView);

        Resources res=getResources();
        make=res.getStringArray(R.array.makes);
        links=res.getStringArray(R.array.links);

        int [] images={R.drawable.bugatti,R.drawable.ferrari,R.drawable.jaguar,R.drawable.koenigsegg,
                        R.drawable.lamborghini,R.drawable.maserati,R.drawable.porsche,R.drawable.tesla};

        CustomAdapterForMainGrid adapter= new CustomAdapterForMainGrid(this,make,images);
        grid.setAdapter(adapter);
        registerForContextMenu(grid);

        grid.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                        Intent intent=new Intent(getApplicationContext(),ExpandImageView.class);
                        intent.putExtra("positionImage", position);
                        startActivity(intent);
                    }
                }
        );
    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.car_menu, menu);

    }

    @Override
    public boolean onContextItemSelected(MenuItem item){
        AdapterView.AdapterContextMenuInfo info= (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        switch (item.getItemId()){
            case R.id.menu_1:
                int pos1=info.position;
                String str=String.valueOf(pos1);
                int post=Integer.parseInt(str);
                Intent intent2= new Intent(this,ExpandImageView.class);
                intent2.putExtra("positionImage",post);
                startActivity(intent2);
            return true;
            case R.id.menu_2:
                int pos=info.position;
                Uri aUri= Uri.parse(links[pos]) ;
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(aUri);
                startActivity(intent);
                return true;
            case R.id.menu_3:
                int res= info.position;
                Intent intent1=new Intent(this,DealerInfo.class);
                intent1.putExtra("positionSent",String.valueOf(res));
                startActivity(intent1);
                return true;
            default:
                return false;
        }

    }
}

