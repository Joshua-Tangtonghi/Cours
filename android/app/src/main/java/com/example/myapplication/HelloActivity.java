package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

public class HelloActivity extends AppCompatActivity {

    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_activity);

        String v =getIntent().getStringExtra("user");
        this.tv = findViewById(R.id.tv_display);
        this.tv.setText(v);

    }
}
