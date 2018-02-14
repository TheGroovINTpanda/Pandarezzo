package com.example.samuel.pandarezzo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public abstract class Niveau extends Activity {

    private String name;
    //background;
    private Portee portee;
    private Bouton[] boutons;
    private int Score;
    private Panda panda;

    private ImageButton dO;

    public Niveau(String name) {

        dO = (ImageButton) findViewById(R.id.do_bulle);
        dO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = (TextView) findViewById(R.id.textView2);
                textView.setText("BLOP");
            }
        });
    }

    public abstract void update();

    public abstract void setScore();

    @Override
    public String toString() {
        return name;
    }
}
