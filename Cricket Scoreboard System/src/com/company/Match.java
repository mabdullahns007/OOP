package com.company;

import java.io.Serializable;

public class Match implements Serializable
{
    private int matchId;
    private Innings fI;
    private Innings sI;

    //CONSTRUCTORS
    Match()
    {
        fI=new Innings();
        sI=new Innings();
    }
    Match(Innings f,Innings s,int id)
    {
        this.fI=f;
        this.sI=s;
        this.matchId=id;
    }
    Match(Match m)
    {
        this.sI=m.sI;
        this.fI=m.fI;
    }

    //GETTERS
    public Innings getfI() {return fI;}
    public Innings getsI() {return sI;}
    public int getMatchId() {return matchId;}

    //SETTERS
    public void setfI(Innings fI) {this.fI = fI;}
    public void setsI(Innings sI) {this.sI = sI;}
    public void setMatchId(int matchId) {this.matchId= matchId;}
}
