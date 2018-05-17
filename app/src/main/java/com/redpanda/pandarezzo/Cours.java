package com.redpanda.pandarezzo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by samuel on 17/05/18.
 */

public class Cours extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cours);
        int[] views = new int[]{};
        //TODO remplir views
        ImageButton flecheTexte = (ImageButton) findViewById(R.id.flech_texte);
        flecheTexte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.cours2);
                ImageButton flecheGauche = (ImageButton) findViewById(R.id.fleche_gauche);
                ImageButton flecheDroite = (ImageButton) findViewById(R.id.fleche_droite);
            }
        });
    }
}
