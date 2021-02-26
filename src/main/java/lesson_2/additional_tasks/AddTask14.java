/*
Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
 */
public class AddTask14 {
    public void showTask14() {
        int sum = 0;
        for (int i = 0; i <= 99; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Сумма всех нечетных чисел = " + sum);
    }
}