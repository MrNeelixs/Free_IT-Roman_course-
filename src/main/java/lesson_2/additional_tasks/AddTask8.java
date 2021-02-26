/*
Начав тренировки, спортсмен в первый день пробежал 10 км.
Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
Какой суммарный путь пробежит спортсмен за 7 дней?
 */
public class AddTask8 {
    public void showAddTask8() {
        double startingPath = 10;
        double percent = 10;
        for (int i = 1; i < 7; i++) {
            percent = percent * 1.1;
        }
        startingPath += percent;
        System.out.print("Суммарный путь за 7 дней ");
        System.out.printf("%.2f", startingPath);
        System.out.println(" км.");
    }
}