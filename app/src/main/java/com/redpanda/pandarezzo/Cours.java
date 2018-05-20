package com.redpanda.pandarezzo;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

/**
 * Created by samuel on 17/05/18.
 */

public class Cours extends AppCompatActivity {

    private int i = 0;
    private int[] views = {R.drawable.first_lesson_02, R.drawable.first_lesson_03, R.drawable.first_lesson_04, R.drawable.first_lesson_05,
            R.drawable.first_lesson_06, R.drawable.first_lesson_07, R.drawable.first_lesson_08, R.drawable.first_lesson_09,
            R.drawable.first_lesson_10, R.drawable.first_lesson_11, R.drawable.first_lesson_12, R.drawable.first_lesson_13, R.drawable.first_lesson_14,
            R.drawable.first_lesson_15, R.drawable.first_lesson_16, R.drawable.first_lesson_17, R.drawable.first_lesson_18, R.drawable.first_lesson_19,
            R.drawable.first_lesson_20, R.drawable.first_lesson_21, R.drawable.first_lesson_22, R.drawable.first_lesson_23, R.drawable.first_lesson_24,
            R.drawable.first_lesson_25, R.drawable.first_lesson_26
    };

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cours);

        ImageButton flecheTexte = findViewById(R.id.flech_texte);
        flecheTexte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.cours2);
                ImageButton flecheGauche = findViewById(R.id.fleche_gauche);
                flecheGauche.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ImageView cours = findViewById(R.id.cours);
                        if (0 <= i && i < views.length) {
                            cours.setImageResource(views[i]);
                            i--;

                        } else {
                            i = 0;
                            cours.setImageResource(views[i]);
                        }
                    }
                });

                ImageButton flecheDroite = findViewById(R.id.fleche_droite);
                flecheDroite.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ImageView cours = findViewById(R.id.cours);
                        if (0 <= i && i < views.length) {
                            cours.setImageResource(views[i]);
                            i++;
                        } else {
                            i = 0;
                            cours.setImageResource(views[i]);
                        }
                    }
                });
            }
        });
    }
}
