package com.redpanda.pandarezzo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class Niveau extends AppCompatActivity{

    private String name;
    //background;
    private Bouton[] boutons;
    private int Score;
    private Panda panda;
    private boolean levelIsFinished;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.niveau);
        levelIsFinished=false;

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
        //TODO: savoir quand est-ce que le level est terminé, passer par le gameEngine?
        if(levelIsFinished){
            setContentView(R.layout.final_note_dancing);
            DancingNote dancingNote=new DancingNote(this);
            dancingNote.move();
            Button button = (Button) findViewById(R.id.nextLevel);
            button.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    Intent intent = new Intent(Niveau.this,Niveau.class);
                    startActivity(intent);
                    return false;
                }

            });

        }
    }
    @Override
    public String toString() {
        return name;
    }
}

