/*
Напишите программу вывода всех четных чисел от 2 до 100 включительно
 */
public class AddTask13 {
    public void showTask13() {
        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}