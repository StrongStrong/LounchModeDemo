package com.example.lounchmodedemo;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.util.Log;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static List<Context> list=new ArrayList<Context>();
    public static void add(Context context){
        list.add(context);

        for(Context c:list){
            Log.i("LouchMode","taskid:"+((Activity)c).getTaskId()+"      "+c);
        }

    }
    public static void remove(Context context){
        list.remove(context);

        for(Context c:list){
            Log.i("LouchMode","taskid:"+((Activity)c).getTaskId()+"      "+c);
        }

    }

}
