/*
Вычислить: 1+2+4+8+...+256
 */
public class AddTask10 {
    public void showAddTask10() {
        int sum = 0;
        for (int i = 1; i <= 256; i *= 2) {
            sum += i;
        }
        System.out.println(sum);
    }
}