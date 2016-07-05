package com.example.acer.englishlearner;

/**
 * Created by VS-PC on 7/5/2016.
 */
public class Node {
    private String name;
    private String password;
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Node(String password, String name) {
        this.password = password;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
