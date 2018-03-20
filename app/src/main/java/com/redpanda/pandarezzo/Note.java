package com.redpanda.pandarezzo;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.io.IOException;

public class Note {
    private String name;
    //position actuelle de la note
    private int x;
    private int y;
    //view associé à la note
    private ImageView noteView;
    //id de la valeur de la note
    private int refNote;
    //Activity et Contexr
    private Activity activity;
    private Context context;

    public Note(String name, int x, int y, Activity activity, Context context, int id, int noteRef) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.activity = activity;
        this.context = context;
        this.noteView = activity.findViewById(id);
        this.refNote = noteRef;
    }

    /** Permet de passser d'une note noire à une note colorée. A appeler si le bouton apuyé est correct */

    public void switchN(){
        noteView.setImageResource(refNote);
    }

    public void init() {
//        AssetManager manager = activity.getAssets();
//        noteNoireBitmap = BitmapFactory.decodeStream(manager.open("la_noire.png"));
//        noteNoire.setImageBitmap(noteNoireBitmap);
//        activity.addContentView(noteImage, new LinearLayout.LayoutParams(100,100));
//        activity.setContentView(noteNoire);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    public void setY(int y) {
        this.y = y;
    }
}
