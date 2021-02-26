import java.util.Scanner;
/*
                    Меню для вывода решения заданий
 */

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите номер урока :");
        System.out.println("Занятия 1 : Типы данных ; Переменные ; Операторы");
        System.out.println("Занятия 2 : Условные операторы ; Циклы ; Массивы");
        int number = scanner.nextInt();
        while (number < 1 || number > 2) {
            System.out.println("Нет такого задания ");
            System.out.println("Введите номер еще раз :");
            number = scanner.nextInt();
        }
        switch (number) {
            case 1:
                System.out.println("Введите  номер задания с 1-4");
                int number1 = scanner.nextInt();
                while (number1 < 1 || number1 > 4) {
                    System.out.println("Нет такого задания ");
                    System.out.println("Введите номер еще раз :");
                    number1 = scanner.nextInt();
                }
                switch (number1) {
                    case 1:
                        ShowHello showHello = new ShowHello();
                        showHello.showHelloWorld();
                        showHello.showHelloName("Alexandr");
                        break;
                    case 2:
                        ConvertionTime convertionTime = new ConvertionTime();
                        convertionTime.showTime(4500);
                        break;
                    case 3:
                        ReversNumber reversNumber = new ReversNumber();
                        reversNumber.showRevers();
                        break;
                    case 4:
                        VariousNumbers variousNumbers = new VariousNumbers();
                        variousNumbers.showVarious();
                        break;
                }
                break;
            case 2:
                System.out.println("1.Задания по методички.");
                System.out.println("2.Дополнительные задания.");
                int number2 = scanner.nextInt();
                while (number2 < 1 || number2 > 2) {
                    System.out.println("Нет такого задания ");
                    System.out.println("Введите номер еще раз :");
                    number2 = scanner.nextInt();
                }
                switch (number2) {
                    case 1:
                        System.out.println("Введите  номер задания с 6-17");
                        int number2_1 = scanner.nextInt();
                        while (number2_1 < 6 || number2_1 > 17) {
                            System.out.println("Нет такого задания ");
                            System.out.println("Введите номер еще раз :");
                            number2_1 = scanner.nextInt();
                        }
                        switch (number2_1) {
                            case 6:
                                Task6 task6 = new Task6();
                                task6.showTask6();
                                break;
                            case 7:
                                Task7 task7 = new Task7();
                                task7.showTask7();
                                break;
                            case 8:
                                Task8 task8 = new Task8();
                                task8.showTask8();
                                break;
                            case 9:
                                Task9 task9 = new Task9();
                                task9.showTask9();
                                break;
                            case 10:
                                Task10 task10 = new Task10();
                                task10.showTask10();
                                break;
                            case 11:
                                Task11 task11 = new Task11();
                                task11.showTask11();
                                break;
                            case 12:
                                Task12 task12 = new Task12();
                                task12.showTask12();
                                break;
                            case 13:
                                Task13 task13 = new Task13();
                                task13.showTask13();
                                break;
                            case 14:
                                Task14 task14 = new Task14();
                                task14.showTask14();
                                break;
                            case 15:
                                Task15 task15 = new Task15();
                                task15.showTask15();
                                break;
                            case 16:
                                Task16 task16 = new Task16();
                                task16.showTask16();
                                break;
                            case 17:
                                Task17 task17 = new Task17();
                                task17.showTask17();
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("Введите  номер задания с 1-14");
                        int number2_2 = scanner.nextInt();
                        while (number2_2 < 1 || number2_2 > 14) {
                            System.out.println("Нет такого задания ");
                            System.out.println("Введите номер еще раз :");
                            number2_2 = scanner.nextInt();
                        }
                        switch (number2_2) {
                            case 1:
                                AddTask1 addTask1 = new AddTask1();
                                addTask1.showAddTest1(1234);
                                addTask1.showAddTest1(-1234);
                                addTask1.showAddTest1(-12);
                                addTask1.showAddTest1(15);
                                break;
                            case 2:
                                AddTask2 addTask2 = new AddTask2();
                                System.out.println("Введите 3 стороны треугольника : ");
                                addTask2.showAddTask2(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                                break;
                            case 3:
                                AddTask3 addTask3 = new AddTask3();
                                addTask3.showAddTask3();
                                break;
                            case 4:
                                AddTask4 addTask4 = new AddTask4();
                                addTask4.showAddTask4();
                                break;
                            case 5:
                                AddTask5 addTask5 = new AddTask5();
                                addTask5.showAddTask5();
                                break;
                            case 6:
                                AddTask6 addTask6 = new AddTask6();
                                addTask6.showAddTask6();
                                break;
                            case 7:
                                AddTask7 task7 = new AddTask7();
                                System.out.println("Сколько хотите набрать программистов ?");
                                task7.showAddTask7(scanner.nextInt());
                                break;
                            case 8:
                                AddTask8 addTask8 = new AddTask8();
                                addTask8.showAddTask8();
                                break;
                            case 9:
                                AddTask9 addTask9 = new AddTask9();
                                addTask9.showAddTask9(scanner.nextInt());
                                break;
                            case 10:
                                AddTask10 addTask10 = new AddTask10();
                                addTask10.showAddTask10();
                                break;
                            case 11:
                                AddTask11 addTask11 = new AddTask11();
                                addTask11.showAddTask11();
                                break;
                            case 12:
                                AddTask12 addTask12 = new AddTask12();
                                addTask12.showAddTask12();
                                break;
                            case 13:
                                AddTask13 addTask13 = new AddTask13();
                                addTask13.showTask13();
                                break;
                            case 14:
                                AddTask14 addTask14 = new AddTask14();
                                addTask14.showTask14();
                                break;
                        }
                    break;
                }
            break;
        }
    }
}