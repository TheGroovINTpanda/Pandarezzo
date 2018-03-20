package com.redpanda.pandarezzo;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GameEngine {

    private Context context;

    private ArrayList<Note> notes;

    /**
    Context sert à get l'état actuel de l'application (le contexte dans lequel cette interface
    graphique est créée)
     */
    public GameEngine(Activity activity, ArrayList<Note> notes){
        this.context= activity.getApplicationContext();
        this.notes = notes;
    }

    /** Gére l'appuis sur un boutton. */

    public void touched(){
            notes.get(0).switchN(false);
    }



    /** Replace et remet la textures noire de toutes les notes. */

    public void reInit(){
        for(Note note : notes){
            note.switchN(true);
        }
    }

}
