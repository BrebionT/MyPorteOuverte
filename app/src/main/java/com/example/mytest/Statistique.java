package com.example.mytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Statistique extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistique);
    }

    public void ChangeActivityListeCandidat(View view){ //action de la vue
        //pour passer d'une activité à une autre, nous utilisons un Intent
        Intent intent = new Intent(this, ListeCandidat.class);
        startActivity(intent);

    }

    public void ChangeActivityAccueil(View view){ //action de la vue
        //pour passer d'une activité à une autre, nous utilisons un Intent
        Intent intent = new Intent(this, Accueil.class);
        startActivity(intent);

    }
}