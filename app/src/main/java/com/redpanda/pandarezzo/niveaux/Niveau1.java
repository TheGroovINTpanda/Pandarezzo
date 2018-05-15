package com.redpanda.pandarezzo.niveaux;


import android.os.Bundle;

import com.redpanda.pandarezzo.Bouton;
import com.redpanda.pandarezzo.GameEngine;
import com.redpanda.pandarezzo.Niveau;
import com.redpanda.pandarezzo.R;

public class Niveau1 extends Niveau {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.niveau1);
//        Note do2Note = new Note("Do", this,  R.id.noteNoire7,R.drawable.do_noire);

        /** Renseigner la portée de ce niveau dans level. */

//        String[] level = {"Do", "Ré", "Mi", "Fa", "Sol", "La", "Si"};
//        String[] level = {"Si","Mi","La","Ré","Sol","Do","Fa"};
        String[] level = {"Mi","Mi","Fa","Sol","La","Ré","Do"};

        GameEngine engine = new GameEngine(this, level, false);



        //TODO Redimentionner les notes et les implémenter
        Bouton d0 = new Bouton("Do", this, engine, R.id.do_bulle, R.raw.d0);
        Bouton re = new Bouton("Ré", this, engine, R.id.re_bulle, R.raw.re);
        Bouton mi = new Bouton("Mi", this, engine, R.id.mi_bulle, R.raw.mi);
        Bouton fa = new Bouton("Fa", this, engine, R.id.fa_bulle, R.raw.fa);
        Bouton sol= new Bouton("Sol", this, engine, R.id.sol_bulle, R.raw.sol);
        Bouton la = new Bouton("La", this, engine, R.id.la_bulle, R.raw.la);
        Bouton si = new Bouton("Si", this, engine, R.id.si_bulle, R.raw.si);


    }

    @Override
    public void update() {

    }

    @Override
    public void setScore() {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
