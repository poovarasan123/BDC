package com.mastermind.bdc.AddProfessor;

class professorTofirebase {
    String prof_name,prof_id,prof_mail,prof_num,prof_addr,prof_pass,pro_dep,role;


    public professorTofirebase(String prof_name, String prof_id, String prof_mail, String prof_num, String prof_addr, String prof_pass,String pro_dep,String role) {
        this.prof_name = prof_name;
        this.prof_id = prof_id;
        this.prof_mail = prof_mail;
        this.prof_num = prof_num;
        this.prof_addr = prof_addr;
        this.prof_pass = prof_pass;
        this.pro_dep = pro_dep;
        this.role = role;
    }

    public String getProf_name() {
        return prof_name;
    }

    public void setProf_name(String prof_name) {
        this.prof_name = prof_name;
    }

    public String getProf_id() {
        return prof_id;
    }

    public void setProf_id(String prof_id) {
        this.prof_id = prof_id;
    }

    public String getProf_mail() {
        return prof_mail;
    }

    public void setProf_mail(String prof_mail) {
        this.prof_mail = prof_mail;
    }

    public String getProf_num() {
        return prof_num;
    }

    public void setProf_num(String prof_num) {
        this.prof_num = prof_num;
    }

    public String getProf_addr() {
        return prof_addr;
    }

    public void setProf_addr(String prof_addr) {
        this.prof_addr = prof_addr;
    }

    public String getProf_pass() {
        return prof_pass;
    }

    public void setProf_pass(String prof_pass) {
        this.prof_pass = prof_pass;
    }

    public String getPro_dep() {
        return pro_dep;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setPro_dep(String pro_dep) {
        this.pro_dep = pro_dep;

    }
}
