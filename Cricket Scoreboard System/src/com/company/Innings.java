package com.company;

import java.io.Serializable;

public class Innings implements Serializable
{
    private Team t;
    private ScoreCard s;
    private int totalOvers;
    //Extra delivery counter
    private int extra;

    //Constructor
    Innings(){}
    Innings(ScoreCard c,Team t,int totalO){this.s=c;this.t=t;this.totalOvers=totalO;}

    //Copy Constructor
    Innings(Innings i)
    {this.totalOvers=i.getTotalOvers();this.t=i.getTeam();this.s=i.getScorecard();this.extra=i.extra;}

    //update over after 6 balls
    private void OverRound(float ovr)
    {
        int o=(int)ovr;
        ovr-=o;
        String s=String.format("%.1f",ovr);
        if(s.matches("0.6"))
        {
            this.s.overs= (float) Math.ceil(this.s.overs);
        }
    }

    //Extras
    public int getExtras(){return extra;}

    //Balling
    public void Balling(String x)
    {
        switch(x)
        {
            case "0":
                this.s.overs+=0.1f;
                OverRound(this.s.overs);
                break;
            case "1":
                this.s.runs+=1;
                this.s.overs+=0.1f;
                OverRound(this.s.overs);
                break;
            case "2":
                this.s.runs+=2;
                this.s.overs+=0.1f;
                OverRound(this.s.overs);
                break;
            case "3":
                this.s.runs+=3;
                this.s.overs+=0.1f;
                OverRound(this.s.overs);
                break;
            case "4":
                this.s.runs+=4;
                this.s.overs+=0.1f;
                OverRound(this.s.overs);
                break;
            case "5":
                this.s.runs+=5;
                this.s.overs+=0.1f;
                OverRound(this.s.overs);
                break;
            case "6":
                this.s.runs+=6;
                this.s.overs+=0.1f;
                OverRound(this.s.overs);
                break;
            case "W":
                this.s.wickets+=1;
                this.s.overs+=0.1f;
                OverRound(this.s.overs);
                break;
            case "WB":
                this.s.runs+=1;
                this.extra++;
                break;
            case "NB":
                //No ball free run
                this.s.runs+=1;
                this.extra++;
                break;
            case "BY1":
                this.extra++;
                this.s.runs+=1;
                this.s.overs+=0.1f;
                OverRound(this.s.overs);
                break;
            case "BY2":
                this.extra+=2;
                this.s.runs+=2;
                this.s.overs+=0.1f;
                OverRound(this.s.overs);
                break;
            case "BY3":
                this.extra+=3;
                this.s.runs+=3;
                this.s.overs+=0.1f;
                OverRound(this.s.overs);
                break;
            case "BY4":
                this.extra+=4;
                this.s.runs+=4;
                this.s.overs+=0.1f;
                OverRound(this.s.overs);
                break;
        }
    }

    //get live score,wickets,overs
    public int getRuns() {return this.s.getRuns();}
    public int getWickets() {return this.s.getWickets();}
    public float getOvers() {return this.s.getOvers();}

    //getters
    public String getTeamName(){return this.t.getTeamName();}

    //get data members
    public Team getTeam() {return this.t;}
    public ScoreCard getScorecard() {return this.s;}
    public int getTotalOvers(){return this.totalOvers;}
}
