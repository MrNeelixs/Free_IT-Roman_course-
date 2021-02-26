/*
Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры для значений длин от 1 до 20 дюймов
 */
public class AddTask12 {
    public void showAddTask12() {
        for (int inch = 1; inch <= 20; inch++) {
            System.out.println(inch + " дюйм = " + (inch * 2.54) + " сантиметров.");
        }
    }
}