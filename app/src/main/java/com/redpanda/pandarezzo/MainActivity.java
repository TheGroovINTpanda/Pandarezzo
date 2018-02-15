package com.redpanda.pandarezzo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;

import com.redpanda.pandarezzo.niveaux.Niveau1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//         setContentView(R.layout.niveau);

        Button button = (Button) findViewById(R.id.buttonstart);

        button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                TextView text = (TextView) findViewById(R.id.textView);
                text.setText("Bonjour monde !");
                Intent intent = new Intent(MainActivity.this,
                        Niveau1.class);
                startActivity(intent);
                return false;
            }
        });
    }
}
