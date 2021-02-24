import java.util.Scanner;

/*
                        Задание 4
Определить число, полученное выписыванием в обратном порядке цифр
любого 4-х значного натурального числа n.
 */
public class ReversNumber {
    public void reverseMethod(int number) {   // простой метод с использованием If(else)
        if (number < 10) {   // Услоаие метода задаем при его вызове
            System.out.println(number);
            return;
        } else {
            System.out.print(number % 10);
            reverseMethod(number / 10);
        }
    }

    public void showRevers() { // Второй метот использует класс StringBuilder и его метод .reverse()
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 4-х значное число :");
        String inputNumber = sc.next();
        while (inputNumber.length() != 4) {
            System.out.println("Не 4-х значное число!\nПопробуй еще :");
            inputNumber = sc.next();
        }
        /*
         1.Создаем объект класса StringBuilder и передаем наше значение inputNumber.
         2.С помощю метода reverse() возвращает объект StringBuilder с обратной последовательностью.
         3.С помощю метода toString() преобразуем в строку.
         */
        System.out.printf("Введено => %s;%nРеверс => %s.\n", inputNumber, new StringBuilder(inputNumber).reverse().toString());
    }
}