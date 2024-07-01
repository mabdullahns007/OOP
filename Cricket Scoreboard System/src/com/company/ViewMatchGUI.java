package com.company;

import javax.swing.*;
import java.awt.*;

public class ViewMatchGUI extends JFrame
{
    //TEAM A
    JLabel runsA, oversA, wicketsA, tossA;
    JLabel teamAl;
    JLabel al1, al2, al3, al4, al5, al6, al7, al8, al9, al10;

    //TEAM B
    JLabel runsB, oversB, wicketsB, tossB;
    JLabel teamBl;
    JLabel bl1, bl2, bl3, bl4, bl5, bl6, bl7, bl8, bl9, bl10;

    //Match
    Match m;

    ViewMatchGUI()
    {
        m= MenuGUI.m;

        //FIRST INNINGS TEAM PLAYERS
        Player[] playersA=m.getfI().getTeam().getPlayers();
        //SECOND INNINGS TEAM PLAYERS
        Player[] playersB=m.getsI().getTeam().getPlayers();

        //PROPERTIES
        setSize(1000,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //FOR CENTER FRAME ORIENTATION
        setLocationRelativeTo(null);
        setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));
        setBackground(Color.black);

        //Accessories
        Font f=new Font(Font.SANS_SERIF, Font.BOLD,20);
        Color red=new Color(255, 80, 80);
        Color green=new Color(109, 255, 80);

        //TEAM A STATS
        JPanel teamAStats=new JPanel(new GridLayout(4,2));
        teamAStats.setBackground(new Color(0,204,102));

        JLabel l1=new JLabel("RUNS",JLabel.LEFT);
        l1.setBackground(green);
        l1.setForeground(Color.black);
        l1.setOpaque(true);
        l1.setFont(f);
        JLabel l2=new JLabel("OVERS",JLabel.LEFT);
        l2.setBackground(green);
        l2.setForeground(Color.black);
        l2.setOpaque(true);
        l2.setFont(f);
        JLabel l3=new JLabel("WICKETS",JLabel.LEFT);
        l3.setBackground(green);
        l3.setForeground(Color.black);
        l3.setOpaque(true);
        l3.setFont(f);
        JLabel l4=new JLabel("TOSS",JLabel.LEFT);
        l4.setBackground(green);
        l4.setForeground(Color.black);
        l4.setOpaque(true);
        l4.setFont(f);

        runsA =new JLabel(String.valueOf(m.getfI().getScorecard().getRuns()),JLabel.RIGHT);
        runsA.setFont(f);
        runsA.setForeground(Color.WHITE);
        runsA.setBackground(new Color(0,204,102));
        runsA.setOpaque(true);
        oversA =new JLabel(String.format("%.1f", m.getfI().getScorecard().getOvers()),JLabel.RIGHT);
        oversA.setFont(f);
        oversA.setForeground(Color.WHITE);
        oversA.setBackground(new Color(0,204,102));
        oversA.setOpaque(true);
        wicketsA =new JLabel(String.valueOf(m.getfI().getScorecard().getWickets()),JLabel.RIGHT);
        wicketsA.setFont(f);
        wicketsA.setForeground(Color.WHITE);
        wicketsA.setBackground(new Color(0,204,102));
        wicketsA.setOpaque(true);

        tossA=new JLabel("",JLabel.RIGHT);
        tossA.setFont(f);
        tossA.setForeground(Color.WHITE);
        tossA.setOpaque(true);

        if(m.getfI().getTeam().getToss())
        {
            tossA.setBackground(new Color(0,204,102));
        }
        else
        {
            tossA.setBackground(Color.black);
        }

        teamAStats.add(l1);
        teamAStats.add(runsA);
        teamAStats.add(l2);
        teamAStats.add(oversA);
        teamAStats.add(l3);
        teamAStats.add(wicketsA);
        teamAStats.add(l4);
        teamAStats.add(tossA);

        //Team A run scorers labels
        JPanel teamAScorers=new JPanel(new GridLayout(1,3));
        teamAScorers.setBackground(new Color(102,0,204));

        JPanel box1=new JPanel();
        box1.setLayout(new BoxLayout(box1,BoxLayout.Y_AXIS));
        box1.setBackground(new Color(102,0,204));

        JPanel box2=new JPanel();
        box2.setLayout(new BoxLayout(box2,BoxLayout.Y_AXIS));
        box2.setBackground(new Color(102,0,204));

        JPanel box3=new JPanel();
        box3.setLayout(new BoxLayout(box3,BoxLayout.Y_AXIS));
        box3.setBackground(new Color(102,0,204));

        al1=new JLabel("",JLabel.CENTER);
        al1.setForeground(Color.WHITE);
        al1.setFont(new Font(Font.SANS_SERIF, Font.BOLD,18));

        al2=new JLabel("",JLabel.CENTER);
        al2.setForeground(Color.WHITE);
        al2.setFont(new Font(Font.SANS_SERIF, Font.BOLD,18));

        al3 =new JLabel("",JLabel.CENTER);
        al3.setForeground(Color.WHITE);
        al3.setFont(new Font(Font.SANS_SERIF, Font.BOLD,18));

        al4 =new JLabel("",JLabel.CENTER);
        al4.setForeground(Color.WHITE);
        al4.setFont(new Font(Font.SANS_SERIF, Font.BOLD,18));

        box1.add(al1);
        box1.add(al2);
        box1.add(al3);
        box1.add(al4);

        al5 =new JLabel("",JLabel.CENTER);
        al5.setForeground(Color.WHITE);
        al5.setFont(new Font(Font.SANS_SERIF, Font.BOLD,18));

        al6 =new JLabel("",JLabel.CENTER);
        al6.setForeground(Color.WHITE);
        al6.setFont(new Font(Font.SANS_SERIF, Font.BOLD,18));

        al7 =new JLabel("",JLabel.CENTER);
        al7.setForeground(Color.WHITE);
        al7.setFont(new Font(Font.SANS_SERIF, Font.BOLD,18));

        al8 =new JLabel("",JLabel.CENTER);
        al8.setForeground(Color.WHITE);
        al8.setFont(new Font(Font.SANS_SERIF, Font.BOLD,18));

        box2.add(al5);
        box2.add(al6);
        box2.add(al7);
        box2.add(al8);

        al9 =new JLabel("",JLabel.CENTER);
        al9.setForeground(Color.WHITE);
        al9.setFont(new Font(Font.SANS_SERIF, Font.BOLD,18));

        al10 =new JLabel("",JLabel.CENTER);
        al10.setForeground(Color.WHITE);
        al10.setFont(new Font(Font.SANS_SERIF, Font.BOLD,18));

        box3.add(al9);
        box3.add(al10);

        teamAScorers.add(box1);
        teamAScorers.add(box2);
        teamAScorers.add(box3);

        int j=-1;
        for(int i=0;i<playersA.length;i++)
        {
            if (playersA[i].Out())
            {
                switch(++j)
                {
                    case 0:
                        al1.setText(playersA[i].getName().toUpperCase());
                        break;
                    case 1:
                        al2.setText(playersA[i].getName().toUpperCase());
                        break;
                    case 2:
                        al3.setText(playersA[i].getName().toUpperCase());
                        break;
                    case 3:
                        al4.setText(playersA[i].getName().toUpperCase());
                        break;
                    case 4:
                        al5.setText(playersA[i].getName().toUpperCase());
                        break;
                    case 5:
                        al6.setText(playersA[i].getName().toUpperCase());
                        break;
                    case 6:
                        al7.setText(playersA[i].getName().toUpperCase());
                        break;
                    case 7:
                        al8.setText(playersA[i].getName().toUpperCase());
                        break;
                    case 8:
                        al9.setText(playersA[i].getName().toUpperCase());
                        break;
                    case 9:
                        al10.setText(playersA[i].getName().toUpperCase());
                        break;
                }
            }
        }

        JPanel runScorersA =new JPanel();
        runScorersA.setBackground(red);
        runScorersA.setLayout(new BoxLayout(runScorersA,BoxLayout.Y_AXIS));
        JLabel Q=new JLabel(String.format("%-65s","WICKETS"),JLabel.LEFT);
        Q.setForeground(Color.white);
        Q.setFont(new Font(Font.SANS_SERIF, Font.BOLD,23));

        runScorersA.add(Q);
        runScorersA.add(teamAScorers);

        teamAl=new JLabel(String.format("%-22s",m.getfI().getTeamName()));
        teamAl.setForeground(Color.white);
        teamAl.setFont(new Font(Font.SANS_SERIF, Font.BOLD,26));

        JPanel statsScorersA=new JPanel();
        statsScorersA.setBackground(new Color(102,0,204));
        statsScorersA.setLayout(new BoxLayout(statsScorersA,BoxLayout.X_AXIS));
        statsScorersA.add(teamAStats);
        statsScorersA.add(runScorersA);

        JPanel teamA=new JPanel();

        teamA.setBackground(Color.black);
        teamA.setLayout(new BoxLayout(teamA,BoxLayout.Y_AXIS));
        teamA.add(teamAl);
        teamA.add(statsScorersA);

        //TEAM B STATS
        JPanel teamBStats =new JPanel(new GridLayout(4,2));
        teamBStats.setBackground(new Color(0,204,102));

        JLabel k1 =new JLabel("RUNS",JLabel.LEFT);
        k1.setBackground(green);
        k1.setForeground(Color.black);
        k1.setOpaque(true);
        k1.setFont(f);
        JLabel k2 =new JLabel("OVERS",JLabel.LEFT);
        k2.setBackground(green);
        k2.setForeground(Color.black);
        k2.setOpaque(true);
        k2.setFont(f);
        JLabel k3 =new JLabel("WICKETS",JLabel.LEFT);
        k3.setBackground(green);
        k3.setForeground(Color.black);
        k3.setOpaque(true);
        k3.setFont(f);
        JLabel k4 =new JLabel("TOSS",JLabel.LEFT);
        k4.setBackground(green);
        k4.setForeground(Color.black);
        k4.setOpaque(true);
        k4.setFont(f);

        runsB =new JLabel(String.valueOf(m.getsI().getScorecard().getRuns()),JLabel.RIGHT);
        runsB.setFont(f);
        runsB.setForeground(Color.WHITE);
        runsB.setBackground(new Color(0,204,102));
        runsB.setOpaque(true);
        oversB =new JLabel(String.format("%.1f", m.getsI().getScorecard().getOvers()),JLabel.RIGHT);
        oversB.setFont(f);
        oversB.setForeground(Color.WHITE);
        oversB.setBackground(new Color(0,204,102));
        oversB.setOpaque(true);
        wicketsB =new JLabel(String.valueOf(m.getsI().getScorecard().getWickets()),JLabel.RIGHT);
        wicketsB.setFont(f);
        wicketsB.setForeground(Color.WHITE);
        wicketsB.setBackground(new Color(0,204,102));
        wicketsB.setOpaque(true);
        tossB=new JLabel("",JLabel.RIGHT);
        tossB.setFont(f);
        tossB.setForeground(Color.WHITE);
        tossB.setOpaque(true);

        if(m.getsI().getTeam().getToss())
        {
            tossB.setBackground(new Color(0,204,102));
        }
        else
        {
            tossB.setBackground(Color.black);
        }


        teamBStats.add(k1);
        teamBStats.add(runsB);
        teamBStats.add(k2);
        teamBStats.add(oversB);
        teamBStats.add(k3);
        teamBStats.add(wicketsB);
        teamBStats.add(k4);
        teamBStats.add(tossB);

        //Team B run scorers labels
        JPanel teamBScorers =new JPanel(new GridLayout(1,3));
        teamBScorers.setBackground(new Color(102,0,204));

        JPanel boxB1 =new JPanel();
        boxB1.setLayout(new BoxLayout(boxB1,BoxLayout.Y_AXIS));
        boxB1.setBackground(new Color(102,0,204));

        JPanel boxB2 =new JPanel();
        boxB2.setLayout(new BoxLayout(boxB2,BoxLayout.Y_AXIS));
        boxB2.setBackground(new Color(102,0,204));

        JPanel boxB3 =new JPanel();
        boxB3.setLayout(new BoxLayout(boxB3,BoxLayout.Y_AXIS));
        boxB3.setBackground(new Color(102,0,204));

        bl1=new JLabel("",JLabel.CENTER);
        bl1.setForeground(Color.WHITE);
        bl1.setFont(new Font(Font.SANS_SERIF, Font.BOLD,18));

        bl2=new JLabel("",JLabel.CENTER);
        bl2.setForeground(Color.WHITE);
        bl2.setFont(new Font(Font.SANS_SERIF, Font.BOLD,18));

        bl3 =new JLabel("",JLabel.CENTER);
        bl3.setForeground(Color.WHITE);
        bl3.setFont(new Font(Font.SANS_SERIF, Font.BOLD,18));

        bl4 =new JLabel("",JLabel.CENTER);
        bl4.setForeground(Color.WHITE);
        bl4.setFont(new Font(Font.SANS_SERIF, Font.BOLD,18));

        boxB1.add(bl1);
        boxB1.add(bl2);
        boxB1.add(bl3);
        boxB1.add(bl4);

        bl5 =new JLabel("",JLabel.CENTER);
        bl5.setForeground(Color.WHITE);
        bl5.setFont(new Font(Font.SANS_SERIF, Font.BOLD,18));

        bl6 =new JLabel("",JLabel.CENTER);
        bl6.setForeground(Color.WHITE);
        bl6.setFont(new Font(Font.SANS_SERIF, Font.BOLD,18));

        bl7 =new JLabel("",JLabel.CENTER);
        bl7.setForeground(Color.WHITE);
        bl7.setFont(new Font(Font.SANS_SERIF, Font.BOLD,18));

        bl8 =new JLabel("",JLabel.CENTER);
        bl8.setForeground(Color.WHITE);
        bl8.setFont(new Font(Font.SANS_SERIF, Font.BOLD,18));

        boxB2.add(bl5);
        boxB2.add(bl6);
        boxB2.add(bl7);
        boxB2.add(bl8);

        bl9 =new JLabel("",JLabel.CENTER);
        bl9.setForeground(Color.WHITE);
        bl9.setFont(new Font(Font.SANS_SERIF, Font.BOLD,18));

        bl10 =new JLabel("",JLabel.CENTER);
        bl10.setForeground(Color.WHITE);
        bl10.setFont(new Font(Font.SANS_SERIF, Font.BOLD,18));

        boxB3.add(bl9);
        boxB3.add(bl10);

        teamBScorers.add(boxB1);
        teamBScorers.add(boxB2);
        teamBScorers.add(boxB3);

        int a =-1;
        for(int i=0;i<playersB.length;i++)
        {
            if (playersB[i].Out())
            {
                switch(++a)
                {
                    case 0:
                        bl1.setText(playersB[i].getName().toUpperCase());
                        break;
                    case 1:
                        bl2.setText(playersB[i].getName().toUpperCase());
                        break;
                    case 2:
                        bl3.setText(playersB[i].getName().toUpperCase());
                        break;
                    case 3:
                        bl4.setText(playersB[i].getName().toUpperCase());
                        break;
                    case 4:
                        bl5.setText(playersB[i].getName().toUpperCase());
                        break;
                    case 5:
                        bl6.setText(playersB[i].getName().toUpperCase());
                        break;
                    case 6:
                        bl7.setText(playersB[i].getName().toUpperCase());
                        break;
                    case 7:
                        bl8.setText(playersB[i].getName().toUpperCase());
                        break;
                    case 8:
                        bl9.setText(playersB[i].getName().toUpperCase());
                        break;
                    case 9:
                        bl10.setText(playersB[i].getName().toUpperCase());
                        break;
                }
            }
        }

        JPanel runScorersB =new JPanel();
        runScorersB.setBackground(red);
        runScorersB.setLayout(new BoxLayout(runScorersB,BoxLayout.Y_AXIS));
        JLabel X=new JLabel(String.format("%-65s","WICKETS"),JLabel.LEFT);
        X.setForeground(Color.white);
        X.setFont(new Font(Font.SANS_SERIF, Font.BOLD,23));

        runScorersB.add(X);
        runScorersB.add(teamBScorers);

        teamBl=new JLabel(String.format("%-22s",m.getsI().getTeamName()));
        teamBl.setForeground(Color.WHITE);
        teamBl.setBackground(red);
        teamBl.setFont(new Font(Font.SANS_SERIF, Font.BOLD,26));

        JPanel statsScorersB =new JPanel();
        statsScorersB.setBackground(new Color(102,0,204));
        statsScorersB.setLayout(new BoxLayout(statsScorersB,BoxLayout.X_AXIS));
        statsScorersB.add(teamBStats);
        statsScorersB.add(runScorersB);

        JPanel teamB =new JPanel();
        teamB.setBackground(Color.black);
        teamB.setLayout(new BoxLayout(teamB,BoxLayout.Y_AXIS));
        teamB.add(teamBl);
        teamB.add(statsScorersB);

        add(teamA);
        add(teamB);

        //OTHER USEFUL PROPERTIES
        this.setTitle("RECORD");
        Image db=Toolkit.getDefaultToolkit().getImage("C:\\KAM 25\\WORK PROFILE\\3RD SEMESTER\\OOP\\Assignments Solutions\\Project\\resource\\db.png");
        this.setIconImage(db);
        this.setBackground(Color.black);
        setResizable(false);
        setVisible(true);
    }

    //setter
    public void setM(Match m) {this.m = m;}
}
