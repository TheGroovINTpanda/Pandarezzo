package com.redpanda.pandarezzo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
//         setContentView(R.layout.niveau);

        final Button button = (Button) findViewById(R.id.buttonstart);


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

                        setContentView(R.layout.menu_niveau);


                        Button button1 = findViewById(R.id.niveau1);
                        button1.setOnTouchListener(new View.OnTouchListener() {
                            @Override
                            public boolean onTouch(View v, MotionEvent event) {

                                Intent intent = new Intent(MainActivity.this,
                                        Niveau.class);
                                intent.putExtra("level",0);
                                startActivity(intent);
                                return false;
                            }
                        });

                        Button button2 = findViewById(R.id.niveau2);
                        button2.setOnTouchListener(new View.OnTouchListener() {
                            @Override
                            public boolean onTouch(View v, MotionEvent event) {

                                Intent intent = new Intent(MainActivity.this,
                                        Niveau.class);
                                intent.putExtra("level",1);
                                startActivity(intent);
                                return false;
                            }
                        });

                        Button button3 = findViewById(R.id.niveau3);
                        button3.setOnTouchListener(new View.OnTouchListener() {
                            @Override
                            public boolean onTouch(View v, MotionEvent event) {

                                Intent intent = new Intent(MainActivity.this,
                                        Niveau.class);
                                intent.putExtra("level",2);
                                startActivity(intent);
                                return false;
                            }
                        });

                        Button button4 = findViewById(R.id.niveau4);
                        button4.setOnTouchListener(new View.OnTouchListener() {
                            @Override
                            public boolean onTouch(View v, MotionEvent event) {

                                Intent intent = new Intent(MainActivity.this,
                                        Niveau.class);
                                intent.putExtra("level",3);
                                startActivity(intent);
                                return false;
                            }
                        });

                        Button button5 = findViewById(R.id.niveau5);
                        button5.setOnTouchListener(new View.OnTouchListener() {
                            @Override
                            public boolean onTouch(View v, MotionEvent event) {

                                Intent intent = new Intent(MainActivity.this,
                                        Niveau.class);
                                intent.putExtra("level",5);
                                startActivity(intent);
                                return false;
                            }
                        });

                        Button button6 = findViewById(R.id.niveau6);
                        button6.setOnTouchListener(new View.OnTouchListener() {
                            @Override
                            public boolean onTouch(View v, MotionEvent event) {

                                Intent intent = new Intent(MainActivity.this,
                                        Niveau.class);
                                intent.putExtra("level",6);
                                startActivity(intent);
                                return false;
                            }
                        });
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
                        Intent intent = new Intent(MainActivity.this,
                                Cours.class);
                        startActivity(intent);
                        return false;
                    }
                });
                return false;
            }
        });
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
