package com.example.learnspanish;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class PhraseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> phraseList = new ArrayList<Word>();

        phraseList.add( new Word("Hello","Hola - (O-la)"));
        phraseList.add( new Word("How are you?","¿Cómo estás?"));
        phraseList.add( new Word("I’m fine and you?","¿Estoy bien, y tú?"));
        phraseList.add( new Word("What is your name?","¿Cuál es su nombre?\n"));
        phraseList.add( new Word("My name is ...","Me llamo ..."));
        phraseList.add( new Word("Nice to meet you","Mucho gusto - (MOO-choh GOO-stoh)"));
        phraseList.add( new Word("Thank you","Gracias "));
        phraseList.add( new Word("Welcome","Bienvenidos / Bienvenidas"));
        phraseList.add( new Word("Excuse me / Sorry","Disculpe / lo siento"));
        phraseList.add( new Word("Do you speak English?","Habla usted Inglés?"));
        phraseList.add( new Word("I don't speak Spanish well","No hablo bien español"));
        phraseList.add( new Word("I don't understand","Lo siento, no entiendo"));
        phraseList.add( new Word("Please say it again","Porfavor, digalo de nuevo"));
        phraseList.add( new Word("I Love You","Te quiero"));
        phraseList.add(new Word("Bye","Adiós"));


        WordAdapter adapter=new WordAdapter(this,phraseList,R.color.phrase);

        ListView listView=(ListView) findViewById(R.id.list_view);

        listView.setAdapter(adapter);
    }
}
