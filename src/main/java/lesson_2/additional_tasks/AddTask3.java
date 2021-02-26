/*
Дано целое число. Если оно является положительным, то прибавить к нему 1.Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на 10. Вывести полученное число
 */
public class AddTask3 {
    public void showAddTask3() {
        int input = (int) ((Math.random() * 30) - 15);
        System.out.println(input);
        if (input > 0) {
            System.out.println(input + 1);
        } else if (input < 0) {
            System.out.println(input - 2);
        } else {
            System.out.println(10);
        }
    }
}