package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ll = findViewById(R.id.ll);
        EtudiantAdapter adapter = new EtudiantAdapter(getEtudiants(),MainActivity.this);
        ll.setAdapter(adapter);

        ll.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                //Afficher l'age de l'etudiant dans un toast
                Etudiant e = (Etudiant)adapterView.getItemAtPosition(position);
                Toast.makeText(MainActivity.this, Integer.toString(e.getAge()), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public List<Etudiant> getEtudiants(){
        List<Etudiant> etudiants = new ArrayList<>();
        etudiants.add(new Etudiant("Doe","John",20));
        etudiants.add(new Etudiant("Doe","Jane",19));
        etudiants.add(new Etudiant("Doe","Jack",21));
        etudiants.add(new Etudiant("Doe","Jill",22));
        return etudiants;
    }
}