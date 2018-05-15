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




    public Panda(Activity activity){
        this.pandaView = activity.findViewById(R.id.pandamignon);
    }



    public void animate(Boolean correct){
        if(correct) {
                pandaView.setImageResource(R.drawable.panda_leve_2_bras_00_resize);
                pandaView.setImageResource(R.drawable.panda_leve_2_bras_01_resize);
                pandaView.setImageResource(R.drawable.panda_leve_2_bras_02_resize);
                pandaView.setImageResource(R.drawable.panda_leve_2_bras_03_resize);
                pandaView.setImageResource(R.drawable.panda_leve_2_bras_04_resize);
                pandaView.setImageResource(R.drawable.panda_leve_2_bras_05_resize);
                pandaView.setImageResource(R.drawable.panda_leve_2_bras_06_resize);
        }
        else{
            pandaView.setImageResource(R.drawable.panda_leve_2_bras_00_resize);
        }
    }
}
