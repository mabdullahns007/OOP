package com.company;

import java.io.Serializable;

public class ScoreCard implements Serializable
{
    //Data members not private because we need to update innings score on regular intervals
     int runs;
     int wickets;
     float overs;

    //start of innings Runs,Wickets,Overs are 0
    ScoreCard(){}

    //GETTERS
    public float getOvers() {return this.overs;}
    public int getRuns() {return this.runs;}
    public int getWickets() {return this.wickets;}
}
