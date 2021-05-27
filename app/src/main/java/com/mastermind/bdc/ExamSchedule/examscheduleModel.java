package com.mastermind.bdc.ExamSchedule;

import android.graphics.drawable.Drawable;

class examscheduleModel {

    String exam;
    Drawable image;

    public examscheduleModel(String exam, Drawable image) {
        this.exam = exam;
        this.image = image;
    }

    public String getExam() {
        return exam;
    }

    public void setExam(String exam) {
        this.exam = exam;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }
}
