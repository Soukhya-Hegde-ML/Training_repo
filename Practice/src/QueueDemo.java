import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(15);
        queue.add(25);
        System.out.println("Simple Queue");
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.element());

        Queue<Integer> queue2 = new PriorityQueue<>();
        queue2.offer(10);
        queue2.offer(20);
        queue2.offer(30);
        queue2.offer(15);
        queue2.add(25);
        System.out.println("priority Queue");
        System.out.println(queue2);
        queue2.poll();
        System.out.println(queue2);
        System.out.println(queue2.peek());
        System.out.println(queue2.element());

        Queue<Integer> queue3 = new PriorityQueue<>(Comparator.reverseOrder());
        queue3.offer(10);
        queue3.offer(20);
        queue3.offer(30);
        queue3.offer(15);
        queue3.add(25);
        System.out.println("Reverse order priority Queue");
        System.out.println(queue3);
        queue3.poll();
        System.out.println(queue3);
        System.out.println(queue3.peek());
        System.out.println(queue3.element());

        ArrayDeque<Integer> queue4 = new ArrayDeque<>();
        System.out.println("Array DeQueue");
        queue4.offer(10);
        queue4.offer(20);
        System.out.println(queue4);
        queue4.offerFirst(30);
        queue4.offerLast(15);
        queue4.offer(25);
        System.out.println(queue4);
        queue4.poll();
        queue4.pollLast();
        System.out.println(queue4);
        System.out.println(queue4.peek());
        System.out.println(queue4.peekLast());
    }
}
