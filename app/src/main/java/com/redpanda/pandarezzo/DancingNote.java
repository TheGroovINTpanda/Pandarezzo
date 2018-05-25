package com.redpanda.pandarezzo;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

public class DancingNote {
    private ImageView noteView;
    private AnimationDrawable dancingNote;
    private RotateAnimation rotateNote;
    private AnimationSet animSet;


    /**
     * Constructeur de DancingNote
     * @param activity
     */
    public DancingNote(Activity activity){
        this.noteView = activity.findViewById(R.id.dancingNote);
        noteView.setBackgroundResource(R.drawable.dancing_note);
        dancingNote= (AnimationDrawable) noteView.getBackground();
        animSet=new AnimationSet(true);
        rotateNote=new RotateAnimation(0f,360f,Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotateNote.setDuration(750);
        rotateNote.setInterpolator(new DecelerateInterpolator());
        animSet.addAnimation(rotateNote);
    }

    /**
     * Cette méthode fait en sorte que la note tourne autour d'elle-même et que l'animation de
     * l'applaudissement commence
      */
    public void move(){
        noteView.startAnimation(animSet);
        dancingNote.start();
    }

    /**
     * Cette méthode joue les sons du niveau quand celui-ci est terminé (en même temps que la note s'anime)
     * @param levelPlayed
     * @param activity
     */
    public void playSound(String[] levelPlayed,Activity activity){
        try {
            for (String note : levelPlayed) {
                switch (note) {
                    case "Do":
                        MediaPlayer sonD0 = MediaPlayer.create(activity.getApplicationContext(), R.raw.d0);
                        sonD0.start();
                        sonD0.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            // Libérons les ressources lorsque la musique est terminée
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.release();
                            }
                        });
                    case "Ré":
                        MediaPlayer sonRe = MediaPlayer.create(activity.getApplicationContext(), R.raw.re);
                        sonRe.start();
                        sonRe.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            // Libérons les ressources lorsque la musique est terminée
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.release();
                            }
                        });
                    case "Mi":
                        MediaPlayer sonMi = MediaPlayer.create(activity.getApplicationContext(), R.raw.mi);
                        sonMi.start();
                        sonMi.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            // Libérons les ressources lorsque la musique est terminée
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.release();
                            }
                        });
                    case "Fa":
                        MediaPlayer sonFa = MediaPlayer.create(activity.getApplicationContext(), R.raw.fa);
                        sonFa.start();
                        sonFa.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            // Libérons les ressources lorsque la musique est terminée
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.release();
                            }
                        });
                    case "Sol":
                        MediaPlayer sonSol = MediaPlayer.create(activity.getApplicationContext(), R.raw.sol);
                        sonSol.start();
                        sonSol.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            // Libérons les ressources lorsque la musique est terminée
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.release();
                            }
                        });
                    case "La":
                        MediaPlayer sonLa = MediaPlayer.create(activity.getApplicationContext(), R.raw.la);
                        sonLa.start();
                        sonLa.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            // Libérons les ressources lorsque la musique est terminée
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.release();
                            }
                        });
                    case "Si":
                        MediaPlayer sonSi = MediaPlayer.create(activity.getApplicationContext(), R.raw.si);
                        sonSi.start();
                        sonSi.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            // Libérons les ressources lorsque la musique est terminée
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.release();
                            }
                        });

                }
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    /**
     * Cette méthode play le son d'applaudissement quand la note est animée
     * @param activity
     */
    public void applaude(Activity activity){
        MediaPlayer applaude = MediaPlayer.create(activity.getApplicationContext(),R.raw.applaude);
        applaude.start();
        applaude.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            // Libérons les ressources lorsque la musique est terminée
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
    }

}
