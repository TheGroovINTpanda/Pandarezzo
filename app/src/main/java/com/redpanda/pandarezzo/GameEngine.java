package com.redpanda.pandarezzo;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class GameEngine {

    private Context context;

    private ArrayList<Note> notes;

    private ArrayList<Note> nextNotes;
    /**
    Context sert à get l'état actuel de l'application (le contexte dans lequel cette interface
    graphique est créée)
     */
    public GameEngine(Activity activity, ArrayList<Note> notes){
        this.context= activity.getApplicationContext();
        this.notes = notes;
        this. nextNotes = new ArrayList<>() ;
    }

    /** Gére l'appuis sur un boutton. */

    public void touched(String bouton){
            if(bouton.equals("La")){
                nextNotes.get(0).switchColor(false);
//                nextNotes.remove(0);
            }
            else if(bouton.equals("Do")){
                nextNotes.get(1).switchColor(false);
            }
            else {
                reInit();
            }
    }

    /** Gère la prochaine note à jouer. Permet de concevoir un niveau. */

    public void setNextNote(Note note){
        nextNotes.add(note);
    }

    /** Donne la prochaine note à jouer

    /** Replace et remet la textures noire de toutes les notes. */

    public void reInit(){
        for(Note note : notes){
            note.switchColor(true);
        }
    }

}
