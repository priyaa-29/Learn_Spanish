package com.example.learnspanish;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> numbersList = new ArrayList<Word>();

        numbersList.add(new Word("one","uno",R.drawable.number_one));
        numbersList.add(new Word("two","dos",R.drawable.number_two));
        numbersList.add(new Word("three","tres",R.drawable.number_three));
        numbersList.add(new Word("four","cuatro",R.drawable.number_four));
        numbersList.add(new Word("five","cinco",R.drawable.number_five));
        numbersList.add(new Word("six","seis",R.drawable.number_six));
        numbersList.add(new Word("seven","siete",R.drawable.number_seven));
        numbersList.add(new Word("eight","ocho",R.drawable.number_eight));
        numbersList.add(new Word("nine","nueve",R.drawable.number_nine));
        numbersList.add(new Word("ten","diez",R.drawable.number_ten));

        WordAdapter adapter= new WordAdapter(this, numbersList,R.color.numbers);

        ListView listView = (ListView) findViewById(R.id.list_view);

        listView.setAdapter(adapter);
    }

}