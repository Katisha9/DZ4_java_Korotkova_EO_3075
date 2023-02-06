//1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Random;

public class task1 {

    public static LinkedList<Integer> getReversLinkedList(int size){

        LinkedList<Integer> linkedList = new LinkedList<>();
        LinkedList<Integer> reverseLinkedList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            linkedList.add(random.nextInt(100));
        }
        System.out.println(linkedList);

        for (int i = 0; i < size; i++) {
            reverseLinkedList.addFirst(linkedList.getFirst());
            linkedList.removeFirst();
        }

        return reverseLinkedList;
    }

    public static void main(String[] args) {

        System.out.println(getReversLinkedList(10));

    }


}