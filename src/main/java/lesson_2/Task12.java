/*
                        Задание 12
Найдите сумму первых n целых чисел, которые делятся на 3.
 */
public class Task12 {
    public void showTask12() {
        int x = (int) (Math.random() * 50);
        System.out.println("Найдите сумму первых целых чисел, которые делятся на 3 числа: " + x);
        int sum = 0;
        int count = 0;
        while (count < x) {
            int nextsimple = count++;
            if (nextsimple % 3 == 0) {
                sum += nextsimple;
            }
            count++;
        }
        System.out.println("сумму первых  целых чисел : " + sum);
    }
}