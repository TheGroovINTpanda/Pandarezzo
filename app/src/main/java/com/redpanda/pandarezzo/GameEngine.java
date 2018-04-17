package com.redpanda.pandarezzo;

import android.app.Activity;
import android.content.Context;

import java.util.ArrayList;

public class GameEngine {

    private Activity activity;
    private Context context;
    private String[] nameNextNotes;
    private ArrayList<Note> nextNotes; //liste des notes constituant un morceau.
    private int ip; //indice portée donnant l'avancée dans le morceau.
    private Panda panda;

    /**
    Context sert à get l'état actuel de l'application (le contexte dans lequel cette interface
    graphique est créée)
     On renseigne dans un tableau le nom des notes qui vont constituer notre niveau.
     */
    public GameEngine(Activity activity, String[] nameNextNotes){
        this.activity = activity;
        this.context= activity.getApplicationContext();
        this.nameNextNotes = nameNextNotes;
        this.nextNotes = new ArrayList<>() ;
        this.ip = 0;
        this.panda=new Panda(activity);
        createStave();
    }

    /** Méthode appelé par le gameEngine pour créer de nouvelle notes */

    public Note createNote(String name){
        switch (name){
            case "Do":
                return new Note("Do", activity, R.id.noteNoire, R.drawable.do_noire_resize);
            case "Ré":
                return new Note("Ré", activity, R.id.noteNoire1, R.drawable.re_noire_resize);
            case "Mi":
                return new Note("Mi", activity, R.id.noteNoire2, R.drawable.mi_noire_resize);
            case "Fa":
                return new Note("Fa", activity, R.id.noteNoire3, R.drawable.fa_noire_resize);
            case "Sol":
                return new Note("Sol", activity, R.id.noteNoire4, R.drawable.sol_noire_resize);
            case "La":
                return new Note("La", activity,  R.id.noteNoire5,R.drawable.la_noire_resize);
            case "Si":
                return new Note("Si", activity,  R.id.noteNoire6,R.drawable.si_noire_resize);
            default:
                System.out.println("Nom de note incorrect.");
                return null;
        }
    }

    /** Gére l'appuis sur un boutton. */

    public void touched(String bouton) {
        if (ip < getNextNotes().size()) {
            if (bouton.equals("Do") && getNextNotes().get(ip).getName().equals("Do")) {
                getNextNotes().get(ip).switchColor(false);
                panda.animate(true);
                ip++;
            } else if (bouton.equals("Ré") && getNextNotes().get(ip).getName().equals("Ré")) {
                getNextNotes().get(ip).switchColor(false);
                panda.animate(true);
                ip++;
            } else if (bouton.equals("Mi") && getNextNotes().get(ip).getName().equals("Mi")) {
                getNextNotes().get(ip).switchColor(false);
                panda.animate(true);
                ip++;
            } else if (bouton.equals("Fa") && getNextNotes().get(ip).getName().equals("Fa")) {
                getNextNotes().get(ip).switchColor(false);
                panda.animate(true);
                ip++;
            } else if (bouton.equals("Sol") && getNextNotes().get(ip).getName().equals("Sol")) {
                getNextNotes().get(ip).switchColor(false);
                panda.animate(true);
                ip++;
            } else if (bouton.equals("La") && getNextNotes().get(ip).getName().equals("La")) {
                getNextNotes().get(ip).switchColor(false);
                panda.animate(true);
                ip++;
            } else if (bouton.equals("Si") && getNextNotes().get(ip).getName().equals("Si")) {
                getNextNotes().get(ip).switchColor(false);
                panda.animate(true);
                ip++;
            }
            else {
                System.out.print("Error");
                reInit();
                panda.animate(false);
            }

        } else {
            reInit();
            panda.animate(false);
        }
    }

    /**
     *  Permet de créer une portée, il sufit de rentrer le nom des notes dans l'ordre souhaité
     */

    public void createStave(){
        for(String note : nameNextNotes){
            setNextNote(createNote(note));
        }
    }

    /** Gère la prochaine note à jouer. Permet de concevoir un niveau. */

    public void setNextNote(Note note){
        nextNotes.add(note);
    }

    /** Donne la prochaine note à jouer

    /** Replace et remet la textures noire de toutes les notes. */

    public void reInit(){
        for(Note note: nextNotes){
            note.switchColor(true);
        }
    }

    public ArrayList<Note> getNextNotes() {
        return nextNotes;
    }


    public void setNextNotes(ArrayList<Note> nextNotes) {
        this.nextNotes = nextNotes;
    }
}
