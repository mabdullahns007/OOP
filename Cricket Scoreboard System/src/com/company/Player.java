package com.company;

import java.io.Serializable;

public class Player implements Serializable
{
    private String name;
    private boolean out;

    //CONSTRUCTORS
    Player() {this.name="";}
    Player(String n) {this.name=n;}

    //SETTERS AND GETTERS
    public void setName(String name) {this.name = name;}
    public void setOut(boolean out) {this.out = out;}

    public String getName() {return this.name;}
    public boolean Out(){return this.out;}
}
