package com.redpanda.pandarezzo;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.io.IOException;

public class Note {
    private String name;
    private int x;
    private int y;
    private ImageView noteImage;
    public ImageView noteNoire;
    private Bitmap noteNoireBitmap;
    private Activity activity;
    private Context context;

    public Note(String name, int x, int y, Activity activity, Context context, int noteRef) throws IOException {
        this.name = name;
        this.x = x;
        this.y = y;
        this.activity = activity;
        this.context = context;
        this.noteImage = new ImageView(context);
        this.noteNoire = new ImageView(context);
        noteNoire.setImageResource(R.drawable.la_noire);  //TODO Mettre une note noire       ;
        init();
    }

    public void init() throws IOException {
//        AssetManager manager = activity.getAssets();
//        noteNoireBitmap = BitmapFactory.decodeStream(manager.open("la_noire.png"));
//        noteNoire.setImageBitmap(noteNoireBitmap);
//        activity.addContentView(noteImage, new LinearLayout.LayoutParams(100,100));
//        activity.setContentView(noteNoire);
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
}
