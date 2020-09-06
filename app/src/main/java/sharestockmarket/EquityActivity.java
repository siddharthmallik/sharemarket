package com.example.nit.sharestockmarket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class EquityActivity extends AppCompatActivity {
    ImageView equity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equity);
        equity=(ImageView)findViewById(R.id.imgequity);
        equity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentcontact=new Intent(EquityActivity.this,ServicesActivity.class);
                startActivity(intentcontact);
            }
        });


    }
}
