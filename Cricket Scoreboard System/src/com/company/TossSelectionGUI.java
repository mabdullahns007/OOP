package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TossSelectionGUI extends JFrame
{   JLabel l1;
    JButton b1,b2;

    //INNINGS
    static Innings fi;
    static Innings si;

    //SCORECARDS
    static ScoreCard s1;
    static ScoreCard s2;

    //TEAMS
    Team A;
    Team B;

    TossSelectionGUI()
    {
        //PROPERTIES
        setSize(400,260);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //FOR CENTER FRAME ORIENTATION
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        //get TEAM A AND B
        this.A= InputGUI.getA();
        this.B= InputGUI.getB();
        //Accessories
        Font f=new Font(Font.SANS_SERIF, Font.BOLD,20);
        Color red=new Color(255, 80, 80);
        Color blue=new Color(80, 156, 255);
        Border redB=BorderFactory.createLineBorder(red,1);
        Border blueB=BorderFactory.createLineBorder(blue,1);


        JPanel q2=new JPanel();
        q2.setBackground(Color.black);
        ImageIcon icon=new ImageIcon((getClass().getResource("/BB.png")));
        JLabel imgL=new JLabel(icon);
        q2.add(imgL);

        JPanel q3=new JPanel(new FlowLayout());
        q3.setBackground(Color.black);
        b1=new JButton("BATTING");
        b1.setFocusPainted(false);
        b1.setBackground(blue);
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b1.setBackground(new Color(36,94,255));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1.setBackground(blue);
            }
        });
        b1.setForeground(Color.BLACK);
        b1.setBorder(blueB);
        b1.setFont(f);

        b2=new JButton("BALLING");
        b2.setFocusPainted(false);
        b2.setBackground(red);
        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b2.setBackground(new Color(255,36,36));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b2.setBackground(red);
            }
        });
        b2.setForeground(Color.BLACK);
        b2.setBorder(redB);
        b2.setFont(f);
        b2.setBounds(219,160,100,25);

        q3.add(b1);
        q3.add(b2);

        //adding actionListener
        MyActionListener a=new MyActionListener();
        b1.addActionListener(a);
        b2.addActionListener(a);

        JPanel q1=new JPanel(new FlowLayout());
        q1.setBackground(Color.black);

        //1 is Head , 0 is Tails
        int toss= (int) Math.round(Math.random());

        if(toss==0)
        {
            A.setToss(true);
            l1=new JLabel(A.getTeamName().toUpperCase()+" WON THE TOSS");
        }
        else
        {
            B.setToss(true);
            l1=new JLabel(B.getTeamName().toUpperCase()+" WON THE TOSS");
        }
        l1.setForeground(Color.white);
        l1.setFont(f);
        q1.add(l1);

        add(q1,BorderLayout.NORTH);
        add(q2,BorderLayout.CENTER);
        add(q3,BorderLayout.SOUTH);

        Image tossSelect=Toolkit.getDefaultToolkit().getImage("C:\\KAM 25\\WORK PROFILE\\3RD SEMESTER\\OOP\\Assignments Solutions\\Project\\resource\\tossSelect.png");
        this.setIconImage(tossSelect);
        //OTHER USEFUL PROPERTIES
        this.setTitle("TOSS");
        setResizable(false);
        setVisible(true);
    }

    //Getter for state of Innings
    public static Innings getFi() {return fi;}

    public static Innings getSi() {return si;}

    public class MyActionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            //If the toss winning team chooses Batting
            //Toss winning team will play first Innings
            //Second team will play second Innings
            if(e.getActionCommand().equals("BATTING"))
            {
                s1=new ScoreCard();
                s2=new ScoreCard();
                if(InputGUI.getA().getToss())
                {
                    fi=new Innings(s1,A, InputGUI.getTotalOvers());
                    si=new Innings(s2,B, InputGUI.getTotalOvers());
                }
                else
                {
                    fi=new Innings(s1,B, InputGUI.getTotalOvers());
                    si=new Innings(s2,A, InputGUI.getTotalOvers());
                }

                //close Window
                dispose();

                ScoreCardGUI i=new ScoreCardGUI();
            }
            //If the toss winning team chooses Balling
            //Toss winning team will play second Innings
            //Second team will play first Innings
            else if(e.getActionCommand().equals("BALLING"))
            {
                s1=new ScoreCard();
                s2=new ScoreCard();
                if(InputGUI.getA().getToss())
                {
                    fi=new Innings(s1,B, InputGUI.getTotalOvers());
                    si=new Innings(s2,A, InputGUI.getTotalOvers());
                }
                else
                {
                    fi=new Innings(s1,A, InputGUI.getTotalOvers());
                    si=new Innings(s2,B, InputGUI.getTotalOvers());
                }

                //close Window
                dispose();

                ScoreCardGUI i=new ScoreCardGUI();
            }
        }
    }
}
