/*
Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
 */
public class AddTask11 {
    public void showAddTask11() {
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        System.out.println(a + " " + b);
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        System.out.println(result);
    }
}