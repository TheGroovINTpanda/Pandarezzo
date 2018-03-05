package com.redpanda.pandarezzo;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;

import com.redpanda.pandarezzo.niveaux.Niveau1;

public class MainActivity extends AppCompatActivity {

    private GameEngine doEngine;
    private GameEngine reEngine;
    private GameEngine miEngine;
    private GameEngine faEngine;
    private GameEngine solEngine;
    private GameEngine laEngine;
    private GameEngine siEngine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//         setContentView(R.layout.niveau);
        //Je ne sais pas pourquoi en nommant la variable do, ca ne compile plus
        //TODO fix les positions des notes
        Note notedo=new Note("do",0,0, BitmapFactory.decodeResource(getResources(),R.drawable.do_noire));
        doEngine=new GameEngine(getApplicationContext(),notedo);
        Note re=new Note("re",0,0, BitmapFactory.decodeResource(getResources(),R.drawable.re_noire));
        reEngine=new GameEngine(getApplicationContext(),re);
        Note mi=new Note("mi",0,0, BitmapFactory.decodeResource(getResources(),R.drawable.mi_noire));
        miEngine=new GameEngine(getApplicationContext(),mi);
        Note fa=new Note("fa",0,0, BitmapFactory.decodeResource(getResources(),R.drawable.fa_noire));
        faEngine=new GameEngine(getApplicationContext(),fa);
        Note sol=new Note("mi",0,0, BitmapFactory.decodeResource(getResources(),R.drawable.sol_noire));
        solEngine=new GameEngine(getApplicationContext(),sol);
        Note la=new Note("mi",0,0, BitmapFactory.decodeResource(getResources(),R.drawable.la_noire));
        laEngine=new GameEngine(getApplicationContext(),la);
        Note si=new Note("si",0,0, BitmapFactory.decodeResource(getResources(),R.drawable.si_noire));
        siEngine=new GameEngine(getApplicationContext(),si);

        Button button = (Button) findViewById(R.id.buttonstart);

        button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                TextView text = (TextView) findViewById(R.id.textView);
                text.setText("Let's Rock !!");
                Intent intent = new Intent(MainActivity.this,
                        Niveau1.class);
                startActivity(intent);
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
