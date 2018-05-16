package com.redpanda.pandarezzo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
//         setContentView(R.layout.niveau);

        Button button = (Button) findViewById(R.id.buttonstart);


        button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
//                TextView text = (TextView) findViewById(R.id.textView);
//                text.setText("Wait a moment");

                setContentView(R.layout.menu_selection);
                Button buttonNiveaux = (Button) findViewById(R.id.niveaux);
                Button buttonEditeur = (Button) findViewById(R.id.editeur);
                Button buttonResources = (Button) findViewById(R.id.resources);
                buttonNiveaux.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {

                        Intent intent = new Intent(MainActivity.this,
                                Niveau.class);
                        startActivity(intent);
                        return false;
                    }
                });

                buttonEditeur.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {

                        Intent intent = new Intent(MainActivity.this,
                                LevelEditor.class);
                        startActivity(intent);
                        return false;
                    }
                });

                buttonResources.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
//TODO Renseigner la classe.
                        Intent intent = new Intent(MainActivity.this,
                                Niveau.class);
                        startActivity(intent);
                        return false;
                    }
                });
                return false;
            }
        });






//        LinearLayout linearLayout = new LinearLayout(this);
//        linearLayout.addView(findViewById(R.id.buttonstart));
//        ImageView note = new ImageView(this);
//        note.setImageResource(R.drawable.la_noire);
//        linearLayout.addView(note);
//        linearLayout.addView(note);
//        setContentView(linearLayout);
//                setContentView(note);
    }

    //à chaque fois que la fenêtre passe en avant plan
    @Override
    protected void onResume() {
        super.onResume();
    }

    //à chaque fois qu'on quitte l'avant plan
    @Override
    protected void onPause() {
        super.onPause();
    }
}
