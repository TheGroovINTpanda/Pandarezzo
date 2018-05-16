package com.redpanda.pandarezzo;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.widget.ImageView;

public class Panda  {
    private ImageView pandaView;
    private AnimationDrawable pandaAnimation;




    public Panda(Activity activity){
        this.pandaView = activity.findViewById(R.id.pandaMignon);
        pandaView.setBackgroundResource(R.drawable.panda_animation_correct);
        pandaAnimation = (AnimationDrawable) pandaView.getBackground();
    }



    public void animate(boolean correct) {
        if(correct) {
            pandaAnimation.stop();
            pandaView.setBackgroundResource(R.drawable.panda_animation_correct);
            pandaAnimation=(AnimationDrawable)pandaView.getBackground();
            pandaAnimation.start();
        }
        else{
            pandaAnimation.stop();
            pandaView.setBackgroundResource(R.drawable.panda_animation_incorrect);
            pandaAnimation=(AnimationDrawable)pandaView.getBackground();
            pandaAnimation.start();
        }
    }

}
