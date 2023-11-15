package com.example.tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Set;

public class MainActivity extends AppCompatActivity {


    private Button myButton1;

    private Button myButton3;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.myButton1 = findViewById(R.id.myButton1);

        this.myButton1.setOnClickListener(v -> {
            Intent otherActivity = new Intent(MainActivity.this, HelloActivity.class);

            startActivity(otherActivity);
        });

        this.myButton3 = findViewById(R.id.myButton3);

        this.myButton3.setOnClickListener(v -> {
            Intent otherActivity = new Intent(MainActivity.this, ProfilActivity.class);

            startActivity(otherActivity);
        }
        );
    }
}
