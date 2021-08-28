package com.example.learnspanish;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private int mImageResourceId;

    public WordAdapter(Activity context, ArrayList<Word> numbersList,int imageResourceID) {
        super(context,0,numbersList);
        mImageResourceId = imageResourceID;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       //Check if an existing view is being reused, or inflate the view
        View listItemView=convertView;
        if(listItemView==null) {
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        //Get the object located at this position in the list
        Word currentWord = getItem(position);

        //TextView in the Lit_item.xml layout with ID spanish_textview
        TextView spanishTextView=(TextView) listItemView.findViewById(R.id.spanish_textview);
        //Get the Spanish translation from the currentWord object and set text on spanish textview
        spanishTextView.setText(currentWord.getSpanishTranslation());

        //TextView in the List_item.xml with ID default_textview
        TextView defaultTextView=(TextView) listItemView.findViewById(R.id.default_textview);
        //Get the default translation from the currentWord object and set text on default textview
        defaultTextView.setText(currentWord.getDefaultTranslation());

        //ImageView in the list_item.xml with ID image_view
        ImageView imageImageView= (ImageView) listItemView.findViewById(R.id.image_view);
        //check if image is provided or not
        if(currentWord.hasImage()) {
            //get the imageId from the currentWord object  and set image on image imageview
            imageImageView.setImageResource(currentWord.getImageId());
            //make sure view is visible
            imageImageView.setVisibility(View.VISIBLE);
        }
        else {
            //hide the imageView
            imageImageView.setVisibility(View.GONE);
        }

        //Set theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        //find color resource ID
        int color= ContextCompat.getColor(getContext(),mImageResourceId);
        //set background color to the text container view
        textContainer.setBackgroundColor(color);

        //return whole list item layout, so that it can be shown in listview
        return listItemView;
    }

}
