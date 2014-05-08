package wordprocessor;

import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Harshil
 */
public class RunArray {

    List<Integer> indexList = new ArrayList<>();
    List<Font> fontList = new ArrayList<>();

    public RunArray() {
    }

    public void addRun(int index, int length, Font font) {
        int startIndex = index;
        int endIndex = index + length;
        if (indexList.size() == 0) {
            indexList.add(startIndex);
        }
        indexList.add(endIndex);
        fontList.add(font);

    }

    public void appendRun(int length, Font font) {
        int startingIndex = indexList.size() - 1;
        int indexValue = indexList.get(startingIndex);
        indexList.add(indexValue + length);
        fontList.add(font);
    }

    public Font getFont(int index) {
        int i = 0;
        for (; i < indexList.size(); i++) {
            if (indexList.get(i) > index) {
                break;
            }
        }
        return fontList.get(i - 1);

    }
}
