package com.example.nit.sharestockmarket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class ServicesActivity extends AppCompatActivity {
    GridView gridView;

    static final String[] numbers = new String[] {"EQUITY", "FUTURE", "EQUITY FUTURE", "ENERGY", "BULLION", "COMMODITY", "ALL MCX", "PLATINUM","BaseMetals"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);
        gridView = (GridView) findViewById(R.id.gridviewservices);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, numbers);

        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                    switch (position){
                        case 0:
                            Intent i=new Intent(getApplicationContext(),EquityActivity.class);
                            startActivity(i);
                            break;
                        case 1:
                            Intent intent=new Intent(getApplicationContext(),FutureActivity.class);
                            startActivity(intent);
                            break;
                        case 2:
                            Intent inte=new Intent(getApplicationContext(),EquityFutureActivity.class);
                            startActivity(inte);
                            break;
                        case 3:
                            Intent en =new Intent(getApplicationContext(),EnergyActivity.class);
                            startActivity(en);
                            break;
                        case 4:
                            Intent bu= new Intent(getApplicationContext(),BullionActivity.class);
                            startActivity(bu);
                            break;
                        case 5:
                            Intent com=new Intent(getApplicationContext(),CommodityActivity.class);
                            startActivity(com);
                            break;
                        case 6:
                            Intent all=new Intent(getApplicationContext(),AllMcxActivity.class);
                            startActivity(all);
                            break;
                        case 7:
                            Intent plat=new Intent(getApplicationContext(),PlatinumActivity.class);
                            startActivity(plat);
                            break;
                        case 8:
                            Intent base=new Intent(getApplicationContext(),BasemetalsActivity.class);
                            startActivity(base);
                            break;
                    }
                //Toast.makeText(getApplicationContext(),((TextView) v).getText(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}