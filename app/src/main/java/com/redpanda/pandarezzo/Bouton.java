package com.redpanda.pandarezzo;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Bouton extends android.support.v7.widget.AppCompatImageButton {

    //visuel : Voir xml
    //position : Voir xml
    private String name;
    public ImageButton imageButton;
    private Son son;
    private Note note;
    private Activity activity;
    private Context context;

    private int buttonRef;
    private int sonRef;


    /**
     * Gère les actions du bouton dans la méthode onTouch.
     * Le constructeur se charge d'instancier la note associé au bouton.
     */

    public Bouton(final String name, final Activity activity, Context context, int buttonRef, int sonRef) {
        super(context);
        this.name = name;
        this.context = context;
        this.buttonRef = buttonRef;
        this.sonRef = sonRef;
        this.activity = activity;
        imageButton = (ImageButton) activity.findViewById(buttonRef);
        son = new Son(context, sonRef);

//        imageButton.setOnKeyListener(new View.OnKeyListener() {
//
//            @Override
//            public boolean onKey(View view, int i, KeyEvent keyEvent) {
//                son.play();
//                System.out.print(name);
//                TextView textView = (TextView) activity.findViewById(R.id.textViewDebug);
//                textView.setText(name);
//                return true;
//            }
//        });
//        TODO résoudre problème du double appuis avec le setKey
        imageButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                son.play();
                System.out.print(name);
                TextView textView = (TextView) activity.findViewById(R.id.textViewDebug);
                textView.setText(name);
            }
        });
    }

    public void clic() {

    }

    //commentaire plus détaillé
    @Override
    public String toString() {
        return name;
    }
}
