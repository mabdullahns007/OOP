package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ScoreCardGUI extends JFrame
{
    JPanel upper,leftP, liveP;
    JButton b1,b2,b3,b4,b5,b6,b0,bW,bWB,bN,bB1,bB2,bB3,bB4,b;
    JLabel l,u1l,u2l1,u2l2,u2l3,l1l1,l1l2,l1l3,l1l4,l1l5,l1l6,l1l7,l1l8,l1l9,l1l10,inningsL,l2l2,l2l3,l2l4,l2l5,l2l6;
    //INNINGS
    final private Innings fi;
    final private Innings si;
    //RESET COUNTER
    int i=0;
    ScoreCardGUI()
    {
        //PROPERTIES
        setSize(400,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        //FOR CENTER FRAME ORIENTATION
        setLocationRelativeTo(null);

        //Initializing Innings
        fi=new Innings(TossSelectionGUI.getFi());
        si=new Innings(TossSelectionGUI.getSi());


        //Accessories
        Font f=new Font(Font.SANS_SERIF, Font.BOLD,20);
        Color red=new Color(255, 80, 80);
        Color blue=new Color(80, 156, 255);
        Color green=new Color(109, 255, 80);
        Color orange=new Color(255, 182, 54);
        Border redB=BorderFactory.createLineBorder(red,1);
        Border blueB=BorderFactory.createLineBorder(blue,1);
        Border orangeB=BorderFactory.createLineBorder(orange,5);

        //upper
        upper=new JPanel(new GridLayout(4,1));

        //Upper panel 1
        JPanel upper1 =new JPanel(new FlowLayout());
        upper1.setBackground(Color.black);
        u1l =new JLabel("SCORECARD");
        u1l.setForeground(Color.white);
        u1l.setFont(f);

        upper1.add(u1l);

        //Upper panel 2
        JPanel upper2=new JPanel(new BorderLayout());

        //team A
        JPanel teamAp =new JPanel(new FlowLayout());
        teamAp.setBackground(blue);
        u2l1=new JLabel(fi.getTeamName().toUpperCase());
        u2l1.setFont(f);
        u2l1.setForeground(Color.black);
        teamAp.add(u2l1);

        //VS
        JPanel vsP=new JPanel(new FlowLayout());
        vsP.setBackground(Color.black);
        u2l2=new JLabel("VS");
        u2l2.setFont(f);
        u2l2.setForeground(Color.white);
        vsP.add(u2l2);

        //team B
        JPanel teamBp=new JPanel(new FlowLayout());
        teamBp.setBorder(redB);
        teamBp.setBackground(red);
        u2l3=new JLabel(si.getTeamName().toUpperCase());
        u2l3.setFont(f);
        u2l3.setForeground(Color.black);
        teamBp.add(u2l3);

        upper2.add(teamAp,BorderLayout.WEST);
        upper2.add(vsP,BorderLayout.CENTER);
        upper2.add(teamBp,BorderLayout.EAST);

        JPanel innings=new JPanel(new GridLayout(1,1));
        innings.setBackground(Color.black);
        JPanel batting=new JPanel(new GridLayout(1,1));
        batting.setBackground(Color.black);
        l=new JLabel(fi.getTeamName().toUpperCase());
        l.setForeground(Color.white);
        l.setFont(f);
        inningsL=new JLabel("FIRST INNINGS");
        inningsL.setForeground(Color.white);
        inningsL.setFont(f);
        innings.add(inningsL);
        batting.add(l);

        upper.add(upper1);
        upper.add(upper2);
        upper.add(innings);
        upper.add(batting);

        //LEFT PANEL
        leftP =new JPanel(new GridLayout(10,1));
        leftP.setBackground(blue);
        leftP.setBorder(blueB);

        l1l1=new JLabel("        ",JLabel.CENTER);
        l1l1.setForeground(Color.BLACK);
        l1l1.setFont(f);

        l1l2=new JLabel("        ",JLabel.CENTER);
        l1l2.setForeground(Color.BLACK);
        l1l2.setFont(f);

        l1l3=new JLabel("        ",JLabel.CENTER);
        l1l3.setForeground(Color.BLACK);
        l1l3.setFont(f);

        l1l4=new JLabel("        ",JLabel.CENTER);
        l1l4.setForeground(Color.BLACK);
        l1l4.setFont(f);

        l1l5=new JLabel("        ",JLabel.CENTER);
        l1l5.setForeground(Color.BLACK);
        l1l5.setFont(f);

        l1l6=new JLabel("        ",JLabel.CENTER);
        l1l6.setForeground(Color.BLACK);
        l1l6.setFont(f);

        l1l7=new JLabel("        ",JLabel.CENTER);
        l1l7.setForeground(Color.BLACK);
        l1l7.setFont(f);

        l1l8=new JLabel("        ",JLabel.CENTER);
        l1l8.setForeground(Color.BLACK);
        l1l8.setFont(f);

        l1l9=new JLabel("        ",JLabel.CENTER);
        l1l9.setForeground(Color.BLACK);
        l1l9.setFont(f);

        l1l10=new JLabel("        ",JLabel.CENTER);
        l1l10.setForeground(Color.BLACK);
        l1l10.setFont(f);

        leftP.add(l1l1);
        leftP.add(l1l2);
        leftP.add(l1l3);
        leftP.add(l1l4);
        leftP.add(l1l5);
        leftP.add(l1l6);
        leftP.add(l1l7);
        leftP.add(l1l8);
        leftP.add(l1l9);
        leftP.add(l1l10);


        //RIGHT PANEL (RUNS TO GRID BUTTONS)
        liveP =new JPanel();
        liveP.setLayout(new GridLayout(5,2));
        liveP.setBackground(green);

        JLabel runs=new JLabel("RUNS");
        runs.setForeground(Color.BLACK);
        runs.setBackground(green);
        runs.setBorder(BorderFactory.createLineBorder(green,1));
        runs.setOpaque(true);
        runs.setFont(f);
        l2l2=new JLabel("",JLabel.RIGHT);
        l2l2.setForeground(Color.white);
        l2l2.setBackground(Color.black);
        l2l2.setFont(f);
        l2l2.setOpaque(true);

        JLabel wickets=new JLabel("WICKETS");
        wickets.setForeground(Color.BLACK);
        wickets.setBackground(green);
        wickets.setOpaque(true);
        wickets.setFont(f);
        l2l3=new JLabel("",JLabel.RIGHT);
        l2l3.setForeground(Color.white);
        l2l3.setBackground(Color.black);
        l2l3.setFont(f);
        l2l3.setOpaque(true);

        JLabel overs=new JLabel("OVERS");
        overs.setForeground(Color.BLACK);
        overs.setFont(f);
        overs.setBackground(green);
        overs.setOpaque(true);
        l2l4=new JLabel("",JLabel.RIGHT);
        l2l4.setForeground(Color.white);
        l2l4.setBackground(Color.black);
        l2l4.setFont(f);
        l2l4.setOpaque(true);

        JLabel extras=new JLabel("EXTRAS");
        extras.setForeground(Color.BLACK);
        extras.setFont(f);
        extras.setBackground(green);
        extras.setOpaque(true);
        l2l5=new JLabel("",JLabel.RIGHT);
        l2l5.setForeground(Color.white);
        l2l5.setBackground(Color.black);
        l2l5.setFont(f);
        l2l5.setOpaque(true);

        JLabel totalOvers=new JLabel("TOTAL");
        totalOvers.setForeground(Color.BLACK);
        totalOvers.setFont(f);
        totalOvers.setBackground(green);
        totalOvers.setBorder(BorderFactory.createLineBorder(green,1));
        totalOvers.setOpaque(true);
        l2l6=new JLabel(String.valueOf(fi.getTotalOvers()),JLabel.RIGHT);
        l2l6.setForeground(Color.white);
        l2l6.setBackground(Color.black);
        l2l6.setFont(f);
        l2l6.setOpaque(true);

        liveP.add(runs);
        liveP.add(l2l2);
        liveP.add(wickets);
        liveP.add(l2l3);
        liveP.add(extras);
        liveP.add(l2l5);
        liveP.add(overs);
        liveP.add(l2l4);
        liveP.add(totalOvers);
        liveP.add(l2l6);

        //lower 3
        //initialize
        b1=new JButton("1");
        b1.setForeground(Color.black);
        b1.setBackground(orange);
        b1.setBorder(orangeB);

        b2=new JButton("2");
        b2.setForeground(Color.black);
        b2.setBackground(orange);
        b2.setBorder(orangeB);
        b3=new JButton("3");
        b3.setForeground(Color.black);
        b3.setBackground(orange);
        b3.setBorder(orangeB);
        b4=new JButton("4");
        b4.setForeground(Color.black);
        b4.setBackground(orange);
        b4.setBorder(orangeB);
        b5=new JButton("5");
        b5.setForeground(Color.black);
        b5.setBackground(orange);
        b5.setBorder(orangeB);
        b6=new JButton("6");
        b6.setForeground(Color.black);
        b6.setBackground(orange);
        b6.setBorder(orangeB);
        b0=new JButton("0");
        b0.setForeground(Color.black);
        b0.setBackground(orange);
        b0.setBorder(orangeB);
        bW=new JButton("W");
        bW.setForeground(Color.black);
        bW.setBackground(orange);
        bW.setBorder(orangeB);
        bWB=new JButton("WB");
        bWB.setForeground(Color.black);
        bWB.setBackground(orange);
        bWB.setBorder(orangeB);
        bN=new JButton("NB");
        bN.setForeground(Color.black);
        bN.setBackground(orange);
        bN.setBorder(orangeB);
        bB1=new JButton("BY1");
        bB1.setForeground(Color.black);
        bB1.setBackground(orange);
        bB1.setBorder(orangeB);
        bB2=new JButton("BY2");
        bB2.setForeground(Color.black);
        bB2.setBackground(orange);
        bB2.setBorder(orangeB);
        bB3=new JButton("BY3");
        bB3.setForeground(Color.black);
        bB3.setBackground(orange);
        bB3.setBorder(orangeB);
        bB4=new JButton("BY4");
        bB4.setForeground(Color.black);
        bB4.setBackground(orange);
        bB4.setBorder(orangeB);
        b=new JButton("");
        b.setForeground(Color.black);
        b.setBackground(orange);
        b.setBorder(orangeB);

        //button panel
        JPanel gridButton =new JPanel(new GridLayout(3,5));
        gridButton.setBackground(orange);
        gridButton.setBorder(orangeB);
        gridButton.add(b1);
        gridButton.add(b2);
        gridButton.add(b3);
        gridButton.add(b4);
        gridButton.add(b5);
        gridButton.add(b6);
        gridButton.add(b0);
        gridButton.add(bW);
        gridButton.add(bWB);
        gridButton.add(bN);
        gridButton.add(bB1);
        gridButton.add(bB2);
        gridButton.add(bB3);
        gridButton.add(bB4);
        gridButton.add(b);

        MyMouseListener m= new MyMouseListener();
        MyActionListener a=new MyActionListener();

        b1.addActionListener(a);
        b2.addActionListener(a);
        b3.addActionListener(a);
        b4.addActionListener(a);
        b5.addActionListener(a);
        b6.addActionListener(a);
        b0.addActionListener(a);
        bW.addActionListener(a);
        bWB.addActionListener(a);
        bN.addActionListener(a);
        bB1.addActionListener(a);
        bB2.addActionListener(a);
        bB3.addActionListener(a);
        bB4.addActionListener(a);

        b1.addMouseListener(m);
        b2.addMouseListener(m);
        b3.addMouseListener(m);
        b4.addMouseListener(m);
        b5.addMouseListener(m);
        b6.addMouseListener(m);
        b0.addMouseListener(m);
        bW.addMouseListener(m);
        bWB.addMouseListener(m);
        bN.addMouseListener(m);
        bB1.addMouseListener(m);
        bB2.addMouseListener(m);
        bB3.addMouseListener(m);
        bB4.addMouseListener(m);

        b1.setFocusPainted(false);
        b2.setFocusPainted(false);
        b3.setFocusPainted(false);
        b4.setFocusPainted(false);
        b5.setFocusPainted(false);
        b6.setFocusPainted(false);
        b0.setFocusPainted(false);
        bW.setFocusPainted(false);
        bWB.setFocusPainted(false);
        bN.setFocusPainted(false);
        bB1.setFocusPainted(false);
        bB2.setFocusPainted(false);
        bB3.setFocusPainted(false);
        bB4.setFocusPainted(false);

        JPanel d=new JPanel(new GridLayout(1,2));
        d.add(leftP);
        d.add(liveP);

        JPanel q=new JPanel(new FlowLayout());
        q.setBackground(Color.black);

        add(upper,BorderLayout.NORTH);
        add(gridButton,BorderLayout.CENTER);
        add(d,BorderLayout.SOUTH);


        Image scoreCard=Toolkit.getDefaultToolkit().getImage("C:\\KAM 25\\WORK PROFILE\\3RD SEMESTER\\OOP\\Assignments Solutions\\Project\\resource\\scoreCard.png");
        this.setIconImage(scoreCard);
        //OTHER USEFUL PROPERTIES
        this.setTitle("SCOREBOARD");
        setResizable(false);
        setVisible(true);
    }

    //Check if first innings is complete
    private boolean checkIfFirstInningsComplete()
    {
        //Innings will be over if either overs are completed or the team gets all out
        boolean flag= fi.getOvers() == fi.getTotalOvers() || fi.getWickets() == 10;
        return flag;
    }

    //Writing match on file to keep records
    private void writeMatchOnFile()
    {
        Match m=new Match(this.fi,this.si,InputGUI.m.getMatchId());
        fileOperations.writeToFile(m);
    }

    //check if second innings is complete
    //second Innings completion means match is complete
    private void checkIfMatchCompleteDisplayWinner()
    {
        boolean flag=si.getOvers()==si.getTotalOvers() || si.getWickets()==10 || si.getRuns()>=fi.getRuns();
        if(flag)
        {
            JOptionPane.showMessageDialog(null, "SECOND INNINGS COMPLETE", "", JOptionPane.INFORMATION_MESSAGE);
            dispose();

            if(fi.getRuns()>si.getRuns())
            {
                writeMatchOnFile();
                JOptionPane.showMessageDialog(null, String.format("WINNER OF MATCH %s",fi.getTeamName().toUpperCase()), "", JOptionPane.INFORMATION_MESSAGE);
            }
            else if(fi.getRuns()<si.getRuns())
            {
                writeMatchOnFile();
                JOptionPane.showMessageDialog(null, String.format("WINNER OF MATCH %s",si.getTeamName().toUpperCase()), "", JOptionPane.INFORMATION_MESSAGE);
            }
            else if(fi.getRuns()==si.getRuns())
            {
                writeMatchOnFile();
                JOptionPane.showMessageDialog(null, "DRAW", "", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }


    //DISPLAY DATA ON FRAME
    private void DisplayOnFrame()
    {
        if(!checkIfFirstInningsComplete())
        {
            l2l2.setText(String.valueOf(fi.getRuns()));
            l2l3.setText(String.valueOf(fi.getWickets()));
            l2l4.setText(String.format("%.1f",fi.getOvers()));
            l2l5.setText(String.valueOf(fi.getExtras()));
        }
        else if(checkIfFirstInningsComplete())
        {
            Color red=new Color(255, 80, 80);
            Border redB=BorderFactory.createLineBorder(red,1);
            if(i==0)
            {
                l1l1.setText("        ");
                l1l2.setText("        ");
                l1l3.setText("        ");
                l1l4.setText("        ");
                l1l5.setText("        ");
                l1l6.setText("        ");
                l1l7.setText("        ");
                l1l8.setText("        ");
                l1l9.setText("        ");
                l1l10.setText("        ");
                l2l2.setText("");
                l2l3.setText("");
                l2l4.setText("");
                l2l5.setText("");
                leftP.setBackground(red);
                leftP.setBorder(redB);
                l.setText(si.getTeamName());
                inningsL.setText("SECOND INNINGS");
                JOptionPane.showMessageDialog(null, "FIRST INNINGS COMPLETE", "", JOptionPane.INFORMATION_MESSAGE);
                i++;
            }
            l2l2.setText(String.valueOf(si.getRuns()));
            l2l3.setText(String.valueOf(si.getWickets()));
            l2l4.setText(String.format("%.1f",si.getOvers()));
            l2l5.setText(String.valueOf(si.getExtras()));
        }
    }

    private void actions(String s)
    {
        if(!checkIfFirstInningsComplete())
        {
            fi.Balling(s);
            DisplayOnFrame();
        }
        else
        {
            si.Balling(s);
            DisplayOnFrame();
            checkIfMatchCompleteDisplayWinner();
        }
    }

    public class MyActionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(e.getActionCommand().equals("1"))
            {
                actions("1");
            }
            if(e.getActionCommand().matches("2"))
            {
                actions("2");
            }
            if(e.getActionCommand().matches("3"))
            {
                actions("3");
            }
            if(e.getActionCommand().matches("4"))
            {
                actions("4");
            }
            if(e.getActionCommand().matches("5"))
            {
                actions("5");
            }
            if(e.getActionCommand().matches("6"))
            {
                actions("6");
            }
            if(e.getActionCommand().matches("0"))
            {
                actions("0");
            }
            if(e.getActionCommand().matches("W"))
            {
                //FIRST INNINGS TEAM PLAYERS
                Player[] playersA=fi.getTeam().getPlayers();
                //SECOND INNINGS TEAM PLAYERS
                Player[] playersB=si.getTeam().getPlayers();
                if(!checkIfFirstInningsComplete())
                {
                    int j=0;
                    for(int i=0;i<playersA.length;i++)
                    {
                        if (!playersA[i].Out())
                        {
                            j=i;
                            playersA[i].setOut(true);
                            break;
                        }
                    }
                    switch (j) {
                        case 0 -> l1l1.setText(playersA[j].getName());
                        case 1 -> l1l2.setText(playersA[j].getName());
                        case 2 -> l1l3.setText(playersA[j].getName());
                        case 3 -> l1l4.setText(playersA[j].getName());
                        case 4 -> l1l5.setText(playersA[j].getName());
                        case 5 -> l1l6.setText(playersA[j].getName());
                        case 6 -> l1l7.setText(playersA[j].getName());
                        case 7 -> l1l8.setText(playersA[j].getName());
                        case 8 -> l1l9.setText(playersA[j].getName());
                        case 9 -> l1l10.setText(playersA[j].getName());
                    }
                }
                else if(checkIfFirstInningsComplete())
                {
                    int j=0;
                    for(int i=0;i<playersB.length;i++)
                    {
                        if (!playersB[i].Out())
                        {
                            j=i;
                            playersB[i].setOut(true);
                            break;
                        }
                    }
                    switch (j) {
                        case 0 -> l1l1.setText(playersB[j].getName());
                        case 1 -> l1l2.setText(playersB[j].getName());
                        case 2 -> l1l3.setText(playersB[j].getName());
                        case 3 -> l1l4.setText(playersB[j].getName());
                        case 4 -> l1l5.setText(playersB[j].getName());
                        case 5 -> l1l6.setText(playersB[j].getName());
                        case 6 -> l1l7.setText(playersB[j].getName());
                        case 7 -> l1l8.setText(playersB[j].getName());
                        case 8 -> l1l9.setText(playersB[j].getName());
                        case 9 -> l1l10.setText(playersB[j].getName());
                    }
                }
                actions("W");
            }
            if(e.getActionCommand().matches("WB"))
            {
                actions("WB");
            }
            if(e.getActionCommand().matches("NB"))
            {
                actions("NB");
            }
            if(e.getActionCommand().matches("BY1"))
            {
                actions("BY1");
            }
            if(e.getActionCommand().matches("BY2"))
            {
                actions("BY2");
            }
            if(e.getActionCommand().matches("BY3"))
            {
                actions("BY3");
            }
            if(e.getActionCommand().matches("BY4"))
            {
                actions("BY4");
            }
        }
    }

    public static class MyMouseListener implements MouseListener
    {
        Color orange=new Color(255, 182, 54);
        @Override
        public void mouseClicked(MouseEvent e) {
            e.getComponent().setBackground(Color.YELLOW);
        }
        @Override
        public void mousePressed(MouseEvent e) {
            e.getComponent().setBackground(Color.YELLOW);
        }
        @Override
        public void mouseReleased(MouseEvent e) {
            e.getComponent().setBackground(Color.YELLOW);
        }
        @Override
        public void mouseEntered(MouseEvent e) {
            e.getComponent().setBackground(Color.YELLOW);
        }
        @Override
        public void mouseExited(MouseEvent e) {
            e.getComponent().setBackground(orange);
        }
    }
}
