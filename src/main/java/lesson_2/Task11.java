/*
                            Задание 11
Имеется целое число, определить является ли это число простым, т.е.
делится без остатка только на 1 и себя.
 */
public class Task11 {
    public void showTask11() {
        int x = (int) (Math.random() * 20);
        System.out.println("Является ли это число простым ? " + x);
        int count = 0;
        for (int i = 1; i <= x; i++) {
            if (x % 1 == 0) {
                count++;
            }
        }
        System.out.println(count > 1 ? "Нe простое число" : "простое число");
    }
}