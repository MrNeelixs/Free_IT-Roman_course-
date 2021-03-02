import java.util.Scanner;

/*
Старт игры.
Логика меню.
 */
public class Games {
    public static void main(String[] args) {
        NameUser nameUser = new NameUser();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Привет , как тебя завут?");
        String name = scanner.nextLine();
        System.out.print("Какое странное имя , ");
        System.out.println(nameUser.stringToBinary(name));
        System.out.println("Я буду звать тебя кожаный мешок !");
        System.out.println("Я Бендер ! ");
        System.out.println("Добро пожаловать в самую эпическую игру на просторе интернета.");
        System.out.println("С кем ты хочешь сразиться ?");
        System.out.println("1. Неповторимый Бендер.");
        System.out.println("2. Против другого игрока.");
        int number = scanner.nextInt();
        while (number < 1 || number > 2) {
            System.out.println("Что то пошло не так ");
            System.out.println("Выберите соперника еще раз :");
            number = scanner.nextInt();
        }
        switch (number) {
            case 1:
                System.out.println("Да ты не из робкого десятка, Коженый мешок !!!");
                System.out.println("Правила простые : ");
                System.out.println("ТЫ играешь за ' 1 ' ");
                System.out.println("Я за  ' 0 ' ");
                System.out.println("Введите координаты хода. Например (x->1   y->2 )");
                GameLogic_AI gameAI = new GameLogic_AI();
                gameAI.startGame();
                break;
            case 2:
                System.out.println("ХА люблю смотреть как сражаются два коженых мешка. ");
                System.out.println("Правила простые : ");
                System.out.println("Первый игрок играет за  ' х ' ");
                System.out.println("Второй инрок за   ' 0 ' ");
                System.out.println("Введите координаты хода. Например (x->1   y->2 )");
                System.out.println("Не забывайте про правила хорошего тона. Вилки в левый карман, ложки — в правый!");
                System.out.println("Да начнеться бой !");
                GameLogic_User gameUS = new GameLogic_User();
                gameUS.startGame();
                break;
        }
    }
}