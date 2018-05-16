package com.redpanda.pandarezzo;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.widget.ImageView;

public class Panda  {
    private ImageView pandaView;
    private AnimationDrawable pandaAnimationCorrect;
    private AnimationDrawable pandaAnimationIncorrect;




    public Panda(Activity activity){
        this.pandaView = activity.findViewById(R.id.pandaMignon);
        pandaAnimationCorrect = (AnimationDrawable) activity.findViewById(R.drawable)
    }



    public void animate(boolean correct) {
        if(correct) {
            pandaView.setBackgroundResource(R.drawable.panda_animation);
            pandaAnimationCorrect.start();
        }
        else{
            pandaView.setBackgroundResource(R.drawable.panda_animation);
            pandaAnimationCorrect.stop();
        }
    }

}
