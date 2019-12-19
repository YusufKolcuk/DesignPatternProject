package com.example.asus.designpatternproject;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.example.asus.designpatternproject.Database.DatabaseHelper;

public class DataSingleton extends AppCompatActivity {
    private static DataSingleton dataSingleton;
    private DataSingleton(){

    }
    public static synchronized DataSingleton dataCreate(){
        if(dataSingleton==null){
            dataSingleton=new DataSingleton();
        }
        return dataSingleton;

    }
    public DatabaseHelper getData(Context context){
        DatabaseHelper databaseHelper=new DatabaseHelper(context);
        return databaseHelper;

    }
}
