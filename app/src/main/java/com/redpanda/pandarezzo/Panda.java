package com.redpanda.pandarezzo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.ImageView;

public class Panda  {
    private ImageView pandaView;
    private int xpanda;
    private int ypanda;



    public Panda(){
    }



    public void animate(Boolean isPlayed){
        if(isPlayed) {
            pandaView.setImageResource(R.drawable.pitit_panda_tout_mignon);
        }
    }
}
