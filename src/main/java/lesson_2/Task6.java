/*
                                Задание 6
Создайте число. Определите, является ли число трехзначным. Определите, является
ли его последняя цифра семеркой. Определите, является ли число четным.
 */
public class Task6 {
    public void showTask6() {
        int input = (int) (Math.random() * (999 + 1)) + 1;
        System.out.println("Является ли число " + input + " трехзначным?");
        if (input > 99 && input < 1000) {
            System.out.println("Число " + input + " является трехзначным.");
        } else {
            System.out.println("Число " + input + " не является трехзначным.");
        }
        System.out.println("Является ли его последняя цифра семеркой?");
        if (input % 10 == 7) {
            System.out.println("Является");
        } else {
            System.out.println("Не является");
        }
        if (input % 2 == 0) {
            System.out.println("Является четным.");
        } else {
            System.out.println("Не является четным.");
        }
    }
}