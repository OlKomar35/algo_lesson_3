package algo_lesson3_3;

public class QueueImpl<E> implements Queue<E> {
    protected final E[] data;
    protected int size;
    protected int tail;
    protected int head;
    private final int HEAD_DEFAULT = 0;
    private final int TAIL_DEFAULT = -1;

    public QueueImpl(int maxSize) {
        this.data = (E[]) new Object[maxSize];
        tail = TAIL_DEFAULT;
        head = HEAD_DEFAULT;
    }

    @Override
    public boolean insert(E value) {
        if (isFull()) return false;
        if (tail == data.length - 1) tail = TAIL_DEFAULT;
        data[++tail] = value;
        size++;
        return true;
    }

    @Override
    public E remove() {
        if (isEmpty()) return null;
        if (head == data.length) head = HEAD_DEFAULT;
        E value = data[head++];
        size--;
        return value;
    }

    @Override
    public E peekFront() {
        return data[head];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("[");
        if (head <= tail) {
            for (int i = head; i <= tail; i++) {
                sb.append(data[i]);
                if (i != tail) sb.append(",");
            }
            sb.append("]");
            return sb.toString();
        } else {
            for (int i = head; i < data.length ; i++) {
                sb.append(data[i]);
                if (i != tail) sb.append(",");
            }
            for (int i = 0; i <= tail; i++) {
                sb.append(data[i]);
                if (i != tail) sb.append(",");
            }
            sb.append("]");
            return sb.toString();
        }

    }

    @Override
    public void display() {
        System.out.println(this);
    }
}

