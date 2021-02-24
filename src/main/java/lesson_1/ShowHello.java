/*
        Задание 1
1.Набрать приведенный пример, откомпилировать его и запустить.
2.Изменить данный пример так, что бы при запуске программы ваша программа
выводила следующее: “Hello, <Ваше имя>!”.
 */

public class ShowHello {
    private String name;

    // реализация метода 1 задания Hello World !
    public void showHelloWorld() {
        System.out.println("Hello World !");
    }

    // реализация 2 метода с использованием переменной String name.
    public void showHelloName(String nameUser) {
        name = nameUser;
        System.out.println("Hello my name's " + nameUser);
    }
}