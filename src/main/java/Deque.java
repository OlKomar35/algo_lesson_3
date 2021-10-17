public interface Deque<E> {
    boolean insertLeft(E value);

    boolean insertRight(E value);

    E removeLeft();

    E removeRight();

    E peekFront();

    E peekRear();

    int size();

    boolean isEmpty();

    boolean isFull();

    void display();
}
