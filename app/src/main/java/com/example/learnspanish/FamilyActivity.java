package com.example.learnspanish;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> familyList= new ArrayList<Word>();
        familyList.add(new Word("father","padre",R.drawable.family_father));
        familyList.add(new Word("mother","madre",R.drawable.family_mother));
        familyList.add(new Word("son","hijo",R.drawable.family_son));
        familyList.add(new Word("daughter","hija",R.drawable.family_daughter));
//        familyList.add(new Word("husband","esposo"));
//        familyList.add(new Word("wife","esposa"));
//        familyList.add(new Word("parents","padres"));
        familyList.add(new Word("brother","hermano",R.drawable.family_older_brother));
        familyList.add(new Word("sister","hermana",R.drawable.family_older_sister));
        familyList.add(new Word("grandfather","abuelo",R.drawable.family_grandfather));
        familyList.add(new Word("grandmother","abuela",R.drawable.family_grandmother));
//        familyList.add(new Word("grandson","nieto"));
//        familyList.add(new Word("granddaughter","nieta"));
//        familyList.add(new Word("cousin(male)","primo"));
//        familyList.add(new Word("cousin(female)","prima"));
//        familyList.add(new Word("niece","sobrina"));
//        familyList.add(new Word("nephew","sobrino"));
//        familyList.add(new Word("father-in-law","suegro"));
//        familyList.add(new Word("mother-in-law","suegra"));
//        familyList.add(new Word("stepfather","padrastro"));
//        familyList.add(new Word("stepmother","madrastra"));

        WordAdapter adapter= new WordAdapter(this, familyList,R.color.family);

        ListView listView = (ListView) findViewById(R.id.list_view);

        listView.setAdapter(adapter);

    }

}