package com.redpanda.pandarezzo;

public abstract class Niveau {

    String name;
    //background;
    Portee portee;
    Bouton[] boutons;
    int Score;
    Panda panda;

    public abstract void update();

    public abstract void setScore();

    @Override
    public String toString() {
        return name;
    }
}
