package com.redpanda.pandarezzo;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;

public class Note {
    private String name;
    //Caractéristique de la note
    private int x;
    private int y;
    private int heigth;
    private int width;
    //prochaine note à jouer
    private Boolean isnextNote;
    //view associé à la note
    private ImageView noteView;
    //id de la valeur de la note
    private int refNote;
    //Activity et Contexr
    private Activity activity;
    private Context context;

    public Note(String name, Activity activity, int id, int noteRef) {
        this.name = name;
//        this.setPosition(name);
        this.activity = activity;
        this.context = activity.getApplicationContext();
        this.noteView = activity.findViewById(id);
        this.refNote = noteRef;
        this.x = noteView.getLeft();
        this.y = noteView.getTop();
        this.heigth = noteView.getHeight();
        this.width = noteView.getWidth();
    }

    /**
     * Permet de placer les notes sur la portée. Est appelé par le gameEngine lors de la création d'une portée
     * @param position Position de la note sur la portée.
     */
    public void setPosition(int position, boolean editionMode){
        int pas_latteral =  120; //Eccart entre deux notes sur la portée.
        int pas_horrizontal = 40;
        int origine_latteral = 0;
        if (editionMode) {
            pas_latteral =  120; //Eccart entre deux notes sur la portée.
            pas_horrizontal = 220;
            origine_latteral = 100;
        }
        int xNote = origine_latteral + position * pas_latteral;
        int yNode = 0;             //Hauteur caractéristique d'une note.
        switch (name){
            case "Do":
                yNode = 0 + pas_horrizontal;
                break;
            case "Ré":
                yNode = -20+ pas_horrizontal;
                break;
            case "Mi":
                yNode = -36+ pas_horrizontal;
                break;
            case "Fa":
                yNode = -50 + pas_horrizontal;
                break;
            case "Sol":
                yNode = -70 + pas_horrizontal;
                break;
            case "La":
                yNode = -83 + pas_horrizontal;
                break;
            case "Si":
                yNode = -100 + pas_horrizontal;
                break;
        }
        setX(xNote);
        noteView.setX(xNote);
        setY(yNode);
        noteView.setY(yNode);
    }


    /** Permet de passser d'une note noire à une note colorée. A appeler si le bouton apuyé est correct. */

    public void switchColor(Boolean isPlayed){
        if(isPlayed){
            noteView.setImageResource(R.drawable.note_noir_resize);
        } else {
            noteView.setImageResource(refNote);
        }
    }

    /** Permet de déplacer une note.
     *
     * @param x
     * @param y
     */

    public void move(int x,int y){
        this.setX(this.getX()+x);
        this.setY(this.getY()+y);
        if(this.getX()<0){
            this.setX(0);
        }
//        else if(this.getX()+this.getWidth()>getWidth()){
//            xthis=getWidth()-largeurimage;
//        }
        if(this.getY()<0){
            this.setY(0);
        }
//       else if(ythis+longueurimage>getHeight()){
//         ythis=getHeight()-longueurimage;
//        }
        noteView.setX(getX());
        noteView.setY(getY());
    }
    /** Permet de positionner une note aux coordonnées (x,y) */

    public void moveAbsolute(int x, int y){
        this.setX(x);
        this.setY(y);
        noteView.setX(x);
        noteView.setX(y);
    }


    public void getPosition(){
        System.out.println(noteView.getX());
        System.out.println(noteView.getY());
    }

    @Override
    public String toString() {
        return this.name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHeigth() {
        return heigth;
    }

    public int getWidth() {
        return width;
    }

    public Boolean getIsnextNote() { return isnextNote;}

    public String getName() {return name;}

    public void setX(int x) {this.x = x; }

    public void setY(int y) {this.y = y; }

    public void setIsnextNote(Boolean isnextNote) { this.isnextNote = isnextNote;}
}
