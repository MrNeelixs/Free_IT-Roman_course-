/*
Напишите три цикла выполняющих многократное сложение строк, один с
помощью оператора сложения и String, другой с помощью StringBuilder и метода
append, а также аналогино для StringBuffer. Сравните скорость их выполнения.
 */
public class Task_21 {
    public void showTask_21(String text) {
        System.out.println("1.Слаживаем с помощю цикла For : ");
        showAddString(text);
        System.out.println();
        System.out.println("2.Слаживаем с помощю StringBuilder метод append : ");
        showBuilderAppend(text);
        System.out.println();
        System.out.println("3.Слаживаем с помощю StringBuffer  метод append : ");
        showBufferAppend(text);

    }

    public void showAddString(String text) {
        long time = System.nanoTime();
        for (int i = 1; i <= 2; i++) {
            text += text;
        }
        System.out.println("Обедененый текст : " + text);
        time = System.nanoTime() - time;
        System.out.printf("Метот выполнен за %,9.3f ms\n", time / 1_000_000.0);
    }

    public void showBuilderAppend(String text) {
        long time = System.nanoTime();
        StringBuilder builder = new StringBuilder("Обедененый текст : ");
        builder.append(text).append(text).append(text);
        System.out.println(builder);
        time = System.nanoTime() - time;
        System.out.printf("Метот выполнен за %,9.3f ms\n", time / 1_000_000.0);

    }

    public void showBufferAppend(String text) {
        long time = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer("Обедененый текст : ");
        stringBuffer.append(text).append(text).append(text);
        System.out.println(stringBuffer);
        time = System.nanoTime() - time;
        System.out.printf("Метот выполнен за %,9.3f ms\n", time / 1_000_000.0);
    }
}