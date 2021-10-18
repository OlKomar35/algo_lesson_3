package algo_lesson3_3;

public class Main {
    public static void main(String[] args) {
        //задание 3* Оптимизировать очередь, чтобы после удалния не оставалось незадействованных пустых ячеек
        testQueue();
        
    }

    public static void testQueue() {
        Queue<Integer> queue= new QueueImpl<>(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.display();
        queue.insert(4);
        queue.insert(5);
        queue.insert(6);
        //
        queue.display();
        System.out.println("remove: "+queue.remove());
        queue.display();
        queue.insert(6);
        queue.display();
        System.out.println("remove: "+queue.remove());
        queue.display();
        queue.insert(7);
        queue.display();
        System.out.println("remove: "+queue.remove());
        queue.display();
        queue.insert(8);
        queue.insert(9);
        queue.insert(10);
        queue.display();
        System.out.println("remove: "+queue.remove());
        System.out.println("remove: "+queue.remove());
        queue.display();
        queue.insert(9);
        queue.insert(10);
        queue.display();
        System.out.println("remove: "+queue.remove());
        System.out.println("remove: "+queue.remove());
        queue.display();
    }
}
