package com.redpanda.pandarezzo;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.AnimationDrawable;
import android.view.View;
import android.widget.ImageView;

public class Panda  {
    private ImageView pandaView;
    private AnimationDrawable pandaAnimation;




    public Panda(Activity activity){
        this.pandaView = activity.findViewById(R.id.pandaMignon);
        pandaView.setBackgroundResource(R.drawable.panda_animation);
        pandaAnimation = (AnimationDrawable) pandaView.getBackground();
    }



    public void animate(boolean correct) {
        if(correct) {
            pandaAnimation.start();
        }
        else{
            pandaView.setImageResource(R.drawable.panda_leve_2_bras_00_resize);
        }
    }

}
