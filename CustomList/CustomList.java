package CustomList;

import java.util.ArrayList;
import java.util.List;

public class CustomList<E extends Comparable<E>> {
    private List<E> list;

    public CustomList() {
        this.list = new ArrayList<>();
    }

    public void add(E element) {
        list.add(element);
    }

    public E remove(int index) {
        if (isInRange(index)) {
            return null;
        }
        return list.remove(index);
    }

    public boolean contains(E element) {
        return list.contains(element);
    }

    public void swap(int firstIndex, int secIndex) {
        if (isInRange(firstIndex) || isInRange(secIndex)) {
            System.out.println("First/Second is not a valid index!");
        }
        E firs = this.list.get(firstIndex);
        E second = this.list.get(secIndex);
        this.list.set(firstIndex, second);
        this.list.set(secIndex, firs);

    }

    public int countGreater(E element) {
        int count = 0;
        for (E e : list) {
            if (e.compareTo(element) > 0) {
                count++;
            }
        }
        return count;
    }

    public E getMax() {
        E max = this.list.get(0);
        for (E e : list) {
            if (e.compareTo(max) > 0) {
                max = e;
            }
        }
        return max;
    }

    public E getMin() {
        E min = this.list.get(0);
        for (E e : list) {
            if (e.compareTo(min) < 0) {
                min = e;
            }
        }
        return min;
    }

    private boolean isInRange(int index) {
        return index < 0 || index >= this.list.size();
    }

    public void print() {
        for (E element : this.list) {
            System.out.println(element);
        }
    }
}
