package com.example.vikas.recycler;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/**
 * Created by vikas on 4/2/17.
 */
public class User
{
    private String mText1;

    private Drawable mimage1;
    private Drawable mimage2;


    User(String text1, Drawable image)
    {
        mText1=text1;
        mimage2=image;
    }
    User(Drawable image1, String text1, Drawable image2)
    {
        mimage1=image1;
        mText1 = text1;
        mimage2=image2;

    }
    public Drawable getmimage1() {
        return mimage1;
    }

    public void setmimage1(Drawable mimage) {
        this.mimage1 = mimage;
    }
    public String getmText1() {
        return mText1;
    }

    public void setmText1(String mText1) {
        this.mText1 = mText1;
    }

    public Drawable getmimage2() {
        return mimage2;
    }

    public void setmimage2(Drawable mimage) {
        this.mimage2 = mimage;
    }
}