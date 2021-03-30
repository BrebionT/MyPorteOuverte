package com.example.mytest.vue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.mytest.R;

public class Inscription extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);
    }

<<<<<<< HEAD:app/src/main/java/com/example/mytest/vue/Inscription.java

=======
    public void ChangeActivityAccueil(View view){ //action de la vue
        //pour passer d'une activité à une autre, nous utilisons un Intent
        Intent intent = new Intent(this, Accueil.class);
        startActivity(intent);

    }
>>>>>>> e7ac97d04180f79e7f918172cb4bf1c78f19b531:app/src/main/java/com/example/mytest/Inscription.java
}