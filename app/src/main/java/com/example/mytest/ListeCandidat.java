package com.example.mytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ListeCandidat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_candidat);
    }

    public void ChangeActivityStatistique(View view){ //action de la vue
        //pour passer d'une activité à une autre, nous utilisons un Intent
        Intent intent = new Intent(this, Statistique.class);
        startActivity(intent);

    }

    public void ChangeActivityAccueil(View view){ //action de la vue
        //pour passer d'une activité à une autre, nous utilisons un Intent
        Intent intent = new Intent(this, Accueil.class);
        startActivity(intent);

    }
}