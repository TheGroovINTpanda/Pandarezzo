package com.redpanda.pandarezzo;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.widget.ImageView;

public class Panda  {
    private ImageView pandaView;
    private AnimationDrawable pandaAnimation;
    private boolean wasCorrectBefore;

    /**
     * Constructeur de la classe Panda
     * @param activity
     */
    public Panda(Activity activity){
        this.pandaView = activity.findViewById(R.id.pandaMignon);
        this.wasCorrectBefore=false;
        pandaView.setBackgroundResource(R.drawable.panda_animation_correct);
        pandaAnimation = (AnimationDrawable) pandaView.getBackground();
    }

    /**
     * cette méthode anime le panda : il lève les bras
     * @param correct
     */
    public void animate(boolean correct) {
        if(correct && !(wasCorrectBefore)) {
            pandaAnimation.stop();
            pandaView.setBackgroundResource(R.drawable.panda_animation_correct);
            pandaAnimation=(AnimationDrawable)pandaView.getBackground();
            pandaAnimation.start();
            wasCorrectBefore = true;
        }
        else{
            if(!(correct) && wasCorrectBefore) {
                pandaAnimation.stop();
                pandaView.setBackgroundResource(R.drawable.panda_animation_incorrect);
                pandaAnimation = (AnimationDrawable) pandaView.getBackground();
                pandaAnimation.start();
                wasCorrectBefore = false;
            }
        }
    }
}
