package com.example.samuel.pandarezzo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.example.samuel.pandarezzo.niveaux.Niveau1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.niveau1);
        Niveau1 niveau = new Niveau1("Exercice");

    }

}
