/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wordprocessor;

import com.util.size.SizeofUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Harshil
 */
public class WordProcessor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
//            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Harshil.Harshil-PC\\Desktop\\sample.txt"));
            InputStream is = new FileInputStream(new File("C:\\Users\\Harshil.Harshil-PC\\Desktop\\sample.txt"));
            InputStreamReader isr = new InputStreamReader(is , "UTF-8");
            int  c ;
            int counter =0;
                            CharacterFactory charFactory =  CharacterFactory.getObject();

            while( (c = isr.read()) != -1)
            {
                
//                System.out.println((int) c +" "+ (char)c+" "+ counter++);
//                System.out.println((char)c+"-"+(int) c +"-"+ counter++);
                charFactory.getCharacter((char)c);
                
//                counter++;
            }
            System.out.println("\n"+counter);
            isr.close();
            
            is.close();
            
//            System.out.println(charFactory.getCharacterMap().keySet().size());
            getSize();
//            String currentLine =null;
//            while((currentLine= br.readLine()) != null)
//            {
//                System.out.println(currentLine);
//            }
//            br.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(WordProcessor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(WordProcessor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static  void getSize( )
    {
        System.out.printf("The average size of an Array", new SizeofUtil()
        { 
//            CharacterFactory obj = null;
            FontFactory f =null;
            @Override 
            protected int create() 
            { 
                f = FontFactory.getObject();
                return 1; 
            }
        }.averageBytes());
    }
}
