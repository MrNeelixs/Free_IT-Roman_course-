/*
                                Задание 10
Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).
 */

public class Task10 {
    public void showTask10() {
        int x = (int) (10 + Math.random() * 6);
        long factorial = 1;
        System.out.print(x + " ! ");
        for (int i = 1; i <= x; i++) {
            factorial = factorial * i;
        }
        System.out.println("= " + factorial);
    }

}