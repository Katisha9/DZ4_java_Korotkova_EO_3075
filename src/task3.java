// 3.Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

public class task3 {

    public static void main(String[] args) {

        Random random = new Random();
        LinkedList<Integer> list = new LinkedList<>();
        int sum = 0;
        for (int i = 0; i < 10; i++) {

            list.add(random.nextInt(100));
        }

        System.out.println(list);

        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            iterator.remove();
            sum += integer;
        }

        System.out.println("Сумма элементов списка равна: " +sum);

    }
}