package com.company;

import java.io.*;

public class fileOperations
{
    //WRITE OBJECT ON FILE
    public static void writeToFile(Match m)
    {
        try
        {
            File f=new File("Matches.ser");
            ObjectOutputStream oos;
            if(f.exists())
            {
                oos=new MyObjectOutputStream(new FileOutputStream(f,true));
            }
            else
            {
                oos=new ObjectOutputStream(new FileOutputStream(f));
            }
            oos.writeObject(m);
            oos.close();
        }
        catch(IOException e)
        {
            System.out.println("ERROR IN THE FILE WRITING");
        }
    }

    public static void readMatchesFromFile()
    {
        try
        {
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("Matches.ser"));
            while(true)
            {
                Match m=(Match)ois.readObject();
            }
        }
        catch(ClassNotFoundException f)
        {
            System.out.println("CLASS NOT FOUND");
        }
        catch (EOFException eof)
        {
            System.out.println("EOF EXCEPTION");
        }
        catch(IOException e)
        {
            System.out.println("ERROR IN THE FILE READING");
        }
    }

    public static boolean searchMatch(int id)
    {
        try
        {
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("Matches.ser"));
            while(true)
            {
                Match m=(Match)ois.readObject();
                if(m.getMatchId()==id)
                {
                    return true;
                }
            }
        }
        catch(ClassNotFoundException f)
        {
            System.out.println("CLASS NOT FOUND");
        }
        catch (EOFException eof)
        {
            System.out.println("EOF EXCEPTION");
        }
        catch(IOException e)
        {
            System.out.println("ERROR IN THE FILE READING");
        }
        return false;
    }

    public static Match getMatch(int id)
    {
        try
        {
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("Matches.ser"));
            while(true)
            {
                Match m=(Match)ois.readObject();
                if(m.getMatchId()==id)
                {
                    return m;
                }
            }
        }
        catch(ClassNotFoundException f)
        {
            System.out.println("CLASS NOT FOUND");
        }
        catch (EOFException eof)
        {
            System.out.println("EOF EXCEPTION");
        }
        catch(IOException e)
        {
            System.out.println("ERROR IN THE FILE READING");
        }
        return null;
    }
}
