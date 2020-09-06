package com.example.nit.sharestockmarket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.ImageView;

public class FreeTrialActivity extends AppCompatActivity {
    WebView freeltrail;
    ImageView freetrail;
    String url = "https://docs.google.com/forms/d/e/1FAIpQLSfNpR2ycx0_guJ2AqBldG8bqSX45u4wLCFKLWglRj5V8HerJQ/viewform?usp=pp_url&entry.2005620554&entry.1079067692&entry.1045781291&entry.1902343026";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_free_trial);
        freeltrail = (WebView) findViewById(R.id.freetrialWebView);
        freeltrail.loadUrl(url);
//        this.requestWindowFeature(Window.FEATURE_PROGRESS);
//        this.setProgressBarVisibility(true);
        freetrail = (ImageView) findViewById(R.id.imgfreetrail);
        freeltrail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentcontact = new Intent(FreeTrialActivity.this, MainActivity.class);
                startActivity(intentcontact);
            }
        });

    }
    public void bck_clicked(View v) {
        onBackPressed();
    }


}

