package Collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListIterator implements Iterable<String> {


    private List<String> list;
    private int currentIndex;

    public ListIterator(String... elements) {
        this.list = Arrays.asList(elements);
        this.currentIndex = 0;

    }

    public List<String> getList() {
        return list;
    }

    public boolean hasNext() {
        return currentIndex < this.list.size() - 1;
    }

    public boolean move() {
        if (hasNext()) {
            currentIndex++;
            return true;
        }
        return false;
    }

    public void print() {
        if (this.list.size() == 0) {
            System.out.println("Invalid Operation!");
        } else {
            System.out.println(this.list.get(this.getCurrentIndex()));

        }
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    public void printAll() {

        for (String a : list) {
            System.out.printf("%s ", a);
        }
        System.out.println();
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            @Override
            public boolean hasNext() {
                return currentIndex < list.size();
            }

            @Override
            public String next() {
                return list.get(currentIndex);
            }
        };
    }
}
