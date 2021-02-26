/*
Одноклеточная амеба каждые 3 часа делится на 2 клетки.
Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
 */
public class AddTask9 {
    public void showAddTask9(int hour) {
        int input = 1;
        for (int i = 0; i < hour / 3; i++) {
            input *= 2;
        }
        System.out.println("Через " + hour + " часов будет  " + input + " амёб(ы).");
    }
}