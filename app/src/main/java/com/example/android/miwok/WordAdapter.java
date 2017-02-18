package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by AJAY OMKAR on 06-Dec-16.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words,int colorId){
        super(context, 0, words);
        this.mColorResourceId = colorId;
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

            // get the object loacated at this position in yhe list
            Word currentWord = getItem(position);

            // find the text view in list_item.xml file with id miwok_text
            TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
            // get the miwok word from the current word object and set this text on name textview
            miwokTextView.setText(currentWord.getmMiwokTranslation());

            // find the text view in list_item.xml file with id default_text
            TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
            // get the english word from the current word object and set this text on name textview
            defaultTextView.setText(currentWord.getmDefaultTranslation());
        // find the image view in list_item xml file with id image
        ImageView imageview = (ImageView) listItemView.findViewById(R.id.image);
        //Get the image from current word object and set this image on name imageview
       if(currentWord.hasImage()){
           imageview.setImageResource(currentWord.getImageId());
           imageview.setVisibility(View.VISIBLE);
       }
        else{
           imageview.setVisibility(View.GONE);
       }
        // Set the theme color for the list item
                View textContainer = listItemView.findViewById(R.id.text_container);
                // Find the color that the resource ID maps to
                       int color = ContextCompat.getColor(getContext(), mColorResourceId);
                // Set the background color of the text container View
                        textContainer.setBackgroundColor(color);


            // return the whole list item layout so that it can be shown in list item view

        return listItemView;
        }


}
