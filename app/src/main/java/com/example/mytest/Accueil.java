package com.example.mytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Accueil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
    }

    public void ChangeActivityInscription(View view){ //action de la vue
        //pour passer d'une activité à une autre, nous utilisons un Intent
        Intent intent = new Intent(this, Inscription.class);
        startActivity(intent);

    }

    public void ChangeActivityEnseignant(View view){ //action de la vue
        //pour passer d'une activité à une autre, nous utilisons un Intent
        Intent intent = new Intent(this, Enseignant.class);
        startActivity(intent);

    }
}