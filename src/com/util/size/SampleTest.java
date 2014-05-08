package com.util.size;

import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.util.logging.Level;
import java.util.logging.Logger;
import wordprocessor.CharacterFactory;

/**
 *
 * @author Harshil
 */
public class SampleTest {
    
    public static void main(String args[])
    {
        StringBuffer sb = new  StringBuffer();
        sb.append("CS 635 Advanced Object-Oriented Design & Programming\n");
        sb.append("Spring Semester, 2014\n");
        sb.append("Doc 19 Facade & Mediator\n");
        sb.append("April 24, 2014\n");
        sb.append("Copyright ©, All rights reserved. 2014 SDSU & Roger Whitney, 5500 Campanile Drive, San Diego, CA 92182-7700 USA. OpenContent (http://www.opencontent.org/opl.shtml) license defines the copyright on this document.");
        String s = sb.toString();
        
        getCharacterSIze(s);
//        char[] c = s.toCharArray();
//        System.out.println(s.length());
        
       
    }
    
    public static void getCharacterSIze(final String s)
    {
        System.out.printf("The average size of an Character is %.1f bytes%n", new SizeofUtil() {
            char[] obj =  null;
            Font[] font = null;
            @Override
            protected int create() {
                
                try 
                {
                    obj = new char[326];
                    font = new Font[326];
                    for(int i = 0; i<326;i++)
                    {
                        if(i<115)
                            font[i] = new Font("times",Font.ITALIC,22);
                        else 
                            font[i]= new Font("times", Font.BOLD, 33);
                        obj[i] = s.charAt(i);
                    }
//                    obj = s.toCharArray();
                } catch (Exception ex) {
                    Logger.getLogger(SizeOfUtilTest.class.getName()).log(Level.SEVERE, null, ex);
                }
                return 1;
            }
        }.averageBytes());
    }
}