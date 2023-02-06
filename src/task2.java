//2. Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.ArrayDeque;
import java.util.Random;

public class task2 {

    public static ArrayDeque<Integer> enqueue(ArrayDeque<Integer> linkedList, int element) {
        linkedList.addLast(element);

        return linkedList;
    }

    public static int dequeue(ArrayDeque<Integer> linkedList) {
        int firstElement = linkedList.getFirst();
        linkedList.pollFirst();
        System.out.println("Удаление элемента: " + linkedList);

        return firstElement;
    }

    public static int first(ArrayDeque<Integer> linkedList) {
        return linkedList.getFirst();
    }

    public static void main(String[] args) {
        ArrayDeque<Integer> linkedList = new ArrayDeque<>();
        Random random = new Random();
        int element = 9;

        for (int i = 0; i < 10; i++) {

            linkedList.add (random.nextInt(100));
        }

        System.out.println("Очередь: " + linkedList);
        System.out.println("Добавим элемент " + element +".  "+ "Получили: " + enqueue(linkedList, element) );
        System.out.println("Удалили элемент: " + dequeue(linkedList) +".  " + "Первый элемент: " + first(linkedList));
    }

}