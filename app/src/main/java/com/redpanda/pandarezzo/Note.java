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
    //Caractéristique de la note
    private int x;
    private int y;
    private int heigth;
    private int width;
    //view associé à la note
    private ImageView noteView;
    //id de la valeur de la note
    private int refNote;
    //Activity et Contexr
    private Activity activity;
    private Context context;

    public Note(String name, Activity activity, Context context, int id, int noteRef) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.activity = activity;
        this.context = context;
        this.noteView = activity.findViewById(id);
        this.refNote = noteRef;
        x = noteView.getLeft();
        y = noteView.getTop();
        heigth = noteView.getHeight();
        width = noteView.getWidth();
    }

    /** Permet de passser d'une note noire à une note colorée. A appeler si le bouton apuyé est correct. */

    public void switchN(){
        noteView.setImageResource(refNote);
    }

    /** Permet de déplacer une note.
     *
     * @param x
     * @param y
     */

    public void move(int x,int y){
        this.setX(this.getX()+x);
        this.setY(this.getY()+y);
        if(this.getX()<0){
            this.setX(0);
        }
//        else if(this.getX()+this.getWidth()>getWidth()){
//            xthis=getWidth()-largeurimage;
//        }
        if(this.getY()<0){
            this.setY(0);
        }
//       else if(ythis+longueurimage>getHeight()){
//         ythis=getHeight()-longueurimage;
//        }
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

    public int getHeigth() {
        return heigth;
    }

    public int getWidth() {
        return width;
    }

    public void setX(int x) {this.x = x; }

    public void setY(int y) {this.y = y; }
}
