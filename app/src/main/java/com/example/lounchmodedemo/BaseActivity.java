package com.example.lounchmodedemo;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity  extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Utils.add(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Utils.remove(this);

    }
}
