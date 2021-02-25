/*
Примеры и задания по книге Java 8. Полное руководство. от Герберт Шилдт.
 */

public class Solution {
    public static void main(String[] args) {
        Chapter_2.task01();
        Chapter_2.task02();
        Chapter_2.task03();
    }
}

class Chapter_2 {
    static void task01() {
        int num;
        num = 100;
        System.out.println("Этo переменная num: " + num);
        num = num * 2;
        System.out.print("Знaчeниe переменной num * 2 равно ");
        System.out.println(num);
    }

    static void task02() {
        int x, y;
        x = 10;
        y = 20;
        if (x < y) System.out.println("x меньше у ");
        x = x * 2;
        if (x == y) System.out.println("x теперь равно у");
        x = x * 2;
        if (x > y) System.out.println("x теперь больше у");
        if (x == y) System.out.println("вы не увидите этого");
    }

    static void task03() {
        int x;
        for (x = 0; x < 10; x = x + 1)
            System.out.println(" Знaчeниe х: " + x);
    }
}