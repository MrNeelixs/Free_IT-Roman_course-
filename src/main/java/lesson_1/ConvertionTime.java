/*
                        Задание 3
Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
1) минут + секунд,
2) часов + минут + секунд,
3) дней + часов + минут + секунд,
4) недель + дней + часов + минут + секунд.
 */
public class ConvertionTime {
    public void showTime(int input1) {
        int input = input1;
        int min = input / 60;
        int andInput = input % 60;
        int hours = min / 60;
        int h_Min = min % 60;
        int day = hours / 24;
        int d_Hours = hours % 24;
        int week = day / 7;
        int w_Day = day % 7;
        System.out.println("В " + input1 + " секундах :");

        System.out.println("1.) " + min + " минут " + andInput + " секунд. ");

        System.out.println("2.) " + hours + " чаc " + h_Min + " минут  " + andInput + " секунд.");

        System.out.println("3.) " + day + " дней " + d_Hours +
                " час " + h_Min + " минут " + andInput + " секунд.");

        System.out.println("4.) " + week + " недель " + w_Day +
                " дней " + d_Hours + " час " + h_Min + " минут " + andInput + " секунд.");
    }
}