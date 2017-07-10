package com.example.android.buttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainJava extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main_java);
    }

    // android:onClick="buttonHandler" in XML design file
    public void buttonHandler(View v) {

        switch (v.getId()) {
            case R.id.b1:
                Log.i("Bozman", "Button1 was clicked!");
                break;


            case R.id.b2:
                Log.i("Bozman", "Button2 was clicked!");
                break;
        }


    }
}