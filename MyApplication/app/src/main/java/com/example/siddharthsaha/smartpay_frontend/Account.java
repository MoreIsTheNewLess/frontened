package com.example.siddharthsaha.smartpay_frontend;

/**
 * Created by Siddharth Saha on 4/1/2017.
 */

public class Account {
    String name, emailid, uname, pas, vpa, address;

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return this.name;
    }

    public void setEmail(String emailid) {

        this.emailid = emailid;
    }

    public String getEmail() {

        return this.emailid;
    }

    public void setUsername(String uname) {

        this.uname = uname;
    }

    public String getUsername() {

        return this.uname;
    }

    public void setPassword(String pas) {
        this.pas = pas;
    }

    public String getPassword() {

        return this.pas;
    }
    public String getVPA() {
        return this.vpa;
    }

    public void setVPA(String vpa) {

        this.vpa = vpa;
    }

    public String getAddress() {

        return this.address;
    }

    public void setAddress(String address) {

        this.address = address;
    }


//    public String getType() {
//        return this.type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
}

