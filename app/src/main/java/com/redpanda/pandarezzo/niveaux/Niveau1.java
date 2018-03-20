package com.redpanda.pandarezzo.niveaux;

import android.app.ActionBar;
import android.app.Activity;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.redpanda.pandarezzo.Bouton;
import com.redpanda.pandarezzo.GameEngine;
import com.redpanda.pandarezzo.Niveau;
import com.redpanda.pandarezzo.Note;
import com.redpanda.pandarezzo.R;
import com.redpanda.pandarezzo.Son;

import java.io.IOException;
import java.util.ArrayList;

public class Niveau1 extends Niveau {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.niveau1);

        ArrayList<Note> notes = new ArrayList<>();
        Note laNote = new Note("La", this,  R.id.noteNoire1,R.drawable.la_noire);
        Note doNote = new Note("Do", this, R.id.noteNoire, R.drawable.do_noire);
        notes.add(laNote);
        notes.add(doNote);

        GameEngine engine = new GameEngine(this, notes);
        engine.setNextNote(laNote);
        engine.setNextNote(doNote);

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
