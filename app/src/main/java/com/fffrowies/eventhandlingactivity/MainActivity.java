package com.fffrowies.eventhandlingactivity;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relativeLayout = findViewById(R.id.relativeLayout);
    }

    public void changeToBlack(View view) {
        relativeLayout.setBackgroundColor(Color.BLACK);
    }

    public void changeToGray(View view) {
        relativeLayout.setBackgroundColor(Color.GRAY);
    }
}
