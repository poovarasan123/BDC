package com.mastermind.bdc.TimeTable;

import android.graphics.drawable.Drawable;

class timetableModel {
    String s1;
    Drawable image;

    public timetableModel(String s1, Drawable image) {
        this.s1 = s1;
        this.image = image;
    }

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }
}
