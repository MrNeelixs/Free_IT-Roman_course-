import java.util.Arrays;

/*
                            Задание 13
Создать последовательность случайных чисел, найти и вывести наибольшее
из них.
 */
public class Task13 {
    public void showTask13() {
        int[] array = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 30));
            System.out.print(array[i] + " ");
        }
        System.out.println();
        // 1.Создём стрима из массива Arrays.stream(array).
        // 2.C помощю метода max() возвращаем максимальный элемент.
        //3. orElse() возврощяет значение, если оно есть.
        int max = Arrays.stream(array).max().orElse(0);
        System.out.println("Наибольшее число : " + max);
    }
}