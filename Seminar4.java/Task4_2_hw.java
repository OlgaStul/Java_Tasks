// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет
// его, first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Task4_2_hw {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            queue.add(random.nextInt(100));
        }
        System.out.println(queue);
        System.out.println();

        System.out.printf("Добавили элемент 333\n" + enqueue(queue, 333));
        System.out.println();

        System.out.printf("Удалили первый элемент\n" + dequeue(queue));
        System.out.println();

        System.out.printf("Первый элемент\n" + first(queue));
    }

    public static int size(Queue<Integer> queue) {
        return queue.size();
    }

    public static Queue<Integer> enqueue(Queue<Integer> queue, int element) {
        Queue<Integer> queueEnqueue = new LinkedList<Integer>();

        for (Integer item : queue) {
            queueEnqueue.offer(item);
        }

        queueEnqueue.offer(element);
        return queueEnqueue;
    }

    public static Queue<Integer> dequeue(Queue<Integer> queue) {
        Queue<Integer> queueDequeue = new LinkedList<Integer>();

        for (Integer item : queue) {
            queueDequeue.offer(item);
        }

        if (queue.size() != 0) {
            queueDequeue.remove();
        } else
            System.out.println("Очередь пуста, извлечение элемента невозможно");

        return queueDequeue;
    }

    public static Queue<Integer> first(Queue<Integer> queue) {

        Queue<Integer> queueFirst = new LinkedList<Integer>();
        queueFirst.offer(queue.peek());
        return queueFirst;
    }
}
