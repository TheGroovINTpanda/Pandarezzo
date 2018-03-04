package com.redpanda.pandarezzo;

import android.content.Context;
import android.content.Context;
import android.media.MediaPlayer;

public class Son {
    private Context context;
    private int refNote;

    /** Classe permettant de jouer le son d'une note donnée en paramètre grace à la méthode play */

    public Son(Context context, int refNote) {
        this.context = context;
        this.refNote = refNote;
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
