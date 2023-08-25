import java.util.NoSuchElementException;

public class Fila<T> {
    private int top;
    private int base;
    private T[] data;

    Fila(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("O tamanho da fila deve ser maior que zero.");
        }
        data = (T[]) new Object[size];
        top = 0;
        base = 0;
    }

    public void add(T item) {
        if (isFull()) {
            throw new IllegalStateException("A fila está cheia.");
        }
        data[top] = item;
        top = move(top);
    }

    public T remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("A fila está vazia.");
        }
        T item = data[base];
        base = move(base);
        return item;
    }

    public void clear() {
        top = 0;
        base = 0;
    }

    public boolean isFull() {
        int nextTop = move(top);
        return nextTop == base;
    }

    public boolean isEmpty() {
        return top == base;
    }

    private int move(int position) {
        return (position + 1) % data.length;
    }
}
