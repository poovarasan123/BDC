package com.mastermind.bdc.AchivementOthers;

class announceTofirebase {
    String date,name,dep,eventname,position,venue;

    public announceTofirebase(String date, String name, String dep, String eventname, String position, String venue) {
        this.date = date;
        this.name = name;
        this.dep = dep;
        this.eventname = eventname;
        this.position = position;
        this.venue = venue;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public String getEventname() {
        return eventname;
    }

    public void setEventname(String eventname) {
        this.eventname = eventname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }
}
