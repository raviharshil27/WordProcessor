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
public class WordProcessor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConcreteFont f1 = new ConcreteFont("a", 2, "a");
        ConcreteFont f2 = new ConcreteFont("a", 2, "a");
        List<ConcreteFont> ls = new ArrayList<>();
        ls.add(f2);
        System.out.println(ls.indexOf(f1));
        if(ls.contains(f1))
            System.out.println("TRUE");
        else
            System.out.println("false");
    }
    
}
