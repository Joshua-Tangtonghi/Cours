package com.example.myapplication2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

public class EtudiantAdapter extends BaseAdapter {
    private List<Etudiant> etudiants;
    private Context context;


    public EtudiantAdapter(List<Etudiant> etudiants, Context context){
        this.etudiants = etudiants;
        this.context = context;
    }
    @Override
    public int getCount() {
        return this.etudiants.size();
    }

    @Override
    public Object getItem(int position) {
        return this.etudiants.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater Inflater = LayoutInflater.from(this.context);
            convertView = Inflater.inflate(R.layout.row, null);
        }
        TextView tv_nom = convertView.findViewById(R.id.tv_nom);
        TextView tv_prenom = convertView.findViewById(R.id.tv_prenom);

        Etudiant current = (Etudiant) getItem(position);

        tv_nom.setText(current.getNom());
        tv_prenom.setText(current.getPrenom());

        return convertView;
    }
}
