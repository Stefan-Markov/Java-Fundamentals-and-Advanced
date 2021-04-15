package JarOfT;

import java.util.ArrayDeque;
import java.util.Deque;

public class Jar<Type> {

    private Deque<Type> content;

    public Jar() {
        this.content = new ArrayDeque<>();
    }

    public void add(Type entity) {
        this.content.push(entity);
    }

    public Type remove() {
        return this.content.pop();
    }
}

