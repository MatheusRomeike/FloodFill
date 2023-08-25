public class Pilha <T> {
    private int top = -1;
    private T[] data;

    Pilha(int size) {
        data = (T[]) new Object[size];
    }

    public void add(T data) {
        this.data[++top] = data;
    }

    public T remove() {
        return this.data[top--];
    }

    public void clear() {
        top = -1;
    }

    public boolean isFull() {
        return top == data.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
