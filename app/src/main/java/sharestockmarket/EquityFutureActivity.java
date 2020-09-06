package com.example.nit.sharestockmarket;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class EquityFutureActivity extends AppCompatActivity {
    Animation bounce;
    ImageView equityfuture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equity_future);
        equityfuture=(ImageView)findViewById(R.id.imgequityfuture);
        equityfuture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentcontact=new Intent(EquityFutureActivity.this,ServicesActivity.class);
                startActivity(intentcontact);
            }
        });


        bounce = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce_bounce);
        bounce.setRepeatMode(Animation.INFINITE);
        ImageView iv = (ImageView) findViewById(R.id.searchGlass);
        iv.setAnimation(bounce);
    }

    public void bck_clicked(View v) {
        onBackPressed();
        this.finish();
    }

    public void onBackPressed() {
        // TODO Auto-generated method stub
        super.onBackPressed();
        this.finish();

    }
}
