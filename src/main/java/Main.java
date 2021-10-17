public class Main {
    public static void main(String[] args) {
        //задание 1. поиск недостающего числа
        int arr[] = {1, 2, 3, 4, 6};
        binaryFind(arr);

        //задание 2. реализация Deque
        testDeque();


    }

    public static void testDeque() {
        System.out.println("Реализация deque:");
        Deque<Integer> deque = new DequeImpl<>(8);
        deque.insertLeft(1);
        deque.insertLeft(2);
        deque.insertLeft(3);
        deque.display();
        deque.insertRight(4);
        deque.display();
        deque.insertRight(5);
        deque.insertLeft(6);
        deque.display();
        deque.insertLeft(7);


        deque.display();
        System.out.println("remove value from left: "+deque.removeLeft());
        deque.display();
        System.out.println("remove value from right: "+deque.removeRight());
        deque.display();
        System.out.println("remove value from left: "+deque.removeLeft());
        deque.display();
        System.out.println("remove value from right: "+deque.removeRight());
        deque.display();
    }

    public static void binaryFind(int[] a) {
        int begin = 0;
        int end = a.length - 1;
        int mid = 0;
        int value = 0;
        if (a.length != 0) {
            while (begin <= end) {
                mid = (end + begin) / 2;
                if (a[mid] == mid + 1) {
                    begin = mid + 1;
                } else {
                    if (mid != 0) {
                        end = mid - 1;
                        if (a[end] != a[end + 1] + 1) value = a[end] + 1;
                    } else {
                        value = 1;
                        break;
                    }
                }
            }
        } else value = 1;
        System.out.println("Пропущеное число: " + value);
    }
}
