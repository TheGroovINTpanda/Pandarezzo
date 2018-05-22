package com.redpanda.pandarezzo;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.widget.ImageView;

public class DancingNote {
    private ImageView noteView;
    private AnimationDrawable dancingNote;


    public DancingNote(Activity activity){
        this.noteView = activity.findViewById(R.id.dancingNote);
        noteView.setBackgroundResource(R.drawable.dancing_note);
        dancingNote= (AnimationDrawable) noteView.getBackground();
    }


    public void move(){
        dancingNote.start();
    }
}
