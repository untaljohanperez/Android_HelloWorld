package com.developer.ceiba.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    public int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.mybtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Plus(v);
            }
        });

        contador = 0;
        TextView txt = (TextView)findViewById(R.id.texto);
        String tex = "My contador is: " + Integer.toString(contador);
        txt.setText(tex);
    }



    public void Plus(View v){
        TextView txt = (TextView)findViewById(R.id.texto);
        contador++;
        txt.setText("My contador is: " + Integer.toString(contador));
    }
}
