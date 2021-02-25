/*
                            Задание 16
Определите сумму элементов одномерного массива, расположенных между
минимальным и максимальным значениями.
 */
public class Task16 {
    public void showTask16() {
        int sum = 0;
        int[] array = new int[10];
        int indexMin = 0;
        int indexMax = 0;
        System.out.print("Создаем массив ---> ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        for (int j : array) {
            System.out.print(j + " ");
        }
        int max = Integer.MIN_VALUE; // контейнер для типа данных int.
        int min = Integer.MAX_VALUE; // Integer.MAX_VALUE и MIN_VALUE макс и мин  значение объекта.
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }
            if (array[i] < min) {
                min = array[i];
                indexMin = i;
            }
        }
        System.out.println("Минимальное и максимальное число в массиве " + min + " и " + max);

        if (min < max) {
            for (int i = indexMin + 1; i < indexMax; i++)
                sum += array[i];
        } else {
            for (int i = indexMax + 1; i < indexMin; i++)
                sum += array[i];
        }
        System.out.println("Сумма чисел в промежутке между ними : " + sum);
    }
}