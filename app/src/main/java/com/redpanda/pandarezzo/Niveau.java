package com.redpanda.pandarezzo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Niveau extends AppCompatActivity{

    private String name;
    //background;
    private Portee portee;
    private Bouton[] boutons;
    private int Score;
    private Panda panda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.niveau);


        /** Renseigner la portée de ce niveau dans level. */

        String[] level = {"Mi", "Mi", "Fa", "Sol", "La", "Ré", "Do"};

        GameEngine engine = new GameEngine(this, level, false);


        Bouton d0 = new Bouton("Do", this, engine, R.id.do_bulle, R.raw.d0);
        Bouton re = new Bouton("Ré", this, engine, R.id.re_bulle, R.raw.re);
        Bouton mi = new Bouton("Mi", this, engine, R.id.mi_bulle, R.raw.mi);
        Bouton fa = new Bouton("Fa", this, engine, R.id.fa_bulle, R.raw.fa);
        Bouton sol = new Bouton("Sol", this, engine, R.id.sol_bulle, R.raw.sol);
        Bouton la = new Bouton("La", this, engine, R.id.la_bulle, R.raw.la);
        Bouton si = new Bouton("Si", this, engine, R.id.si_bulle, R.raw.si);
    }

    @Override
    public String toString() {
        return name;
    }
}
