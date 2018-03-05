package com.redpanda.pandarezzo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class Panda extends View {
    private Paint paint =new Paint(Paint.ANTI_ALIAS_FLAG);
    private int xpanda;
    private int ypanda;

    //TODO: Un drawable du panda
    private Bitmap notebitmap= BitmapFactory.decodeResource(getResources(),R.drawable.redpanda);

    public Panda(Context context){
        super(context);

    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if(animation()){
            //TODO: un drawable du panda qui tire la langue (ou autre)
            notebitmap=BitmapFactory.decodeResource(getResources(),R.drawable.redpanda);
        }
        canvas.drawBitmap(notebitmap,xpanda,ypanda,paint);

    }

    /*
    TODO: réfléchir à un listener de Bouton pour savoir si la personne a bien répondu ou pas,
    l'animation peut soit être un panda qui tire la langue ou un panda qui sautille
     */
    public boolean animation(){
        return true;
    }
}
