package com.example.nit.sharestockmarket;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://www.dsij.in/research/stock-tips"));
        startActivity(intent);
    }
}
