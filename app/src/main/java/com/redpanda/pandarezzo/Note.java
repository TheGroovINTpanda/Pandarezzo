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
import java.util.ArrayList;

public class Note {
    private String name;
    //Caractéristique de la note
    private int x;
    private int y;
    private int heigth;
    private int width;
    //prochaine note à jouer
    private Boolean isnextNote;
    //view associé à la note
    private ImageView noteView;
    //id de la valeur de la note
    private int refNote;
    //Activity et Contexr
    private Activity activity;
    private Context context;

    public Note(String name, Activity activity, int id, int noteRef) {
        this.name = name;
//        this.setPosition(name);
        this.activity = activity;
        this.context = activity.getApplicationContext();
        this.noteView = activity.findViewById(id);
        this.refNote = noteRef;
        x = noteView.getLeft();
        y = noteView.getTop();
        heigth = noteView.getHeight();
        width = noteView.getWidth();
    }

    // TODO Renseigner les positions pour chaque notes dans xNote et yNote.
    public void setPosition(String name){
        int xNote;
        int yNode;
        switch (name){
            case "Do":
                xNote = 0;
                yNode = 0;
                break;
            case "Ré":
                xNote = 0;
                yNode = 0;
                break;
            case "Mi":
                xNote = 0;
                yNode = 0;
                break;
            case "Fa":
                xNote = 0;
                yNode = 0;
                break;
            case "Sol":
                xNote = 0;
                yNode = 0;
                break;
            case "La":
                xNote = 0;
                yNode = 0;
                break;
            case "Si":
                xNote = 0;
                yNode = 0;
                break;
            default:
                xNote = 0;
                yNode = 0;
        }
        setX(xNote);
        noteView.setX(xNote);
        setY(yNode);
        noteView.setY(yNode);
    }


    /** Permet de passser d'une note noire à une note colorée. A appeler si le bouton apuyé est correct. */

    public void switchColor(Boolean isPlayed){
        if(isPlayed){
            noteView.setImageResource(R.drawable.note_noir_resize);
        } else {
            noteView.setImageResource(refNote);
        }
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
        noteView.setX(getX());
        noteView.setY(getY());
    }
    /** Permet de positionner une note au coordonnées (x,y) */

    public void moveAbsolute(int x, int y){
        this.setX(x);
        this.setY(y);
        noteView.setX(x);
        noteView.setX(y);
    }

    public void init() {
//        AssetManager manager = activity.getAssets();
//        noteNoireBitmap = BitmapFactory.decodeStream(manager.open("la_noire.png"));
//        noteNoire.setImageBitmap(noteNoireBitmap);
//        activity.addContentView(noteImage, new LinearLayout.LayoutParams(100,100));
//        activity.setContentView(noteNoire);
    }

    public void getPosition(){
        System.out.println(noteView.getX());
        System.out.println(noteView.getY());
    }

    @Override
    public String toString() {
        return this.name;
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

    public Boolean getIsnextNote() { return isnextNote;}

    public String getName() {return name;}

    public void setX(int x) {this.x = x; }

    public void setY(int y) {this.y = y; }

    public void setIsnextNote(Boolean isnextNote) { this.isnextNote = isnextNote;}
}
