package com.redpanda.pandarezzo;

import android.app.Activity;
import android.content.Context;

import java.util.ArrayList;

public class GameEngine {

    private Activity activity;
    private Context context;
    private ArrayList<Note> notes;
    private ArrayList<Note> nextNotes;
    /**
    Context sert à get l'état actuel de l'application (le contexte dans lequel cette interface
    graphique est créée)
     */
    public GameEngine(Activity activity){
        this.activity = activity;
        this.context= activity.getApplicationContext();
        this.notes = createNotes();
        this. nextNotes = new ArrayList<>() ;
    }

    /** Méthode pour créer les notes à fournir au GameEngine */

    public ArrayList<Note> createNotes(){
        ArrayList<Note> notes = new ArrayList<>();
        Note doNote = new Note("Do", activity, R.id.noteNoire, R.drawable.do_noire);
        Note reNote = new Note("Ré", activity, R.id.noteNoire1, R.drawable.re_noire);
        Note miNote = new Note("Mi", activity, R.id.noteNoire2, R.drawable.mi_noire);
        Note faNote = new Note("Fa", activity, R.id.noteNoire3, R.drawable.fa_noire);
        Note solNote = new Note("Sal", activity, R.id.noteNoire4, R.drawable.sol_noire);
        Note laNote = new Note("La", activity,  R.id.noteNoire5,R.drawable.la_noire);
        Note siNote = new Note("Si", activity,  R.id.noteNoire6,R.drawable.si_noire);

        notes.add(doNote);
        notes.add(reNote);
        notes.add(miNote);
        notes.add(faNote);
        notes.add(solNote);
        notes.add(laNote);
        notes.add(siNote);

        return notes;
    }

    /** Gére l'appuis sur un boutton. */

    public void touched(String bouton){
        if(bouton.equals("Do")){
            nextNotes.get(0).switchColor(false);
        }
        if(bouton.equals("La")){
            nextNotes.get(0).switchColor(false);
//                nextNotes.remove(0);
        }

        else {
            reInit();
        }
    }

    /**
     *  Permet de créer une portée, il sufit de rentrer le nom des notes dans l'ordre souhaité
     */

    public void createStave(String[] notes){
        for(String note : notes){
            switch (note){
                case "Do":
                    setNextNote(this.notes.get(0));
                    break;
                case "Ré":
                    setNextNote(this.notes.get(1));
                    break;
                case "Mi":
                    setNextNote(this.notes.get(2));
                    break;
                case "Fa":
                    setNextNote(this.notes.get(3));
                    break;
                case "Sol":
                    setNextNote(this.notes.get(4));
                    break;
                case "La":
                    setNextNote(this.notes.get(5));
                    break;
                case "Si":
                    setNextNote(this.notes.get(6));
                    break;
            }
        }
    }

    /** Gère la prochaine note à jouer. Permet de concevoir un niveau. */

    public void setNextNote(Note note){
        nextNotes.add(note);
    }

    /** Donne la prochaine note à jouer

    /** Replace et remet la textures noire de toutes les notes. */

    public void reInit(){
        for(Note note : notes){
            note.switchColor(true);
        }
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }

    public ArrayList<Note> getNextNotes() {
        return nextNotes;
    }

    public void setNotes(ArrayList<Note> notes) {
        this.notes = notes;
    }

    public void setNextNotes(ArrayList<Note> nextNotes) {
        this.nextNotes = nextNotes;
    }
}
