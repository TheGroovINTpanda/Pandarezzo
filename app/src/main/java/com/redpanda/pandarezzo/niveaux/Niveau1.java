package com.redpanda.pandarezzo.niveaux;
import android.app.Activity;
import android.os.Bundle;

import com.redpanda.pandarezzo.Niveau;
import com.redpanda.pandarezzo.R;

public class Niveau1 extends Niveau {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.niveau);
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
