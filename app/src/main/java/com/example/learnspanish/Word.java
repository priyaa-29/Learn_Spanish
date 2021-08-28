package com.example.learnspanish;

public class Word {
    private String mSpanishTranslation;
    private String mDefaultTranslation;
    private int mImageId = NO_IMAGE;

    private static final int NO_IMAGE = -1;

    public Word(String defaultTranslation, String spanishTranslation) {
        mDefaultTranslation=defaultTranslation;
        mSpanishTranslation=spanishTranslation;
    }

    public Word(String defaultTranslation, String spanishTranslation, int imageId) {
        mDefaultTranslation = defaultTranslation;
        mSpanishTranslation = spanishTranslation;
        mImageId = imageId;
    }
    public int getImageId() {
        return mImageId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getSpanishTranslation() {
        return mSpanishTranslation;
    }

    public boolean hasImage() {
        return mImageId != NO_IMAGE;
    }
}
