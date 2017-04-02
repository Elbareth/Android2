package com.example.boruch.zadanie3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Boruch on 2017-04-02.
 */

public class Zamiana extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zamiana);
    }
    public void ok(View view){
        Context context;
        context=getApplicationContext();
        Toast toast = Toast.makeText(context,"To ten sam obrazek",Toast.LENGTH_SHORT) ;
    }
    public void pow(View view){
        Context context;
        context=getApplicationContext();
        Intent intent = new Intent(context,MainActivity.class);
        startActivity(intent);
    }
    public void pop(View view){
        Context context;
        context=getApplicationContext();
        Intent intent = new Intent(context,MainActivity.class);
        startActivity(intent);
    }
}
