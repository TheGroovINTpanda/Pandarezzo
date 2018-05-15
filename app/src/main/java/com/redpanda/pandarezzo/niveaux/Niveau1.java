package com.redpanda.pandarezzo.niveaux;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
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

    private AnimationDrawable pandaAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.niveau1);
//        Note do2Note = new Note("Do", this,  R.id.noteNoire7,R.drawable.do_noire);

        ImageView panda=findViewById(R.id.pandamignon);
        panda.setBackgroundResource(R.drawable.panda_animation);
        pandaAnimation = (AnimationDrawable) panda.getBackground();

        panda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pandaAnimation.start();
            }
        });

        GameEngine engine = new GameEngine(this);


        /** Renseigner la portée de ce niveau dans level. */

        String[] level = {"Do", "Ré", "Mi", "Fa", "Sol", "La", "Si"};

        engine.createStave(level);



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
