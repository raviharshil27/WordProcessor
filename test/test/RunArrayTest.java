package test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Font;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import wordprocessor.FontFactory;
import wordprocessor.RunArray;

/**
 *
 * @author Harshil
 */
public class RunArrayTest {
    
    private String inputData = null;
    public RunArrayTest() {
    }
        
     @Test
     public void runArrayTest() 
     {
         RunArray runArray = new RunArray();
         Font fontA = new Font("times", Font.BOLD, 2);
         runArray.addRun(0, 115, fontA);
         Font fontB = new Font("times", Font.ITALIC, 2);
         runArray.appendRun(211, fontB);
         assertEquals(runArray.getFont(110), fontA);
         assertEquals(runArray.getFont(150), fontB);
         assertEquals(runArray.getFont(0), fontA);
     }
     
     
}
