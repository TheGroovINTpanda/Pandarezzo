package com.redpanda.pandarezzo;

import android.content.Context;
import android.content.Context;
import android.media.MediaPlayer;

public class Son {
    private Note note;
    Son(Note n){
        note=n;
    }
    void play(){
        MediaPlayer son = MediaPlayer.create(getApplicationcontext(),res.notes.note.getName()); //** On créer une instance de MediaPlayer a partir du fichier audio correspondant à la note se trouvant dans les ressources
//        Ce fichier n'existe pas encore donc forcemment il y a des erreurs
        son.start();
        son.setOnCompletionListener(new OnCompletionListener()
        {
            @Override
            // Libérons les ressources lorsque la musique est terminée
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
    }
    //**Cette methode permet de jouer le son de la note, elle sera activé dès que l'utilisateur apuyera sur le bouton, la methode est instencier pour libérer la ressource ès que le fichier joué est terminé.

}
