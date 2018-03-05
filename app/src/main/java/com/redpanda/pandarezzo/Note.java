package com.redpanda.pandarezzo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Note {
    private String name;
    private int x;
    private int y;
    private Bitmap notebitmap;

    public Note(String name, int x, int y, Bitmap notebitmap){
        this.name=name;
        this.x=x;
        this.y=y;
        this.notebitmap=notebitmap;
    }

    public Bitmap getNotebitmap() {
        return notebitmap;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setNotebitmap(Bitmap notebitmap) {
        this.notebitmap = notebitmap;
    }
}
