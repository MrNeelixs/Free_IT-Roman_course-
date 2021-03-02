import java.util.Random;
import java.util.Scanner;
/*
Даный класс описывает логику игры против копьютера .
(За основу копьютера взял красавчика Бендера из футурамы)
 */

public class GameLogic_AI {
    final char SIGN_1 = '1';  // В качестве полей используем три символьные константы:
    final char SIGN_0 = '0';
    final char SIGN_EMPTY = '.';
    char[][] field;  // Двумерный символьный массив будет нашим игровым полем.
    Random random;
    Scanner scanner;

    GameLogic_AI() {  // инициализация полей
        random = new Random();  // для ввода ИИ.
        scanner = new Scanner(System.in);  // для ввода игрока.
        field = new char[3][3];
    }

    void startGame() {   // Логика игры.
        initField();
        while (true) {
            playerTurn(); // ход игрока
            if (winCondition(SIGN_1)) {    // проверка: если победа игрока  или ничья:
                System.out.println("Не может быть кажеться я видел двойку !!!!");
                System.out.println("Вы победили!!!");
                break;
            }
            if (isFieldFull()) {  // проверка на ничью если поле полное .
                System.out.println("Да! Я богат! Правда ты тоже, но это почему то не радует!");
                System.out.println("Ничья");
                break;
            }
            turnBender(); // ход компьютера.
            showField();
            if (winCondition(SIGN_0)) {
                System.out.println("Слава роботам! Убить всех человеков!");
                System.out.println("Бендер выйграл !!!!");
                break;
            }
            if (isFieldFull()) {
                System.out.println("Асталависта, мешок с костями!");
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println(" Как и многие жизненные проблемы, эту можно решить сгибанием.");
        System.out.println(" GAME OVER. ");
        showField();
    }

    void initField() {   // Создаем игровое поле 3х3 и запролняем '.'.
        for (int row = 0; row < 3; row++)
            for (int column = 0; column < 3; column++)
                field[row][column] = SIGN_EMPTY;
    }

    void showField() {  // отображкеие текущего состояния игрового поля.
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++)
                System.out.print(field[row][column] + " ");
            System.out.println();
        }
    }

    void playerTurn() { // Иницилизация хода пользователя
        int x, y;
        do {
            System.out.println("Ваш ход !!! .");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isTheCellFree(x, y)); // проверка не занята ли ячейка .
        field[y][x] = SIGN_1;
    }

    void turnBender() { // Иницилизация хода компьютера.
        int x, y;
        do {
            x = random.nextInt(3);  // генерируются случайные целые числа от 0 до 2.
            y = random.nextInt(3);  // генерируются случайные целые числа от 0 до 2.
        } while (!isTheCellFree(x, y)); // проверка не занята ли ячейка .
        field[y][x] = SIGN_0;
    }

    boolean isTheCellFree(int x, int y) { // Метод проверки свободна ли ячейка.
        if (x < 0 || y < 0 || x >= 3 || y >= 3)
            return false;
        return field[y][x] == SIGN_EMPTY;
    }

    boolean winCondition(char sign) {
        /*
         метод проверяет игровую таблицу на  три одинаковых знака подряд,
          по вертикали или горизонтали , а также по двум диагоналям.
         */

        for (int i = 0; i < 3; i++)
            if ((field[i][0] == sign && field[i][1] == sign &&
                    field[i][2] == sign) ||
                    (field[0][i] == sign && field[1][i] == sign &&
                            field[2][i] == sign))
                return true;
        if ((field[0][0] == sign && field[1][1] == sign &&
                field[2][2] == sign) ||
                (field[2][0] == sign && field[1][1] == sign &&
                        field[0][2] == sign))
            return true;
        return false;
    }

    boolean isFieldFull() {
        /*
        Метод проверяет заняты ли все ячейки игрового поля.
         */
        for (int row = 0; row < 3; row++)
            for (int column = 0; column < 3; column++)
                if (field[row][column] == SIGN_EMPTY)
                    return false;
        return true;
    }
}