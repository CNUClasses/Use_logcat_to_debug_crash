package com.example.use_logcat_to_debug_crash;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    /***
     * This app will crash on startup with no hint as to why
     * Unless you look at logcat.  It tells you exactly why
     * USE LOGCAT
     */
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b.setText("new text");
    }
}