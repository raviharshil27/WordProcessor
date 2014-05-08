package wordprocessor;

/**
 *
 * @author Harshil
 */
public class CharacterFlyWeight
{
    private int codePoint;

    public CharacterFlyWeight(Character inputChar) 
    {
        this.codePoint = (int)inputChar;
    }

    //the equals method is used for the test case so that
    //we can compare 2 CharacterFlyweight objects
    @Override
    public boolean equals(Object obj) {
        CharacterFlyWeight characterFlyWeight = (CharacterFlyWeight ) obj;
        
        if(characterFlyWeight.codePoint ==  this.codePoint)
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + this.codePoint;
        return hash;
    }
    
    
}
