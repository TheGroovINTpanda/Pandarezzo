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
        pandaView.setImageResource(R.drawable.pitit_panda_tout_mignon);
    }



    public void animate(Boolean correct){
        if(correct) {
            pandaView.setImageResource(R.drawable.panda_deux_bras_leves_resize);
        }
        else{
            pandaView.setImageResource(R.drawable.pitit_panda_tout_mignon);
        }
    }
}
