/*
Даны 2 числа. Вывести большее из них
 */
public class AddTask6 {
    public void showAddTask6() {
        int inputA = (int) (Math.random() * 30);
        int inputB = (int) (Math.random() * 30);
        System.out.println(inputA + " " + inputB);
        System.out.println(inputA > inputB ? inputA : inputB);
    }
}