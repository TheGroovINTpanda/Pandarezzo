package com.redpanda.pandarezzo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import java.util.ArrayList;

public class Niveau extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.niveau);

        int numLevel = getIntent().getIntExtra("level",0);

        /** Renseigner les portées des niveau. */

        ArrayList<String[]> niveaux = new ArrayList<>();

        String[] level0 = {"Mi", "Mi", "Fa", "Sol", "La", "Ré", "Do"};
        String[] level1 = {"Do", "Ré", "Mi", "Fa", "Sol", "La", "Si"};
        String[] level2 = {"Mi", "Ré", "Mi", "Si", "Ré", "Do", "La"};
        niveaux.add(level0);
        niveaux.add(level1);
        niveaux.add(level2);

        GameEngine engine = new GameEngine( this,this, niveaux, false, numLevel);


        Bouton d0 = new Bouton("Do", this, engine, R.id.do_bulle, R.raw.d0);
        Bouton re = new Bouton("Ré", this, engine, R.id.re_bulle, R.raw.re);
        Bouton mi = new Bouton("Mi", this, engine, R.id.mi_bulle, R.raw.mi);
        Bouton fa = new Bouton("Fa", this, engine, R.id.fa_bulle, R.raw.fa);
        Bouton sol = new Bouton("Sol", this, engine, R.id.sol_bulle, R.raw.sol);
        Bouton la = new Bouton("La", this, engine, R.id.la_bulle, R.raw.la);
        Bouton si = new Bouton("Si", this, engine, R.id.si_bulle, R.raw.si);
    }

    public void restart(int numLevel) {
        Intent intent = new Intent( Niveau.this,
                Niveau.class);
        intent.putExtra("level",numLevel);
        startActivity(intent);
    }
}

