package ListIterator;

import java.util.Arrays;
import java.util.List;

public class ListIterator {

    private List<String> elements;
    private int index;

    public ListIterator(String... values) {
        this.elements = Arrays.asList(values);
        this.index = 0;
    }

    public boolean move() {
        if (this.index == this.elements.size() - 1) {
            return false;
        }
        this.index++;
        return true;
    }

    public boolean hasNext() {
        return this.index < this.elements.size() - 1;
    }

    public String getCurrentElement() {
        if (this.elements.size() == 0) {
            throw new UnsupportedOperationException("Invalid Operation!");
        }
        return this.elements.get(this.index);
    }
}
