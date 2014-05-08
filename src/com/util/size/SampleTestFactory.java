/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.util.size;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import wordprocessor.CharacterFlyWeight;
import wordprocessor.CharacterFactory;
import wordprocessor.CharacterFlyWeight;

/**
 *
 * @author Harshil
 */
public class SampleTestFactory {
    
    public static void main(String args[])
    {
        StringBuffer sb = new  StringBuffer();
        sb.append("CS 635 Advanced Object-Oriented Design & Programming\n");
        sb.append("Spring Semester, 2014\n");
        sb.append("Doc 19 Facade & Mediator\n");
        sb.append("April 24, 2014\n");
        sb.append("Copyright ©, All rights reserved. 2014 SDSU & Roger Whitney, 5500 Campanile Drive, San Diego, CA 92182-7700 USA. OpenContent (http://www.opencontent.org/opl.shtml) license defines the copyright on this document.");
        String s = sb.toString();
        char[] c = s.toCharArray();
        
        getfactorySize(s);
        
    }
    
    public static void getfactorySize(final String s )
    {
        System.out.printf("The average size of an Character is %.1f bytes%n", new SizeofUtil() {
            CharacterFlyWeight cg = null;
            @Override
            protected int create() {
                
                try {
                    
                    cg = new CharacterFlyWeight('s');
                    
                } catch (Exception ex) {
                    Logger.getLogger(SizeOfUtilTest.class.getName()).log(Level.SEVERE, null, ex);
                }
                return 1;
            }
        }.averageBytes());
    
    }
}
