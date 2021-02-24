/*
Решение первого домашнего задания из методички.
                        Программирование на Java.
                                Начальный уровень.
 */
public class Solution {
    public static void main(String[] args) {
        // Реализация заданий 1 и 2.
        ShowHello showHello = new ShowHello(); // Создаем обект класса ShowHello.
        showHello.showHelloWorld(); // Вызываем первый метод Hello World !
        showHello.showHelloName("Alexander"); // Вызываем второй метод с присвоением String.
        // Реализация заданий 3.
        ConvertionTime convertionTime = new ConvertionTime(); // Создаем обект класса ConvertionTime.
        convertionTime.showTime(4500); // Вызываем метод c входным значением 4500.
        // Реализация заданий 4.
        ReversNumber reversNumber = new ReversNumber();  // Создаем обект класса ReversNumber.
        reversNumber.reverseMethod(6734); // Вызываем метод решения задания через if(else)
        reversNumber.showRevers(); // Вызываем метод решения задания c помощю  класса StringBuilder.reverse.
        // Реализация заданий 5.
        VariousNumbers variousNumbers = new VariousNumbers(); // Создаем обект класса VariousNumbers.
        variousNumbers.showVarious(); // Вызываем метод решения задания .Решение с помощю Java Stream API.

    }
}