public class DequeImpl<E> implements Deque<E> {
    protected final E[] data;
    protected int size;
    protected int tailLeft, headLeft, tailRight, headRight;
    private final int TAIL_DEFAULT_LEFT = -1;
    private final int HEAD_DEFAULT_LEFT = 0;

    public DequeImpl(int maxSize) {
        this.data = (E[]) new Object[maxSize];
        tailLeft = TAIL_DEFAULT_LEFT;
        headLeft = HEAD_DEFAULT_LEFT;
        tailRight = maxSize;
        headRight = maxSize - 1;
    }


    @Override
    public boolean insertLeft(E value) {
        if (isFull()) {
            return false;
        }
        if (tailLeft == data.length - 1) tailLeft = TAIL_DEFAULT_LEFT;
        data[++tailLeft] = value;
        size++;
        return true;
    }

    @Override
    public boolean insertRight(E value) {
        if (isFull()) {
            return false;
        }

        data[--tailRight] = value;
        size++;
        return true;
    }

    @Override
    public E removeLeft() {
        if (isEmpty()) {
            return null;
        }
        E value = data[headLeft++];
        size--;
        return value;
    }

    @Override
    public E removeRight() {
        if (isEmpty()) {
            return null;
        }
        E value = data[headRight--];
        size--;
        return value;
    }

    @Override
    public E peekFront() {
        return data[headLeft];
    }

    @Override
    public E peekRear() {
        return data[headRight];
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
        for (int i = headLeft; i <= tailLeft; i++) {
            sb.append(data[i]);
            if (i != tailLeft) {
                sb.append(",");
            }
        }
        for (int i = tailRight; i <= headRight; i++) {
            sb.append(",");
            sb.append(data[i]);
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public void display() {
        System.out.println(this);

    }
}
