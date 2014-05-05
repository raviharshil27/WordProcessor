package wordprocessor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Harshil
 */
public class CharactorFactory {

    private Map<Character , CharacterFlyWeight> characterMap = new HashMap<>();
    private List<FontFlyWeight> fontList = new ArrayList<>();
    
    
    private CharactorFactory(){}
    
    private static class CharactorSingelton{
        private final static CharactorFactory instance = new CharactorFactory();
    }
    
    public static CharactorFactory getObject()
    {
        return CharactorSingelton.instance;
    }
    
    public CharacterFlyWeight getCharacter(Character inputChar)
    {
        CharacterFlyWeight character = null;
        if (characterMap.containsKey(inputChar)) {
             character  =  characterMap.get(inputChar);
        }
        else
        {
            character = new ConcreteCharacter(inputChar);
            characterMap.put(inputChar, character);
        }
        return character;
    }
    
    public FontFlyWeight getFont(String fontName , int size , String style)
    {
        FontFlyWeight font = new ConcreteFont(fontName, size, style);
        if(fontList.contains(font))
        {
            int index = fontList.indexOf(font);
            font = fontList.get(index);
        }
        else 
            fontList.add(font);
        return font;
    }
    
    
}
