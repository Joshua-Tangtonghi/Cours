package com.example.tp2;


import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

public class ProfilActivity extends AppCompatActivity {



    private Button myButton3;

    private String textView;
    private TextView edt_s;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {






        super.onCreate(savedInstanceState);

        setContentView(R.layout.profil_activity);




        this.myButton3 = findViewById(R.id.myButton3);


        this.edt_s = findViewById(R.id.edt_s);

        SharedPreferences sharedPreferences = getSharedPreferences("MaBaseDeDonnees", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedPreferences.edit();

        this.myButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String contenu = edt_s.getText().toString();
                editor.putString("user", contenu);
                editor.putString("cle1", "valeur2");
                editor.putInt("cle2", 42);


                editor.apply();


                String valeur1 = sharedPreferences.getString("cle1", "");
                int valeur2 = sharedPreferences.getInt("cle2", 0);
                String valeur3 = sharedPreferences.getString("user", "");

                TextView textView = findViewById(R.id.textview);
                textView.setText("Valeur 1 : " + valeur1 + "\n"
                        + "Valeur 2 : " + valeur2 + "\n"
                        + "Valeur 3 : " + valeur3);

            }
        });






    }

}

