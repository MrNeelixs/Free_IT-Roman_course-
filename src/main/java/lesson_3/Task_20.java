/*
Имеется строка с текстом. Вывести текст, составленный из последних букв
всех слов.
 */
public class Task_20 {
    public void showTask_20(String text) {
        // С помощю replaceAll избовляемся от знаков припенпния.
        text = text.trim();
        text = text.replaceAll("[?!.,:;-]", "");
        String[] words = text.split(" ");  //возвращает массив строк.
        StringBuilder newText = new StringBuilder();
        for (String word : words) {
            //  append <---- обновляет значение объекта c помощю
            //  charAt возвращает символ, расположенный по указанному индексу строки последний символю
            newText.append(word.charAt(word.length() - 1));
        }

        System.out.println("Новый текст из последних символов ---> " + newText);
    }
}