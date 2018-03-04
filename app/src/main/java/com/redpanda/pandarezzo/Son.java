package com.redpanda.pandarezzo;

import android.content.Context;
import android.media.MediaPlayer;

public class Son {
    private Context context;
    private int sonRef;

    /** Permet de jouer le son d'une note donnée en paramètre grace à la méthode play */

    public Son(Context context, int sonRef) {
        this.context = context;
        this.sonRef = sonRef;
    }

    /**Cette methode permet de jouer le son de la note, elle sera activé dès que l'utilisateur apuyera sur le bouton,
     * la methode est instenciée pour libérer la ressource dès que le fichier joué est terminé.
     *
     */


    public void play() {
        MediaPlayer son = MediaPlayer.create(context, R.raw.d0);//res.notes.bouton.name); //** On créer une instance de MediaPlayer a partir du fichier audio correspondant à la note se trouvant dans les ressources
        son.start();
        son.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            // Libérons les ressources lorsque la musique est terminée
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
    }

}
