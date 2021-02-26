import java.util.Arrays;
import java.util.stream.IntStream;

/*
                            Задание 14
Создать массив оценок произвольной длины, вывести максимальную и
минимальную оценку, её (их) номера.
 */
public class Task14 {
    public void showTask14() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 11));
            System.out.print(array[i] + " ");
        }
        System.out.println();
        // 1.Создём стрима из массива Arrays.stream(array).
        // 2.C помощю метода max() возвращаем максимальный элемент.
        //3. orElse() возврощяет значение, если оно есть.
        int max = Arrays.stream(array).max().orElse(0);
        // 1.IntStream.range фильтрует индексы чтобы сохранить только те, где элемент массива в этом индексе равен искомому значению.
        // 2.Сохраняем первый из них совпадающим с findFirst
        // 3.Вызываем orElse(-1) ,чтобы вернуть найденное значение, либо -1 , если оно не было найдено. (не 0 так как массив имеет индекс 0)
        int indexMax = IntStream.range(0, array.length).filter(i -> array[i] == max).findFirst().orElse(-1);
        System.out.println("Лучшая оценка : " + max + " индекс " + indexMax);
        int min = Arrays.stream(array).min().orElse(0);
        int indexMin = IntStream.range(0, array.length).filter(i -> array[i] == min).findFirst().orElse(-1);
        System.out.println("А тут надо подтянуть  : " + min + " индекс " + indexMin);
    }
}