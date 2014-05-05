/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wordprocessor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Harshil
 */
public class RunArray {
    List<Integer> indexList = new ArrayList<>();
    List<FontFlyWeight> fontList = new ArrayList<>();
    
    

    public RunArray() {
    }
    
    public void addRun(int index, int length, FontFlyWeight font)
    {
        int startIndex = index;
        int endIndex = index + length;
        if(indexList.size() == 0)
            indexList.add(startIndex);
        indexList.add(endIndex);
        fontList.add(font);
        
    }
    
    public void appendRun(int index,FontFlyWeight font)
    {
        fontList.add(font);
    }
    
    public FontFlyWeight getFont(int index)
    {
        int i =0;
        int fontIndex=0;
        boolean fontFound = false;
        for(;i<indexList.size();i++)
        {
            if(indexList.get(i) > index )
            {
                break;
            }
        }
        return fontList.get(i-1);
                    
    }
    
    public static void main(String args[])
    {
        RunArray r = new RunArray();
        FontFlyWeight f = new ConcreteFont( "0", 0, "0");
        r.addRun(0, 10, f);
        f = new ConcreteFont( "1", 1, "1");
        r.addRun(10, 20, f);
        f = new ConcreteFont( "2", 2, "2");
        r.addRun(30, 20, f);
        f = new ConcreteFont( "3", 3, "3");
        r.appendRun(50, f);
        System.out.println(r.getFont(10));
    }
    
    
}
