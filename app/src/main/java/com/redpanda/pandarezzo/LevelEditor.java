package com.redpanda.pandarezzo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

/**
 * Created by sam on 15/05/18.
 */

public class LevelEditor extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.niveau);
//        Note do2Note = new Note("Do", this,  R.id.noteNoire7,R.drawable.do_noire);

        /** Renseigner la portée de ce niveau dans level. */


        ArrayList<String[]> niveaux= new ArrayList<>();
        String[] level = {"Do","Do","Do","Do","Do","Do","Do",};
        niveaux.add(level);

        GameEngine engine = new GameEngine(this, niveaux, true);


//TODO Redimentionner les notes et les implémenter
        Bouton d0 = new Bouton("Do", this, engine, R.id.do_bulle, R.raw.d0);
        Bouton re = new Bouton("Ré", this, engine, R.id.re_bulle, R.raw.re);
        Bouton mi = new Bouton("Mi", this, engine, R.id.mi_bulle, R.raw.mi);
        Bouton fa = new Bouton("Fa", this, engine, R.id.fa_bulle, R.raw.fa);
        Bouton sol= new Bouton("Sol", this, engine, R.id.sol_bulle, R.raw.sol);
        Bouton la = new Bouton("La", this, engine, R.id.la_bulle, R.raw.la);
        Bouton si = new Bouton("Si", this, engine, R.id.si_bulle, R.raw.si);



    }
}
