package com.redpanda.pandarezzo.niveaux;
import android.app.Activity;
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
        setContentView(R.layout.niveau);

        ImageButton do_bulle = (ImageButton) findViewById(R.id.imageButton_do);
        do_bulle.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                TextView textView = (TextView) findViewById(R.id.textView2);
                textView.setText("Vive les Panda !!");
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
