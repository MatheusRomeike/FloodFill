public class Fila<T> {
    private int top = -1;
    private int base = 0;
    private T[] data;

    Fila(int size) {
        data = (T[]) new Object[size];
    }

    public void add(T data) {
        if (isFull()) {
            throw new RuntimeException("Fila cheia");
        }
        top = move(top);
        this.data[top] = data;
    }

    public T remove() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia");
        }
        T element = data[base];
        base = move(base);
        return element;
    }

    public void clear() {
        top = -1;
        base = 0;
    }

    public boolean isFull() {
        return top == data.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    private int move(int position) {
        return (position + 1) % data.length;
    }
}
