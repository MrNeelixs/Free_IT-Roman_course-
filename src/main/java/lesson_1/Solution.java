/*
                        Задание 1
- Создать Git репозиторий.
- Создать первый проект. Я создал на базе framework Maven. (version SDK 1.8 ).
- Реализация первого метода через ( System.out.println ).
- Решить задания из методички.
 */
public class Solution {
    public static void main(String[] args) {
        // Реализация первого метода через ( System.out.println ).
        HelloWorld.ShowPrint();
        // Задание номер 3 из методички
        ConvertionTime.showTime();
    }
}

class HelloWorld{
    static void ShowPrint(){
        System.out.println("Привет группа FreeIT !");
        System.out.print("Меня зовут Александр, ");
        System.out.println("буду рад взаимной помощи в домашних заданиях.");
        System.out.println("Успехов в освоении Java !!!");
    }
}

class ConvertionTime {
    static void showTime() {
        double input = 4500;
        double week;
        double day;
        double hours;
        double minutes;
        week = input / 604800; // находим кол-во недель зная что в 1 неделя = 604800 сек.
        day = (input % 604800) / 86400; // находим количество дней зная что в 1 день = 86400 сек.
        hours = (input % 86400) / 3600; // находим час зная что 1 ч = 3600 сек.
        minutes = input / 60; // находим минуты зная что в 1 мин = 60 сек.
        // код ниже форматирует строку в более читабельный вид отбрасывая значения после запятой.
        String formattedDoubleSeconds = String.format("%.0f", input);
        String formattedDoubleMinutes = String.format("%.0f", minutes);
        String formattedDoubleDay = String.format("%.3f", day);
        String formattedDoubleWeek = String.format("%.3f", week);

        System.out.println("Дано " + formattedDoubleSeconds + " секунд.");
        System.out.println(formattedDoubleSeconds + " секунд" + " это " + formattedDoubleMinutes + " минут.");
        System.out.println(formattedDoubleSeconds + " секунд" + " это " + formattedDoubleMinutes + " минут" + " или " + hours + " часа.");
        System.out.println(formattedDoubleSeconds + " секунд" + " это " + formattedDoubleMinutes + " минут" + " или " + hours + " часа" + " или " + formattedDoubleDay + " дня.");
        System.out.println(formattedDoubleSeconds + " секунд" + " это " + formattedDoubleMinutes + " минут" + " или " + hours + " часа" + " или " + formattedDoubleDay + " дня" + " или " + formattedDoubleWeek + " недели.");
    }
}