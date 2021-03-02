import java.util.Scanner;

/*
Класс описывающий логику игры против другого игрока
 */
public class GameLogic_User {
    final char SIGN_1 = 'x';  // В качестве полей используем три символьные константы:
    final char SIGN_2 = '0';
    final char SIGN_EMPTY = '.';
    char[][] field;  // Двумерный символьный массив будет нашим игровым полем.
    Scanner scanner;

    GameLogic_User() {  // инициализация полей
        scanner = new Scanner(System.in);  // для ввода игрока.
        field = new char[3][3];
    }

    void startGame() {   // Логика игры.
        initField();
        while (true) {
            playerTurn_1(); // ход игрока номер 1
            if (winCondition(SIGN_1)) {    // проверка: если победа игрока  или ничья:
                System.out.println("Отличная игра");
                System.out.println("Победил игрок номер 1 !!!");
                break;
            }
            if (isFieldFull()) {  // проверка на ничью если поле полное .
                System.out.println("Это было жаркое сражение !");
                System.out.println("Ничья");
                break;
            }
            playerTurn_2(); // ход компьютера.
            showField();
            if (winCondition(SIGN_2)) {
                System.out.println("Вот это бой !!!");
                System.out.println("Победил игрок номер 2 !!!");
                break;
            }
            if (isFieldFull()) {
                System.out.println("Вы сражались как гладиаторы !!! ");
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println(" О этой битве будут слагать легенды !!!");
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

    void playerTurn_1() { // Иницилизация хода пользователя
        int x, y;
        do {
            System.out.println("Ходит  первый игрок ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isTheCellFree(x, y)); // проверка не занята ли ячейка .
        field[y][x] = SIGN_1;
    }

    void playerTurn_2() { // Иницилизация хода компьютера.
        int x, y;
        do {
            System.out.println("Ходит второй игрок ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isTheCellFree(x, y)); // проверка не занята ли ячейка .
        field[y][x] = SIGN_2;
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