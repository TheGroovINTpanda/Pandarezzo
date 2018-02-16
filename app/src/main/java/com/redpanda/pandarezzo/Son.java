package com.redpanda.pandarezzo;

import android.content.Context;
import android.content.Context;
import android.media.MediaPlayer;

public class Son {
    private Note note;
    private Context context;
    Son(Note n, Context c){
        note=n;
        context=c;
    }
    void play(){
//        MediaPlayer son = MediaPlayer.create(context,res.note.getName()); //** On créer une instance de MediaPlayer a partir du fichier audio correspondant à la note se trouvant dans les ressources
//        Ce fichier n'existe pas encore donc forcemment il y a des erreurs
//        son.start();
    }
    //**Cette methode permet de jouer le son de la note, elle sera activé dès que l'utilisateur apuyera sur le bouton

}
