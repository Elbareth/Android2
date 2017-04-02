# Android2
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/activity_main"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:orientation="vertical">
    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Obrazki" />
    <ImageView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center_horizontal"
        android:src="@drawable/a"/>
    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:layout_gravity="center_horizontal">
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Poprzedni"
            android:id="@+id/poprzedni"
            android:onClick="pop"/>
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="OK"
            android:id="@+id/ok"
            android:onClick="ok"/>
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Powrót"
            android:id="@+id/Powrot"
            android:onClick="pow"/>
    </LinearLayout>

</LinearLayout>

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical" android:layout_width="match_parent"
    android:layout_height="match_parent">
    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Obrazki" />
    <ImageView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center_horizontal"
        android:src="@drawable/b"/>
    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:layout_gravity="center_horizontal">
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Poprzedni"
            android:id="@+id/poprzedni"
            android:onClick="pop"/>
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="OK"
            android:id="@+id/ok"
            android:onClick="ok"/>
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Powrót"
            android:id="@+id/Powrot"
            android:onClick="pow"/>
    </LinearLayout>

</LinearLayout>

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

<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.example.boruch.zadanie3">

    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:supportsRtl="true"
        android:theme="@style/AppTheme">
        <activity android:name=".MainActivity">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
        <activity android:name=".Zamiana">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    </application>

</manifest>
