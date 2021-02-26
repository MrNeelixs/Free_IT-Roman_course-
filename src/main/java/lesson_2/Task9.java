/*
                                Задание 9
Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
произведение, т.е. факториал числа.
 */
public class Task9 {
    public void showTask9() {
        int x = (int) (Math.random() * 20);
        long factorial = 1;
        System.out.print(x+" ! ");
        for (int i = 1; i <= x; i++) {
            factorial = factorial * i;
        }
        System.out.println("= " + factorial);
    }
}