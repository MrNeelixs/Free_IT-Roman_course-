/*
В переменную записываете количество программистов.
В зависимости от количества программистов необходимо вывести правильно окончание.
Например: • 2 программиста • 1 программист • 10 программистов • и т.д.
 */
public class AddTask7 {
    public void showAddTask7(int count) {
        String freelance = "программист"; // при склонении на число 1;
        String startup = "программиста"; // при склонении на число 4;
        String company = "программистов"; // при склонении на число 5 и более.
        String programmer = Integer.valueOf(count).toString();
        int last = count - ((count / 10) * 10);
        if (count <= 14) {
            if (count == 1)
                System.out.println("У вас в штате будет " + programmer + " " + freelance);
            if (count >= 2 && count <= 4)
                System.out.println("У вас в штате будет " + programmer + " " + startup);
            if (count >= 5)
                System.out.println("У вас в штате будет " + programmer + " " + company);
        } else {
            if (last == 1)
                System.out.println("У вас в штате будет " + programmer + " " + freelance);
            if (last >= 2 && last <= 4)
                System.out.println("У вас в штате будет " + programmer + " " + startup);
            if ((last >= 5 && last <= 9) || last == 0)
                System.out.println("У вас в штате будет " + programmer + " " + company);
        }
    }
}