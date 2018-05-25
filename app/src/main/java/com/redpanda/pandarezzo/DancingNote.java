package com.redpanda.pandarezzo;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
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
