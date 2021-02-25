/*
                                Задание 7
Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
полностью закрыть круглой картонкой радиусом r.
 */
public class Task7 {
    public void showTask7(){
        int a = (int) (Math.random() * (10 + 1)) + 1;
        int b = (int) (Math.random() * (10+ 1)) + 1;
        int radius =  (int) (Math.random() * (10 + 1)) + 1 ;
        System.out.println("Сторона а = "+a+" Сторона b = "+b+" радиус = "+radius);
        if (2 * radius >= Math.sqrt(a*a + b*b))
            System.out.println("Можно");
        else
            System.out.println("Нельзя");
    }
}