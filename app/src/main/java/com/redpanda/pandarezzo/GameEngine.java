package com.redpanda.pandarezzo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class GameEngine extends View {
    
    private Bitmap notebitmap= BitmapFactory.decodeResource(getResources(),R.drawable.fa_noire);
    //Stylo graphique pour afficher la note
    private Paint paint =new Paint(Paint.ANTI_ALIAS_FLAG);
    private int largeurimage;
    private int longueurimage;

    //position actuelle de la note
    int xNote;
    int yNote;

    /**
    Context sert à get l'état actuel de l'application (le contexte dans lequel cette interface
    graphique est créée)
     */
    public GameEngine(Context context){
        super(context);

    }

    public void onDraw(Canvas canvas){
        super.onDraw(canvas);
        canvas.drawBitmap(notebitmap,xNote,yNote,paint);
    }
    public void moveImage(int x,int y){
        xNote=xNote+x;
        yNote=yNote+y;
        if(xNote<0){
            xNote=0;
        }
        else if(xNote+largeurimage>getWidth()){
            xNote=getWidth()-largeurimage;
        }
        if(yNote<0){
            yNote=0;
        }
       else if(yNote+longueurimage>getHeight()){
         yNote=getHeight()-longueurimage;
        }
        //pour actualiser au niveau de l'activity
        this.invalidate();
    }



}
