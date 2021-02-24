import java.util.Scanner;

/*
                            Задание 5
Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
различны?
P.S  Решения задания с помощю Java Stream API.
 */
public class VariousNumbers {
    public void showVarious() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 4-х значное число :");
        String inputNumber = sc.next();
        while (inputNumber.length() != 4) {
            System.out.println("Не 4-х значное число!\nПопробуй еще :");
            inputNumber = sc.next();
        }
        /*
        1. .chars() <--- Создаём стрим из строки.
        2. .distinct() <---- C помощю метода возвращаем стрим без дубликатов.
        3. count() <---- Возвращаем количество элементов в стриме
        4. Если возврощеное значение равно 4 то в даном числе все цифры разные иначе есть одинаковые цыфры.
         */
        System.out.println(inputNumber.chars().distinct().count() == 4 ? "В даном числе все цифры разные" : "В даном числе есть одинаковые цыфры.");
    }

}