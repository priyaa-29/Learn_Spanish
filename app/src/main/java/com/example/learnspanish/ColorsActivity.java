package com.example.learnspanish;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> colorsList = new ArrayList<Word>();

        colorsList.add(new Word("Red","Rojo",R.drawable.color_red));
        //colorsList.add(new Word("Blue","Azul"));
        //colorsList.add(new Word("Orange","Anaranjado"));
        colorsList.add(new Word("Green","Verde",R.drawable.color_green));
        colorsList.add(new Word("Yellow","Amarillo",R.drawable.color_mustard_yellow));
        //colorsList.add(new Word("Purple","Morado"));
        //colorsList.add(new Word("Pink","Rosado"));
        colorsList.add(new Word("Black","Negro",R.drawable.color_black));
        colorsList.add(new Word("Brown","Marron",R.drawable.color_brown));

        WordAdapter adapter=new WordAdapter(this,colorsList,R.color.colors);

        ListView listView=(ListView) findViewById(R.id.list_view);

        listView.setAdapter(adapter);
    }
}
