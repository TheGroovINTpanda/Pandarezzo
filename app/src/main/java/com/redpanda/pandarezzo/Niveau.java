package com.redpanda.pandarezzo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class Niveau extends AppCompatActivity{

    private String name;
    //background;
    private Portee portee;
    private Bouton[] boutons;
    private int Score;
    private Panda panda;

    public abstract void update();

    public abstract void setScore();

    @Override
    public String toString() {
        return name;
    }
}
