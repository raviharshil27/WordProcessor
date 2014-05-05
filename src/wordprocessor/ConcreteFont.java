package wordprocessor;

import java.util.Objects;

/**
 *
 * @author Harshil
 */
public class ConcreteFont implements FontFlyWeight{
    
    private String fontName = null;
    private int size =0;
    private String style = null;
    
    public ConcreteFont(String fontName , int size, String style) {
        this.fontName = fontName;
        this.size = size;
        this.style = style;
    }

    
    @Override
    public boolean equals(Object obj) {
        ConcreteFont font = (ConcreteFont) obj;
        if((font.fontName).equals(this.fontName) && font.size == this.size && (font.style).equals(this.style))
            return true;
        else 
            return false;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.fontName);
        hash = 79 * hash + this.size;
        hash = 79 * hash + Objects.hashCode(this.style);
        return hash;
    }
    
    
}
