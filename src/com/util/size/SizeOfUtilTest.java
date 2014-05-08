package com.util.size;

import java.awt.Font;
import java.util.logging.Level;
import java.util.logging.Logger;
import wordprocessor.CharacterFlyWeight;
import wordprocessor.CharacterFactory;
import wordprocessor.RunArray;

/**
 *
 * @author Harshil
 */
public class SizeOfUtilTest {

    public static void main(String args[]) throws  Exception 
    {
        StringBuffer sb = new  StringBuffer();
        sb.append("CS 635 Advanced Object-Oriented Design & Programming\n");
        sb.append("Spring Semester, 2014\n");
        sb.append("Doc 19 Facade & Mediator\n");
        sb.append("April 24, 2014\n");
        sb.append("Copyright ©, All rights reserved. 2014 SDSU & Roger Whitney, 5500 Campanile Drive, San Diego, CA 92182-7700 USA. OpenContent (http://www.opencontent.org/opl.shtml) license defines the copyright on this document.");
        String s = sb.toString();
        memoryUsageNoFlyweight(s);
        memoryUsageWithFlyWeight(s);
    }
    
    public static void memoryUsageWithFlyWeight(final String inputData)
    {
        System.out.printf("The total size of character and font with Flyweights is %.1f bytes%n", new SizeofUtil() 
        {
            CharacterFlyWeight[] cf = null;
            RunArray runArray =  null;
            
            @Override
            protected int create() {
                try {
                   cf =  new CharacterFlyWeight[inputData.length()];
                   runArray = new RunArray();
                    runArray.addRun(0, 115, new Font("times", Font.BOLD, 2));
                    runArray.appendRun(211, new Font("times", Font.ITALIC, 2));
                    for(int i= 0; i<inputData.length();i++)
                    {
                          cf[i]=CharacterFactory.getObject().getCharacter(inputData.charAt(i));
                    }
                } catch (Exception ex) {
                    Logger.getLogger(SizeOfUtilTest.class.getName()).log(Level.SEVERE, null, ex);
                }
                return 1;
            }
        }.averageBytes());
    }
    public static void memoryUsageNoFlyweight(final String inputData)
    {
        System.out.printf("The total size of character and font without Flyweights is %.1f bytes%n", new SizeofUtil() {
            char[] obj =  null;
            Font[] font = null;
            @Override
            protected int create() {
                
                try 
                {
                    obj = new char[inputData.length()];
                    font = new Font[inputData.length()];
                    for(int i = 0; i<inputData.length();i++)
                    {
                        if(i<115)
                            font[i] = new Font("times",Font.ITALIC,22);
                        else 
                            font[i]= new Font("times", Font.BOLD, 33);
                        obj[i] = inputData.charAt(i);
                    }
                    obj = inputData.toCharArray();
                } catch (Exception ex) {
                    Logger.getLogger(SizeOfUtilTest.class.getName()).log(Level.SEVERE, null, ex);
                }
                return 1;
            }
        }.averageBytes());
    }
}
