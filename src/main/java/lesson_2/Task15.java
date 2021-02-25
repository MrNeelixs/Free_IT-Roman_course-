import java.util.Arrays;

/*
                            Задание 15
Создать массив, заполнить его случайными элементами, распечатать,
перевернуть, и снова распечатать (при переворачивании нежелательно создавать
еще один массив).
 */
public class Task15 {
    public void showTask15() {
        int[] array = new int[10];
        System.out.print("Создание массива ---> ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 11));
        }
        System.out.println(Arrays.toString(array));
        int size = array.length;
        for (int i = 0; i < size / 2; i++) {
            int reverse = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = reverse;
        }
        System.out.print("Реверс массива ----> ");
        System.out.println(Arrays.toString(array));
    }
}