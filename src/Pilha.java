public class Pilha <T> {

    private Object[] elements;
    private int length;
    private static final int default_length = 10;

    public Pilha() {
        this.elements = new Object[default_length];
        this.length = 0;
    }

    public void add(T element) {
        if (length == elements.length) {
            resize();
        }
        elements[length] = element;
        length++;
    }

    public T remove() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia");
        }
        T element = (T) elements[length - 1];
        elements[length - 1] = null;
        length--;
        return element;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    private void resize() {
        int newLength = elements.length * 2;
        Object[] newArray = new Object[newLength];
        System.arraycopy(elements, 0, newArray, 0, length);
        elements = newArray;
    }
}


class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
