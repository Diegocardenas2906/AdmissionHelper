package com.plutoine.admissionhelper.Model;

/**
 * Created by ASUS on 10/1/2017.
 */

public class User {
    private String Name;
    private String Password;

    public User (){
    }

    public User (String name, String password) {
        Name = name;
        Password = password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword () {
        return Password;
    }


}
