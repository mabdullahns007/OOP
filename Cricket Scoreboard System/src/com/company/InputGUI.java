package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputGUI extends JFrame
{
    JTextField ap1,ap2,ap3,ap4,ap5,ap6,ap7,ap8,ap9,ap10,ap11;
    JTextField bp1,bp2,bp3,bp4,bp5,bp6,bp7,bp8,bp9,bp10,bp11;
    JLabel epl;
    JTextField ta,tb;
    JLabel la,lb;
    JSlider overs;
    JLabel oversL;
    JButton b1;

    JPanel teamPlayers;
    JPanel enterPlayers;
    JPanel upperPanel;
    JPanel lowerPanel;

    //TEAMS
    static Team A;
    static Team B;
    static int totalOvers;
    static Match m;

    InputGUI()
    {
        //SETTING MATCH ID
        m=new Match();

        int z=0;

        do
        {
            try
            {
                String s=JOptionPane.showInputDialog("ENTER MATCH ID");
                z=Integer.parseInt(s);
                if(fileOperations.searchMatch(z))
                {
                    JOptionPane.showMessageDialog(null,"MATCH ID ALREADY PRESENT", "", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    break;
                }
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null,"PLEASE ENTER VALID ID", "", JOptionPane.INFORMATION_MESSAGE);
            }

        } while (fileOperations.searchMatch(z));

        m.setMatchId(z);


        //PROPERTIES
        setSize(400,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));
        //FOR CENTER FRAME ORIENTATION
        setLocationRelativeTo(null);

        //Accessories
        Font f=new Font(Font.SANS_SERIF, Font.BOLD,20);
        Font tF=new Font(Font.SANS_SERIF, Font.BOLD,12);
        Color red=new Color(255, 80, 80);
        Color blue=new Color(80, 156, 255);
        Color green=new Color(109, 255, 80);
        Color gray=new Color(32, 32, 32);
        Border redB=BorderFactory.createLineBorder(red,1);
        Border blueB=BorderFactory.createLineBorder(blue,1);

        //TEAM A
        ap1=new JTextField(15);
        ap1.setCaretColor(Color.white);
        ap1.setBorder(BorderFactory.createLineBorder(Color.black,1));
        ap1.setFont(tF);
        ap1.setBackground(gray);
        ap1.setForeground(Color.WHITE);
        ap2=new JTextField(15);
        ap2.setCaretColor(Color.white);
        ap2.setBorder(BorderFactory.createLineBorder(Color.black,1));
        ap2.setFont(tF);
        ap2.setBackground(gray);
        ap2.setForeground(Color.WHITE);
        ap3=new JTextField(15);
        ap3.setCaretColor(Color.white);
        ap3.setBorder(BorderFactory.createLineBorder(Color.black,1));
        ap3.setFont(tF);
        ap3.setBackground(gray);
        ap3.setForeground(Color.WHITE);
        ap4=new JTextField(15);
        ap4.setCaretColor(Color.white);
        ap4.setBorder(BorderFactory.createLineBorder(Color.black,1));
        ap4.setFont(tF);
        ap4.setBackground(gray);
        ap4.setForeground(Color.WHITE);
        ap5=new JTextField(15);
        ap5.setCaretColor(Color.white);
        ap5.setBorder(BorderFactory.createLineBorder(Color.black,1));
        ap5.setFont(tF);
        ap5.setBackground(gray);
        ap5.setForeground(Color.WHITE);
        ap6=new JTextField(15);
        ap6.setCaretColor(Color.white);
        ap6.setBorder(BorderFactory.createLineBorder(Color.black,1));
        ap6.setFont(tF);
        ap6.setBackground(gray);
        ap6.setForeground(Color.WHITE);
        ap7=new JTextField(15);
        ap7.setCaretColor(Color.white);
        ap7.setBorder(BorderFactory.createLineBorder(Color.black,1));
        ap7.setFont(tF);
        ap7.setBackground(gray);
        ap7.setForeground(Color.WHITE);
        ap8=new JTextField(15);
        ap8.setCaretColor(Color.white);
        ap8.setBorder(BorderFactory.createLineBorder(Color.black,1));
        ap8.setFont(tF);
        ap8.setBackground(gray);
        ap8.setForeground(Color.WHITE);
        ap9=new JTextField(15);
        ap9.setCaretColor(Color.white);
        ap9.setBorder(BorderFactory.createLineBorder(Color.black,1));
        ap9.setFont(tF);
        ap9.setBackground(gray);
        ap9.setForeground(Color.WHITE);
        ap10=new JTextField(15);
        ap10.setCaretColor(Color.white);
        ap10.setBorder(BorderFactory.createLineBorder(Color.black,1));
        ap10.setFont(tF);
        ap10.setBackground(gray);
        ap10.setForeground(Color.WHITE);
        ap11=new JTextField(15);
        ap11.setCaretColor(Color.white);
        ap11.setBorder(BorderFactory.createLineBorder(Color.black,1));
        ap11.setFont(tF);
        ap11.setBackground(gray);
        ap11.setForeground(Color.WHITE);

        JPanel teamA=new JPanel(new GridLayout(6,2,10,60));
        teamA.setBackground(blue);
        teamA.setBorder(blueB);
        teamA.add(ap1);
        teamA.add(ap2);
        teamA.add(ap3);
        teamA.add(ap4);
        teamA.add(ap5);
        teamA.add(ap6);
        teamA.add(ap7);
        teamA.add(ap8);
        teamA.add(ap9);
        teamA.add(ap10);
        teamA.add(ap11);

        //TEAM B
        bp1=new JTextField(15);
        bp1.setCaretColor(Color.white);
        bp1.setBorder(BorderFactory.createLineBorder(Color.black,1));
        bp1.setFont(tF);
        bp1.setBackground(gray);
        bp1.setForeground(Color.WHITE);
        bp2=new JTextField(15);
        bp2.setCaretColor(Color.white);
        bp2.setBorder(BorderFactory.createLineBorder(Color.black,1));
        bp2.setFont(tF);
        bp2.setBackground(gray);
        bp2.setForeground(Color.WHITE);
        bp3=new JTextField(15);
        bp3.setCaretColor(Color.white);
        bp3.setBorder(BorderFactory.createLineBorder(Color.black,1));
        bp3.setFont(tF);
        bp3.setBackground(gray);
        bp3.setForeground(Color.WHITE);
        bp4=new JTextField(15);
        bp4.setCaretColor(Color.white);
        bp4.setBorder(BorderFactory.createLineBorder(Color.black,1));
        bp4.setFont(tF);
        bp4.setBackground(gray);
        bp4.setForeground(Color.WHITE);
        bp5=new JTextField(15);
        bp5.setCaretColor(Color.white);
        bp5.setBorder(BorderFactory.createLineBorder(Color.black,1));
        bp5.setFont(tF);
        bp5.setBackground(gray);
        bp5.setForeground(Color.WHITE);
        bp6=new JTextField(15);
        bp6.setCaretColor(Color.white);
        bp6.setBorder(BorderFactory.createLineBorder(Color.black,1));
        bp6.setFont(tF);
        bp6.setBackground(gray);
        bp6.setForeground(Color.WHITE);
        bp7=new JTextField(15);
        bp7.setCaretColor(Color.white);
        bp7.setBorder(BorderFactory.createLineBorder(Color.black,1));
        bp7.setFont(tF);
        bp7.setBackground(gray);
        bp7.setForeground(Color.WHITE);
        bp8=new JTextField(15);
        bp8.setCaretColor(Color.white);
        bp8.setBorder(BorderFactory.createLineBorder(Color.black,1));
        bp8.setFont(tF);
        bp8.setBackground(gray);
        bp8.setForeground(Color.WHITE);
        bp9=new JTextField(15);
        bp9.setCaretColor(Color.white);
        bp9.setBorder(BorderFactory.createLineBorder(Color.black,1));
        bp9.setFont(tF);
        bp9.setBackground(gray);
        bp9.setForeground(Color.WHITE);
        bp10=new JTextField(15);
        bp10.setCaretColor(Color.white);
        bp10.setBorder(BorderFactory.createLineBorder(Color.black,1));
        bp10.setFont(tF);
        bp10.setBackground(gray);
        bp10.setForeground(Color.WHITE);
        bp11=new JTextField(15);
        bp11.setCaretColor(Color.white);
        bp11.setBorder(BorderFactory.createLineBorder(Color.black,1));
        bp11.setFont(tF);
        bp11.setBackground(gray);
        bp11.setForeground(Color.WHITE);

        JPanel teamB=new JPanel(new GridLayout(6,2,10,60));
        teamB.setBackground(red);
        teamB.setBorder(redB);
        teamB.add(bp1);
        teamB.add(bp2);
        teamB.add(bp3);
        teamB.add(bp4);
        teamB.add(bp5);
        teamB.add(bp6);
        teamB.add(bp7);
        teamB.add(bp8);
        teamB.add(bp9);
        teamB.add(bp10);
        teamB.add(bp11);

        teamPlayers=new JPanel();
        teamPlayers.setLayout(new BoxLayout(teamPlayers,BoxLayout.X_AXIS));
        teamPlayers.add(teamA);
        teamPlayers.add(teamB);

        //ENTER PLAYERS PANEL
        epl=new JLabel("ENTER PLAYERS");
        epl.setForeground(Color.white);
        epl.setFont(f);
        enterPlayers=new JPanel(new FlowLayout());
        enterPlayers.setBackground(Color.black);
        enterPlayers.add(epl);

        //UPPER PANEL
        ta=new JTextField(15);
        ta.setCaretColor(Color.white);
        ta.setBorder(BorderFactory.createLineBorder(Color.black,1));
        ta.setFont(new Font(Font.SANS_SERIF, Font.BOLD,16));
        ta.setBackground(gray);
        ta.setForeground(Color.white);
        tb=new JTextField(15);
        tb.setCaretColor(Color.white);
        tb.setBorder(BorderFactory.createLineBorder(Color.black,1));
        tb.setFont(new Font(Font.SANS_SERIF, Font.BOLD,16));
        tb.setBackground(gray);
        tb.setForeground(Color.white);
        la=new JLabel("TEAM A");
        la.setForeground(Color.black);
        la.setFont(f);
        lb=new JLabel("TEAM B");
        lb.setForeground(Color.black);
        lb.setFont(f);

        JPanel upA=new JPanel(new GridLayout(1,2));
        upA.setBackground(blue);
        upA.setBorder(blueB);
        upA.add(la);
        upA.add(ta);
        JPanel upB=new JPanel(new GridLayout(1,2));
        upB.setBorder(redB);
        upB.setBackground(red);
        upB.add(lb);
        upB.add(tb);

        upperPanel=new JPanel();
        upperPanel.setLayout(new BoxLayout(upperPanel,BoxLayout.X_AXIS));
        upperPanel.add(upA);
        upperPanel.add(upB);

        //LOWER PANEL
        b1=new JButton("TOSS");
        b1.setForeground(Color.black);
        b1.setBackground(green);
        b1.setFocusPainted(false);
        b1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b1.setBackground(Color.green);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1.setBackground(green);
            }
        });
        b1.setBorder(BorderFactory.createLineBorder(green,1));
        b1.setFont(f);
        MyActionListener a=new MyActionListener();
        b1.addActionListener(a);
        overs=new JSlider();
        overs.setBackground(Color.black);
        overs.setForeground(Color.white);
        oversL=new JLabel("OVERS ");
        oversL.setForeground(Color.white);
        oversL.setFont(f);
        overs.setMajorTickSpacing(6);
        overs.setPaintLabels(true);
        overs.setPaintTicks(true);
        overs.setMinimum(1);
        overs.setMaximum(20);
        event e=new event();
        overs.addChangeListener(e);

        JPanel lower1=new JPanel();
        lower1.setLayout(new BorderLayout());
        lower1.add(overs,BorderLayout.WEST);
        lower1.add(oversL,BorderLayout.CENTER);
        lower1.setBorder(BorderFactory.createLineBorder(Color.black,2));
        lower1.setBackground(Color.black);
        JPanel lower2=new JPanel(new FlowLayout());
        lower2.add(b1);
        lower2.setBorder(BorderFactory.createLineBorder(Color.black,2));
        lower2.setBackground(Color.black);

        lowerPanel=new JPanel();
        lowerPanel.setLayout(new BoxLayout(lowerPanel,BoxLayout.Y_AXIS));
        lowerPanel.add(lower1);
        lowerPanel.add(lower2);

        add(upperPanel);
        add(enterPlayers);
        add(teamPlayers);
        add(lowerPanel);

        Image inputs=Toolkit.getDefaultToolkit().getImage("C:\\KAM 25\\WORK PROFILE\\3RD SEMESTER\\OOP\\Assignments Solutions\\Project\\resource\\inputs.png");
        this.setIconImage(inputs);
        //OTHER USEFUL PROPERTIES
        this.setTitle("INPUTS");
        setResizable(false);
        setVisible(true);
    }

    //to get state of Objects
    public static Team getA()
    {
        return A;
    }
    public static Team getB()
    {
        return B;
    }

    public static int getTotalOvers() {return totalOvers;}

    //EVENT CLASS TO GET CURRENT STATE OF J SLIDER
    public class event implements ChangeListener
    {
        @Override
        public void stateChanged(ChangeEvent e)
        {
            int value=overs.getValue();
            oversL.setText("OVERS "+value);
        }
    }

    public class MyActionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(e.getActionCommand().equals("TOSS"))
            {
                //Getting total overs
                totalOvers=overs.getValue();

                //Getting Team A Players
                Player teamAp1=new Player(ap1.getText());
                Player teamAp2=new Player(ap2.getText());
                Player teamAp3=new Player(ap3.getText());
                Player teamAp4=new Player(ap4.getText());
                Player teamAp5=new Player(ap5.getText());
                Player teamAp6=new Player(ap6.getText());
                Player teamAp7=new Player(ap7.getText());
                Player teamAp8=new Player(ap8.getText());
                Player teamAp9=new Player(ap9.getText());
                Player teamAp10=new Player(ap10.getText());
                Player teamAp11=new Player(ap11.getText());

                //Getting Team A Players
                Player teamBp1=new Player(bp1.getText());
                Player teamBp2=new Player(bp2.getText());
                Player teamBp3=new Player(bp3.getText());
                Player teamBp4=new Player(bp4.getText());
                Player teamBp5=new Player(bp5.getText());
                Player teamBp6=new Player(bp6.getText());
                Player teamBp7=new Player(bp7.getText());
                Player teamBp8=new Player(bp8.getText());
                Player teamBp9=new Player(bp9.getText());
                Player teamBp10=new Player(bp10.getText());
                Player teamBp11=new Player(bp11.getText());

                //TEAM A
                Player []teamAPlayers =
                {teamAp1,teamAp2,teamAp3,teamAp4,teamAp5,teamAp6,teamAp7,teamAp8,teamAp9,teamAp10,teamAp11};

                //TEAM B
                Player []teamBPlayers =
                        {teamBp1,teamBp2,teamBp3,teamBp4,teamBp5,teamBp6,teamBp7,teamBp8,teamBp9,teamBp10,teamBp11};
                A=new Team(ta.getText(),teamAPlayers);
                B=new Team(tb.getText(),teamBPlayers);

                //close Window
                dispose();

                //new window open
                TossSelectionGUI t=new TossSelectionGUI();
            }
        }
    }

    public static void main(String[] args) {
        InputGUI i=new InputGUI();
    }
}
