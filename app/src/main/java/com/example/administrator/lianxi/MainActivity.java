package com.example.administrator.lianxi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.administrator.lianxi.asynctask.MyAsynctask;
public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list_view= (ListView) findViewById(R.id.list_view);
        MyAsynctask myAsynctask=new MyAsynctask(MainActivity.this,list_view);
        myAsynctask.execute();
    }
}
