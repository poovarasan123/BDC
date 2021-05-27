package com.mastermind.bdc.AddTimeTable;

public class timetableToFirebase {
    String department;
    String image;

    public timetableToFirebase(String department, String image) {
        this.department = department;
        this.image = image;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
