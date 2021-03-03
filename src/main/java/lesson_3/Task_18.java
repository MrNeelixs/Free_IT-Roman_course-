/*
Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
общее их количество.
 */
public class Task_18 {
    public void CountingPunctuation(String text) {
        int n = 0;
        char symbol;
        for (int i = 0; i < text.length(); i++) {
            symbol = text.charAt(i);
            if ((symbol == '.' || symbol == ',' || symbol == ';')
                    || (symbol == '-' || symbol == ':' || symbol == '"')
                    || (symbol == '?' || symbol == '!')
                    || (symbol == '(' || symbol == ')')) {
                n++;
            }
        }
        System.out.println("У нас есть " + n + " знака препинания");
    }
}