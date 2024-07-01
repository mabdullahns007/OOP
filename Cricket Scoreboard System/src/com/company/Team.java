package com.company;

import java.io.Serializable;

public class Team implements Serializable
{
    private boolean toss;
    private String teamName;
    private Player [] players=new Player[11];

    Team(){this.teamName="";}
    Team(String a,Player []p){this.teamName=a;this.players=p;}

    //SETTERS
    public void setTeamName(String teamName) {this.teamName = teamName;}
    public void setToss(boolean toss) {this.toss = toss;}
    public void setPlayers(Player[] players) {this.players = players;}

    //GETTERS
    public String getTeamName(){return teamName;}
    public Player[] getPlayers() {return players;}
    public boolean getToss(){return toss;}
}
