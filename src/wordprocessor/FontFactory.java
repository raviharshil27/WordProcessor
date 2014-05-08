package wordprocessor;

import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Harshil
 */
public class FontFactory {
     private List<Font> fontList = new ArrayList<>();
     
      private FontFactory(){}
    
    private static class FontSingelton {
        private final static FontFactory instance = new FontFactory();
    }
    
    public static FontFactory getObject()
    {
        return FontSingelton.instance;
    }
     
    public Font getFont(String fontName , int  style, int size )
    {
        Font font = new Font(fontName, style, size);
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
