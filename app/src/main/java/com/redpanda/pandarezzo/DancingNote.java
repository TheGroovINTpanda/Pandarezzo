package com.redpanda.pandarezzo;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class DancingNote extends AppCompatActivity{
    private ImageView noteView;
    private AnimationDrawable dancingNote;


    public DancingNote(Activity activity){
        this.noteView = activity.findViewById(R.id.dancingNote);
        //TODO: changer l'image de la noteView ansi que le fichier dancing_note.xml
        noteView.setBackgroundResource(R.drawable.dancing_note);
        dancingNote= (AnimationDrawable) noteView.getBackground();
    }


    public void move(){
        dancingNote.start();
    }
}
