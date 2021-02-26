/*
 Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.
 */
public class AddTask4 {
    public void showAddTask4() {
        int[] array = new int[3];
        int countPositive = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 30) - 15);
            System.out.print(array[i] + " ");
            if (array[i] > 0) {
                countPositive++;
            }
        }
        System.out.println();
        System.out.println("Количество положительных чисел : " + countPositive);
    }
}