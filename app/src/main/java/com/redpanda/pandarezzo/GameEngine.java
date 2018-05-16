package com.redpanda.pandarezzo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class GameEngine {

    private Activity activity;
    private Context context;
    private String[] nameNextNotes;
    private ArrayList<Note> nextNotes; //liste des notes constituant un morceau.
    private int ip; //indice portée donnant l'avancée dans le morceau.
    private Panda panda;
    private boolean editionMode;
    private int noteToComplete; //Nombre de note pour compléter le morceau.

    /**
    Context sert à get l'état actuel de l'application (le contexte dans lequel cette interface
    graphique est créée).
     On renseigne dans un tableau le nom des notes qui vont constituer notre niveau.
     Un mode edition est maintenant disponible.
     */
    public GameEngine(Activity activity, String[] nameNextNotes, boolean editionMode){
        this.activity = activity;
        this.context= activity.getApplicationContext();
        this.nameNextNotes = nameNextNotes;
        this.nextNotes = new ArrayList<>() ;
        this.ip = 0;
        this.panda=new Panda(activity);
        this.editionMode = editionMode;
        this.noteToComplete = 0;
        if (!editionMode)
            createStave();
    }

    /** Méthode appelé par le gameEngine pour créer de nouvelle notes.
     *
     * @param name
     * @param i numéro de la note qu'on veut créer
     * @return
     */

    public Note createNote(String name, int i){
        int[] noteID = {R.id.noteNoire, R.id.noteNoire1, R.id.noteNoire2, R.id.noteNoire3, R.id.noteNoire4,
                R.id.noteNoire5, R.id.noteNoire6};
        switch (name){
            case "Do":
                return new Note("Do", activity, noteID[i], R.drawable.do_noire_resize);
            case "Ré":
                return new Note("Ré", activity, noteID[i], R.drawable.re_noire_resize);
            case "Mi":
                return new Note("Mi", activity, noteID[i], R.drawable.mi_noire_resize);
            case "Fa":
                return new Note("Fa", activity, noteID[i], R.drawable.fa_noire_resize);
            case "Sol":
                return new Note("Sol", activity, noteID[i], R.drawable.sol_noire_resize);
            case "La":
                return new Note("La", activity,  noteID[i], R.drawable.la_noire_resize);
            case "Si":
                return new Note("Si", activity,  noteID[i], R.drawable.si_noire_resize);
            default:
                System.out.println("Nom de note incorrect.");
                return null;
        }
    }

    /** Gére l'appuis sur un boutton. Si on est dans le mode edition on compose la partition, sinon
     * on apprend le morceau en le jouant.
     * */

    public void touched(String bouton) {
        if (editionMode){
            nameNextNotes[noteToComplete] = bouton;
            noteToComplete++;
            if (noteToComplete == 7){
                edition();
            }
        } else {
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
                } else {
                    System.out.print("Error");
                    reInit();
                    panda.animate(false);
                }
            } else {
                endLevel();
            }
        }
    }

    /**
     *  Permet de créer une portée, il sufit de rentrer le nom des notes dans l'ordre souhaité
     */

    public void createStave(){
        for(String note : nameNextNotes){
            int i = nextNotes.size();
            setNextNote(createNote(note,i));
            nextNotes.get(i).setPosition(i,editionMode);
        }
    }

    /**
     * Permet d'éditer un niveau avant de le jouer.
     */
    private void edition(){
        createStave();
        this.editionMode=false;
    }

    /**
     * Méthode à appeler à la fin du niverau pour lancé l'écran de score.
     */

    private void endLevel() {
        activity.setContentView(R.layout.final_note_dancing);
        DancingNote dancingNote = new DancingNote(activity);
        dancingNote.move();
        Button button = (Button) activity.findViewById(R.id.nextLevel);
        button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent intent = new Intent(activity, DancingNote.class);
                activity.startActivity(intent);
                return false;
            }

        });
    }

    /** Gère la prochaine note à jouer. Permet de concevoir un niveau. */

    public void setNextNote(Note note){
        nextNotes.add(note);
    }

    /** Donne la prochaine note à jouer

    /** Replace et remet la textures noire de toutes les notes. */

    public void reInit(){
        ip=0; //on recommence la portée si on fait une erreur
        for(Note note: nextNotes){
            note.switchColor(true);
        }
    }
    public ArrayList<Note> getNextNotes() {
        return nextNotes;
    }

}
