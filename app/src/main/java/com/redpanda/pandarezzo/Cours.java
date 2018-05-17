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
        ImageButton flecheDroite = (ImageButton) findViewById(R.id.flech_texte);
        flecheDroite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO mettre action du bouton
            }
        });
    }
}
