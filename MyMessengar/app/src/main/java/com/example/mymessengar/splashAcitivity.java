package com.example.mymessengar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.mymessengar.utils.FirebaseUtil;

public class splashAcitivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_acitivity);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(FirebaseUtil.isLoggedIn()){
                    startActivity(new Intent(splashAcitivity.this,MainActivity.class));
                }else{
                    startActivity(new Intent(splashAcitivity.this,Login_num.class));
                }
                finish();
            }
        },1000);
    }
}