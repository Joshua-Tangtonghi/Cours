package com.example.tp2;


import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

public class HelloActivity extends AppCompatActivity {



    private Button myButton3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.hello_activity);



        this.myButton3 = findViewById(R.id.myButton3);


        this.myButton3.setOnClickListener(v1 -> {
            Intent otherActivity = new Intent(HelloActivity.this, MainActivity.class);
            startActivity(otherActivity);
        });


    }

}

