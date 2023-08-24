public class StaticStack <T> {
    private T[] data;
    private int top = -1;

    StaticStack(int size) {
        this.data = new T[size];
    }

    public void add(T data) {
        this.data[++this.top] = data;
    }

    public T remove() {
        return this.data[this.top--];
    }

    public void clear() {
        this.top = -1;
    }

    public boolean isFull() {
        return this.top == this.data.length - 1;
    }

    public boolean isEmpty() {
        return this.top == -1;
    }
}