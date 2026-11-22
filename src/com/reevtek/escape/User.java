package com.reevtek.escape;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {

    public String username;
    public String password;
    public int age;
    public double balance;
    public ArrayList<String> passwordList;
    public String sayHello;
    public String domain;
    public String email;

    public User(String username, String passwordString, int age, double balance, ArrayList<String> passwordList, String greetings) {


        this.username = username;
        this.password = passwordString;
        this.age = age;
        this.balance = balance;
        this.passwordList = passwordList;
        this.sayHello = greetings;
        this.domain = "@someone.com";
        this.email = this.username + domain;
    }

    public void greet(){

        System.out.println(sayHello);
    }

    public void EmailAddress(){

        System.out.printf("Your email is: %s", email);
    }
}