package test;

import java.awt.Font;
import org.junit.Test;
import static org.junit.Assert.*;
import wordprocessor.CharacterFlyWeight;
import wordprocessor.CharacterFactory;
import wordprocessor.FontFactory;

/**
 *
 * @author Harshil
 */
public class SingeltonTest {

    public SingeltonTest() {
    }


    @Test
    public void FontTest() {
        FontFactory fontFactory = FontFactory.getObject();
        Font fontA = fontFactory.getFont("times", Font.BOLD, 2);
        Font fontCopy = new Font("times", Font.BOLD, 2);
        //equals checks whether they have same values or not...
        assertEquals(fontA, fontCopy);
        //same check whether they refer to the same values or not.....
        assertNotSame(fontA, fontCopy);
        assertSame(fontA, FontFactory.getObject().getFont("times", Font.BOLD, 2));
    }
    
    @Test
    public void CharacterTest()
    {
        CharacterFactory characterFactory = CharacterFactory.getObject();
        CharacterFlyWeight character = new CharacterFlyWeight('a');
        CharacterFlyWeight factoryCharacter = characterFactory.getCharacter('a');
        //equals checks whether they have same values or not...
        assertEquals(character, factoryCharacter);
        //same check whether they refer to the same values or not.....
        assertNotSame(character, factoryCharacter);
        System.out.println(CharacterFactory.getObject().getCharacter('a'));
        assertSame( characterFactory.getObject().getCharacter('a'), factoryCharacter);
       
    }
}
