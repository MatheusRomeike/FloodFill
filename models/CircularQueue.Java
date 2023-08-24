public class CircularQueue <T> {
    private T[] data;
    private int top = -1;
    private int base = -1;

    CircularQueue(int size) {
        this.data = new T[size];
    }

    public void add(T data) {
        if (this.isFull())
            throw new RuntimeException("Queue is full");
        else if (this.isEmpty()) {
            this.top = 0;
            this.base = 0;
        } else
            this.top = this.move(this.top);

        this.data[this.top] = data;
    }

    public T remove() {
        if (this.isEmpty())
            throw new RuntimeException("Queue is empty");

        T data = this.data[this.top];

        if (this.top == this.base) {
            this.top = -1;
            this.base = -1;
        } else
            this.top = (this.top + 1) % this.data.length;

        return data;
    }

    public void clear() {
        this.top = -1;
        this.base = -1;
    }

    public boolean isFull() {
        return (this.top == 0 && this.base == this.data.length - 1) || (this.top == this.base + 1);
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    private int move (int position) {
        return (position + 1) % this.data.length;
    }


}