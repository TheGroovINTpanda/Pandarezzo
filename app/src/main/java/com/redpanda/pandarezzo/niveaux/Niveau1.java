package com.redpanda.pandarezzo.niveaux;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.redpanda.pandarezzo.Niveau;
import com.redpanda.pandarezzo.R;

public class Niveau1 extends Niveau {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.niveau1);

        ImageButton d0 = (ImageButton) findViewById(R.id.do_bulle);
        ImageButton re = (ImageButton) findViewById(R.id.re_bulle);
        ImageButton mi = (ImageButton) findViewById(R.id.mi_bulle);
        ImageButton fa = (ImageButton) findViewById(R.id.fa_bulle);
        ImageButton sol = (ImageButton) findViewById(R.id.sol_bulle);
        ImageButton la = (ImageButton) findViewById(R.id.la_bulle);
        ImageButton si = (ImageButton) findViewById(R.id.si_bulle);

        d0.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                MediaPlayer son = MediaPlayer.create(getApplicationContext(), R.raw.d0);//res.notes.bouton.name); //** On créer une instance de MediaPlayer a partir du fichier audio correspondant à la note se trouvant dans les ressources
                son.start();
                son.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        mediaPlayer.release();
                    }
                });
                TextView textView = (TextView) findViewById(R.id.textViewDebug);
                textView.setText("Do");
                return false;
            }
        });

        re.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                TextView textView = (TextView) findViewById(R.id.textViewDebug);
                textView.setText("Ré");
                return false;
            }
        });

        mi.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                TextView textView = (TextView) findViewById(R.id.textViewDebug);
                textView.setText("Mi");
                return false;
            }
        });

        fa.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                TextView textView = (TextView) findViewById(R.id.textViewDebug);
                textView.setText("Fa");
                return false;
            }
        });

        sol.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                TextView textView = (TextView) findViewById(R.id.textViewDebug);
                textView.setText("Sol");
                return false;
            }
        });

        la.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                TextView textView = (TextView) findViewById(R.id.textViewDebug);
                textView.setText("La");
                return false;
            }
        });

        si.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                TextView textView=(TextView) findViewById(R.id.textViewDebug);
                textView.setText("Si");
                return false;
            }
        });




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
