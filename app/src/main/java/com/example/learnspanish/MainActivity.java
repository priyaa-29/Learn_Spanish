package com.example.learnspanish;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //View that shows the number category
        TextView numbers=(TextView) findViewById(R.id.numbers);
        //Set clickListener on that View
        numbers.setOnClickListener(new OnClickListener(){

            public void onClick(View view) {
                Intent numbersIntent= new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });

        //View that shows the family members category
        TextView family=(TextView) findViewById(R.id.family);
        //Set clickListener on that View
        family.setOnClickListener(new OnClickListener(){

            public void onClick(View view) {
                Intent familyIntent= new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(familyIntent);
            }
        });

        //View that shows the colors category
        TextView colors= (TextView) findViewById(R.id.colors);
        //Set clickListener on that View
        colors.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorsIntent= new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });

        //View that shows the phrase category
        TextView phrase= (TextView) findViewById(R.id.phrase);
        //Set clickListener on that View
        phrase.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phraseIntent= new Intent(MainActivity.this,PhraseActivity.class);
                startActivity(phraseIntent);
            }
        });
    }
}