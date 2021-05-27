package com.mastermind.bdc.ProfTimeTable;

import com.google.firebase.database.Exclude;

class timetableModel {
    String s1;
    String image;
    String key;

    public timetableModel(String s1, String image,String key) {
        this.s1 = s1;
        this.image = image;
        this.key = key;
    }

    public timetableModel(){

    }

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Exclude
    public String getKey() {
        return key;
    }

    @Exclude
    public void setKey(String key) {
        this.key = key;
    }
}
