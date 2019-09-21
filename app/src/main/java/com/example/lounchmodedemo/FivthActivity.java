package com.example.lounchmodedemo;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.List;

public class FivthActivity extends BaseActivity {

    @RequiresApi(api = Build.VERSION_CODES.Q)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fivth);
    }

    public void startMain(View view) {
        startActivity(new Intent(this,MainActivity.class));
    }

    public void startSecond(View view) {
        startActivity(new Intent(this,SecondActivity.class));
    }

    public void startThird(View view) {
        startActivity(new Intent(this,ThirdActivity.class));
    }

    public void startFivth(View view) {
        startActivity(new Intent(this,FourthActivity.class));
    }
}
