package com.redpanda.pandarezzo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Note {
    private String name;
    private double x;
    private double y;
    private Bitmap notebitmap;

    public Note(String name, int x, int y, Bitmap notebitmap){
        this.name=name;
        this.x=x;
        this.y=y;
        this.notebitmap=notebitmap;
    }

}
