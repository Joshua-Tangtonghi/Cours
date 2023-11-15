package com.example.myapplication;

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
    private Button myButton2;

    private Button myButton3;

    private TextView edt_s;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.myButton1 = findViewById(R.id.myButton1);

        this.myButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hello World!", Toast.LENGTH_SHORT).show();
            }
        });

        this.myButton2 = findViewById(R.id.myButton2);

        this.myButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exitApp();
            }
        });

        this.myButton3 = findViewById(R.id.myButton3);
        this.edt_s = findViewById(R.id.edt_s);

        this.myButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String contenu = edt_s.getText().toString();
                Intent otherActivity = new Intent(MainActivity.this, HelloActivity.class);
                otherActivity.putExtra("user", contenu);
                if (!contenu.isEmpty()) {
                    startActivity(otherActivity);
                } else {
                    edt_s.setError("Veuillez saisir un nom");
                }

            }
        });
    }


    public void exitApp() {
        new AlertDialog.Builder(MainActivity.this)
                .setTitle(getResources().getString(R.string.popup_titre))
                .setMessage(getResources().getString(R.string.popup_message))
                .setPositiveButton(getResources().getString(R.string.popup_oui), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {

                        finish();

                    }
                })

                .setNegativeButton(getResources().getString(R.string.popup_non), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {

                    }
                })
                .setCancelable(false)
                .show();
    }

    @Override
    public void onBackPressed() {
        exitApp();
    }
}


