package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MenuGUI extends JFrame
{
    //Static Match Object
    static Match m;
    JButton b1,b2;
    class BgPanel extends JPanel
    {
        Image bg=new ImageIcon("background.jpg").getImage();

        @Override
        public void paintComponent(Graphics g) {
            g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
        }
    }

    class LoginPanel extends JPanel
    {
        LoginPanel()
        {
            Color Pink =new Color(127, 0, 255);
            Color lightPink =new Color(255, 102, 178);
            Font f=new Font(Font.SANS_SERIF, Font.BOLD,14);

            setOpaque(false);
            setLayout(new FlowLayout());

            b1=new JButton("NEW MATCH");
            b1.setBackground(lightPink);
            b1.setBorder(BorderFactory.createLineBorder(lightPink,1));
            b1.setFont(f);
            b1.setFocusPainted(false);
            b1.setBorderPainted(false);
            b1.setForeground(Color.BLACK);

            b2=new JButton("VIEW MATCH");
            b2.setBackground(Pink);
            b2.setBorder(BorderFactory.createLineBorder(Pink,1));
            b2.setFont(f);
            b2.setFocusPainted(false);
            b2.setBorderPainted(false);
            b2.setForeground(Color.BLACK);

            MyMouseListener m=new MyMouseListener();
            MyActionListener a=new MyActionListener();

            b1.addMouseListener(m);
            b1.addActionListener(a);
            b2.addMouseListener(m);
            b2.addActionListener(a);


            JPanel g=new JPanel(new BorderLayout());

            g.add(b1,BorderLayout.NORTH);
            g.add(b2,BorderLayout.SOUTH);

            add(g);
        }
    }
    class MyActionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(e.getActionCommand().equals("NEW MATCH"))
            {
                dispose();
                InputGUI i=new InputGUI();
            }
            if(e.getActionCommand().equals("VIEW MATCH"))
            {
                    try
                    {
                        int x=Integer.parseInt(JOptionPane.showInputDialog("ENTER MATCH ID"));
                        if(fileOperations.searchMatch(x))
                        {
                            m=fileOperations.getMatch(x);
                            ViewMatchGUI g=new ViewMatchGUI();
                            g.setM(m);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"MATCH NOT FOUND", "", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    catch(NumberFormatException z)
                    {
                        JOptionPane.showMessageDialog(null,"PLEASE ENTER VALID ID", "", JOptionPane.INFORMATION_MESSAGE);
                    }
            }
        }
    }

    public class MyMouseListener implements MouseListener
    {
        Color lightPink =new Color(255, 102, 178);
        Color Pink =new Color(127, 0, 255);

        @Override
        public void mouseClicked(MouseEvent e)
        {
            if(e.getComponent().equals(b1))
            {
                e.getComponent().setBackground(new Color(255, 51, 153));
            }
            if(e.getComponent().equals(b2))
            {
                e.getComponent().setBackground(new Color(102, 0, 204));
            }
        }
        @Override
        public void mousePressed(MouseEvent e)
        {
            if(e.getComponent().equals(b1))
            {
                e.getComponent().setBackground(new Color(255, 51, 153));
            }
            if(e.getComponent().equals(b2))
            {
                e.getComponent().setBackground(new Color(102, 0, 204));
            }
        }
        @Override
        public void mouseReleased(MouseEvent e)
        {
            if(e.getComponent().equals(b1))
            {
                e.getComponent().setBackground(new Color(255, 51, 153));
            }
            if(e.getComponent().equals(b2))
            {
                e.getComponent().setBackground(new Color(102, 0, 204));
            }
        }
        @Override
        public void mouseEntered(MouseEvent e)
        {
            if(e.getComponent().equals(b1))
            {
                e.getComponent().setBackground(new Color(255, 51, 153));
            }
            if(e.getComponent().equals(b2))
            {
                e.getComponent().setBackground(new Color(102, 0, 204));
            }
        }
        @Override
        public void mouseExited(MouseEvent e)
        {
            if(e.getComponent().equals(b1))
            {
                e.getComponent().setBackground(lightPink);
            }
            if(e.getComponent().equals(b2))
            {
                e.getComponent().setBackground(Pink);
            }

        }
    }

    MenuGUI()
    {
        JPanel bgPanel = new BgPanel();
        bgPanel.setLayout(new BorderLayout());
        bgPanel.add(new LoginPanel(), BorderLayout.CENTER);
        this.setContentPane(bgPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(300,90);
        this.setLocationRelativeTo(null);
        this.setTitle("Menu");
        Image menu=Toolkit.getDefaultToolkit().getImage("C:\\KAM 25\\WORK PROFILE\\3RD SEMESTER\\OOP\\Assignments Solutions\\Project\\resource\\menu.png");
        this.setIconImage(menu);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        MenuGUI m=new MenuGUI();
    }
}

