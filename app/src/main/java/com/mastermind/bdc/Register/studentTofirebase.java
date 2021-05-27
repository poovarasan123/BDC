package com.mastermind.bdc.Register;

class studentTofirebase {

    String name,reg,mail,mobile,address,pass,dep,year,role;

    public studentTofirebase(String name, String reg, String mail, String mobile, String address, String pass, String dep, String year, String role) {
        this.name = name;
        this.reg = reg;
        this.mail = mail;
        this.mobile = mobile;
        this.address = address;
        this.pass = pass;
        this.dep = dep;
        this.year = year;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
