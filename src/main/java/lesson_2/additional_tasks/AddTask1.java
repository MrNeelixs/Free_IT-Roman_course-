/*
В переменную записываем число.
Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
Например, "это однозначное положительное число".
Достаточно будет определить, является ли число однозначным, "двухзначным или трехзначным и более.
 */
public class AddTask1 {
    public void showAddTest1(int input) {
        int countOfNumbers = 0;
        if (input > 0) {
            System.out.print("Это положительное ");
        } else if (input < 0) {
            System.out.print("Это отрицательное ");
        }
        for (; input != 0; input /= 10) {
            ++countOfNumbers;
        }
        System.out.println(countOfNumbers + "-х значное число. ");
    }
}