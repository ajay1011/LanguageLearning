package com.example.android.miwok;

/**
 * Created by AJAY OMKAR on 06-Dec-16.
 * custom class to show default and miwok translation of word
 */

public class Word {
    // states of the class
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static  final  int NO_IMAGE_PROVIDED = -1;
    private int mAudioResourceId;
    // constructor of the class
    public Word(String defaultTranslation,String miwokTranslation,int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }
    public Word(String defaultTranslation,String miwokTranslation,int resourceId,int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = resourceId;
        mAudioResourceId = audioResourceId;
    }
    // methods
    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }
    public int getImageId(){return mImageResourceId;}
    public int getmAudioResourceId(){
        return mAudioResourceId;
    }

    // return whether the given word has image or not
    public  boolean hasImage(){
        return mImageResourceId!=NO_IMAGE_PROVIDED;
    }
}
