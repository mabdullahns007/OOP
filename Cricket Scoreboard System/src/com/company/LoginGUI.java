package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class LoginGUI extends JFrame
{
    JButton b1;
    JTextField t1;
    JPasswordField t2;

    //custom Panel
    class BgPanel extends JPanel
    {
        //background image
        Image bg=new ImageIcon("background.jpg").getImage();

        //overriding paint component and drawing image on panel background instead of setting background colour
        @Override
        public void paintComponent(Graphics g) {
            g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
        }
    }

    //LOGIN Panel
    class LoginPanel extends JPanel
    {
        LoginPanel()
        {
            Color pink =new Color(255, 102, 178);
            Font f=new Font(Font.SANS_SERIF, Font.BOLD,14);

            setOpaque(false);
            setLayout(new FlowLayout());
            t1=new JTextField(10);
            t1.setCaretColor(Color.white);
            t1.setFont(f);
            t1.setForeground(Color.WHITE);
            t1.setBorder(BorderFactory.createLineBorder(Color.black,1));
            t1.setBackground(Color.BLACK);
            t2=new JPasswordField(10);
            t2.setCaretColor(Color.white);
            t2.setFont(f);
            t2.setForeground(Color.WHITE);
            t2.setBackground(Color.BLACK);
            t2.setBorder(BorderFactory.createLineBorder(Color.black,1));
            b1=new JButton("SUBMIT");
            b1.setBackground(pink);
            b1.setFocusPainted(false);
            b1.setBorderPainted(false);
            b1.setForeground(Color.BLACK);
            b1.setFont(f);

            MyMouseListener m=new MyMouseListener();
            b1.addMouseListener(m);
            MyActionListener a=new MyActionListener();
            b1.addActionListener(a);

            JPanel g=new JPanel(new BorderLayout());
            g.add(t1,BorderLayout.NORTH);
            g.add(t2,BorderLayout.CENTER);
            g.add(b1,BorderLayout.SOUTH);

            add(g);
        }
    }

    public class MyMouseListener implements MouseListener
    {
        Color pink =new Color(255, 102, 178);
        @Override
        public void mouseClicked(MouseEvent e) {
            e.getComponent().setBackground(new Color(255, 51, 153));
        }
        @Override
        public void mousePressed(MouseEvent e) {
            e.getComponent().setBackground(new Color(255, 51, 153));
        }
        @Override
        public void mouseReleased(MouseEvent e) {
            e.getComponent().setBackground(new Color(255, 51, 153));
        }
        @Override
        public void mouseEntered(MouseEvent e) {
            e.getComponent().setBackground(new Color(255, 51, 153));
        }
        @Override
        public void mouseExited(MouseEvent e) {
            e.getComponent().setBackground(pink);
        }
    }

    class MyActionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(e.getActionCommand().equals("SUBMIT"))
            {
                if(t1.getText().matches("MANS007") && t2.getText().matches("abc1234"))
                {
                    dispose();
                    MenuGUI m=new MenuGUI();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"INVALID USERNAME OR PASSWORD", "", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }

    //Login Window
    LoginGUI()
    {
        JPanel bgPanel = new BgPanel();
        bgPanel.setLayout(new BorderLayout());
        bgPanel.add(new LoginPanel(), BorderLayout.CENTER);
        this.setContentPane(bgPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400,120);
        this.setLocationRelativeTo(null);
        Image login=Toolkit.getDefaultToolkit().getImage("C:\\KAM 25\\WORK PROFILE\\3RD SEMESTER\\OOP\\Assignments Solutions\\Project\\resource\\login.png");
        this.setTitle("LOGIN");
        this.setIconImage(login);
        this.setVisible(true);
    }

    public static void main(String[] args)
    {
        LoginGUI l=new LoginGUI();
    }
}

