/*
Класс переводт имя в бинарный код.
 */
public class NameUser {
    public String stringToBinary(String s) {

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            answer.append(Integer.toBinaryString(c)).append(' ');
        }

        return answer.toString();
    }
}