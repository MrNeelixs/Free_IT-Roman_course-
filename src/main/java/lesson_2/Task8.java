import java.util.Random;

/*
                            Задание 8
Имеется целове число (задать с помощью Random rand = new Random(); int x =
rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
нему слово «рублей» в правильном падеже.
 */
public class Task8 {
    public void showTask8() {
        Random random = new Random();
        int rub = random.nextInt(100000);
        String option1 = "рубль"; // при склонении на число 1;
        String option2 = "рубля"; // при склонении на число 3;
        String option3 = "рублей"; // при склонении на число 5.
        String declension = Integer.valueOf(rub).toString();
        int last = rub - ((rub / 10) * 10);
        if (rub <= 14) {
            if (rub == 1)
                System.out.println(declension + " " + option1);
            if (rub >= 2 && rub <= 4)
                System.out.println(declension + " " + option2);
            if (rub >= 5)
                System.out.println(declension + " " + option3);
        } else {
            if (last == 1)
                System.out.println(declension + " " + option1);
            if (last >= 2 && last <= 4)
                System.out.println(declension + " " + option2);
            if ((last >= 5 && last <= 9) || last == 0)
                System.out.println(declension + " " + option3);

        }
    }
}