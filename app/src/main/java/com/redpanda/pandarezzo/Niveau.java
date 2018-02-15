package com.redpanda.pandarezzo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

public abstract class Niveau extends Activity{

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
