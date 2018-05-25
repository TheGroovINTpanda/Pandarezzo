package com.redpanda.pandarezzo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import java.util.ArrayList;

public class Niveau extends AppCompatActivity{

    ArrayList<String[]> niveaux = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.niveau);

        int numLevel = getIntent().getIntExtra("level",0);

        /** Renseigner les portées des niveau. */



        String[] level0 = {"Mi", "Mi", "Fa", "Sol", "La", "Ré", "Do"};
        String[] level1 = {"Do", "Ré", "Mi", "Fa", "Sol", "La", "Si"};
        String[] level2 = {"Mi", "Ré", "Mi", "Si", "Ré", "Do", "La"};
        String[] level3 = {"Do", "Si", "La", "Sol", "Mi", "Do", "Si"};
        String[] level4 = {"Do", "Do", "Fa", "Fa", "La", "La", "Sol"};
        String[] level5 = {"Mi", "Mi", "Mi", "Do", "Sol", "Mi", "Do"};
        String[] level6 = {"Ré", "Mi", "Fa", "Do", "La", "Sol", "Mi"};
        niveaux.add(level0);
        niveaux.add(level1);
        niveaux.add(level2);
        niveaux.add(level3);
        niveaux.add(level4);
        niveaux.add(level5);
        niveaux.add(level6);



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

    public String[] getLevelPlayed(int indiceLevelPlayed) {
        return niveaux.get(indiceLevelPlayed);
    }

}

