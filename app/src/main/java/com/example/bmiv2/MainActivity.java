package com.example.bmiv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    private final Handler mHand = new Handler();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        Intent ToLogin = new Intent(this,login.class);

        mHand.postDelayed((Runnable) this, 3000);
        startActivity(ToLogin);


*/

      //  finish();
    }
}