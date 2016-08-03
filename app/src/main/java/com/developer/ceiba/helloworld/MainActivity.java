package com.developer.ceiba.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListeners();
    }

    public void Plus(View v){
        setCounter(++counter);
    }

    public void setCounter(int counter){
        TextView txt = (TextView)findViewById(R.id.numClicks);
        String txtCount = Integer.toString(counter);
        if(counter == 1) {
            txtCount += " Click!";
        }else{
            txtCount += " Clicks";
        }
        txt.setText(txtCount);
    }

    public void addListeners(){
        Button btn = (Button) findViewById(R.id.mybtn);
        assert btn != null;
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Plus(v);
            }
        });
    }

    public void setImage(){
        ImageView img = (ImageView) findViewById(R.id.imageViewLogo);
        img.setImageResource(R.drawable.logo);
    }
}
