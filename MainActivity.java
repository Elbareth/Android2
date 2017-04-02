package com.example.boruch.zadanie3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ok(View view){
        Context context;
        context=getApplicationContext();
        Toast toast = Toast.makeText(context,"To ten sam obrazek",Toast.LENGTH_SHORT) ;
    }
    public void pow(View view){
        Context context;
        context=getApplicationContext();
        Intent intent = new Intent(context,Zamiana.class);
        startActivity(intent);
    }
    public void pop(View view){
        Context context;
        context=getApplicationContext();
        Intent intent = new Intent(context,Zamiana.class);
        startActivity(intent);
    }
}
