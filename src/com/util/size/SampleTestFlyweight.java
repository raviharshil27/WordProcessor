/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util.size;

import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import wordprocessor.CharacterFlyWeight;
import wordprocessor.CharacterFactory;
import wordprocessor.FontFactory;
import wordprocessor.RunArray;

/**
 *
 * @author Harshil
 */
public class SampleTestFlyweight {

    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer();
        sb.append("CS 635 Advanced Object-Oriented Design & Programming\n");
        sb.append("Spring Semester, 2014\n");
        sb.append("Doc 19 Facade & Mediator\n");
        sb.append("April 24, 2014\n");
        sb.append("Copyright ©, All rights reserved. 2014 SDSU & Roger Whitney, 5500 Campanile Drive, San Diego, CA 92182-7700 USA. OpenContent (http://www.opencontent.org/opl.shtml) license defines the copyright on this document.");
        final String s = sb.toString();
         final CharacterFactory charactorFactory = CharacterFactory.getObject();

//        for(int i =0;i<326;i++)
//        {
//            charactorFactory.getCharacter(s.charAt(i));
//        }
//        System.out.println();
                
        System.out.printf("The average size of an Character is %.1f bytes%n", new SizeofUtil() 
        {
            CharacterFlyWeight[] cf = null;
            RunArray runArray =  null;
            
            @Override
            protected int create() {
                try {
                   cf =  new CharacterFlyWeight[326];
//                   cf = new CharacterFlyWeight[326];
                   runArray = new RunArray();
                    runArray.addRun(0, 115, new Font("times", Font.BOLD, 2));
                    runArray.appendRun(211, new Font("times", Font.ITALIC, 2));
                    for(int i= 0; i<326;i++)
                    {
                          cf[i]=charactorFactory.getCharacter(s.charAt(i));
                    }
                } catch (Exception ex) {
                    Logger.getLogger(SizeOfUtilTest.class.getName()).log(Level.SEVERE, null, ex);
                }
                return 1;
            }
        }.averageBytes());//        char[] c = s.toCharArray();

    }

    public static void getCharacterSIze(final String s) {

    }

}
