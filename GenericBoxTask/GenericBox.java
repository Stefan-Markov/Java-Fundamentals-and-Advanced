package GenericBoxTask;

public class GenericBox<T> {
    private T value;

    GenericBox(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value.getClass().getName() + ": " + value;
    }
}
