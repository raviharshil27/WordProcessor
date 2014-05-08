package wordprocessor;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Harshil
 */
public class CharacterFactory {

    private Map<Integer, CharacterFlyWeight> characterMap = new HashMap<>();

    private CharacterFactory() {
    }

    private static class CharactorSingelton {

        private final static CharacterFactory instance = new CharacterFactory();
    }

    public static CharacterFactory getObject() {
        return CharactorSingelton.instance;
    }

    public CharacterFlyWeight getCharacter(Character inputChar) {
        CharacterFlyWeight character = null;
        int codePoint = (int) inputChar;
        if (characterMap.containsKey(codePoint)) {
            character = characterMap.get(codePoint);
        } else {
            character = new CharacterFlyWeight(inputChar);
            characterMap.put(codePoint, character);
        }
        return character;
    }

}
