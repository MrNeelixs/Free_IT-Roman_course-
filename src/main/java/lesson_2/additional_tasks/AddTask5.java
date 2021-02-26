/*
Даны 3 целых числа. Найти количество положительных и отрицательных чисел в исходном наборе.
 */
public class AddTask5 {
    public void showAddTask5() {
        int[] array = new int[3];
        int countPositive = 0;
        int countNegative = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 30) - 15);
            System.out.print(array[i] + " ");
            if (array[i] > 0) {
                countPositive++;
            } else if (array[i] < 0) {
                countNegative++;
            }
        }
        System.out.println();
        System.out.println("Количество положительных чисел : " + countPositive);
        System.out.println("Количество отрицательных чисел : " + countNegative);
    }
}