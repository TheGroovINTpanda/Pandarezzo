package com.redpanda.pandarezzo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class GameEngine extends View {

    //Stylo graphique pour afficher la note
    private Paint paint =new Paint(Paint.ANTI_ALIAS_FLAG);


    private Note note;

    private int largeurimage;
    private int longueurimage;

    /*
    Context sert à get l'état actuel de l'application (le contexte dans lequel cette interface
    graphique est créée)
     */
    public GameEngine(Context context,Note note){
        super(context);
        this.note=note;
    }

    public void onDraw(Canvas canvas){
        super.onDraw(canvas);
        canvas.drawBitmap(note.getNotebitmap(),note.getX(),note.getY(),paint);
    }
    public void moveImage(int x,int y){
        note.setX(note.getX()+x);
        note.setY(note.getY()+y);
        if(note.getX()<0){
            note.setY(0);
        }
        else if(note.getX()+largeurimage>getWidth()){
            note.setX(getWidth()-largeurimage);
        }
        if(note.getY()<0){
            note.setY(0);
        }
        else if(note.getY()+longueurimage>getHeight()){
            note.setY(getHeight()-longueurimage);
        }
        //pour actualiser au niveau de l'activity
        this.invalidate();
    }

    public Note getNote() {
        return note;
    }
}
