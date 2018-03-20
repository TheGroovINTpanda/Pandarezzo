package com.redpanda.pandarezzo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
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
    public GameEngine(Context context, ArrayList<Note> notes){
        this.context= context;
        this.notes = notes;
    }



}
