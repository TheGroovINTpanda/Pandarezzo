package com.redpanda.pandarezzo;

public class Bouton {

    String name;
    //visuel : Voir xml
    //position : Voir xml
    Son son;
    Son son2gi;
    Note note;

    public void clic() {

    }

    //commentaire plus détaillé
    @Override
    public String toString() {
        return name;
    }
}
