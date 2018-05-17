package com.redpanda.pandarezzo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by samuel on 17/05/18.
 */

public class Cours extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cours);
        Button FlecheDroite = (Button) findViewById(R.id.flech_texte);
        FlecheDroite.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.i("OC_RSS", "Cliquer ici");
            }
        });

    }
}
