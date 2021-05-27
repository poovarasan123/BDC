package com.mastermind.bdc.Achivement;

class achivementModel {
    String sname,dname,ename,place,venue;

    public achivementModel(String sname, String dname, String ename, String place, String venue) {
        this.sname = sname;
        this.dname = dname;
        this.ename = ename;
        this.place = place;
        this.venue = venue;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

}
