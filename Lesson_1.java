
//Урок 1. Знакомство с языком программирования Java
//Формат сдачи: ссылка на подписанный git-проект.


import java.util.Scanner;
public class Lesson_1 {
   

public static void main(String[] args) {
    //Triangle_number();
    Prime_numbers();
}
    
// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n) 
    static void Triangle_number() {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Input number n: ");
        Integer n = keyboard.nextInt();
        Integer tn = (n*(n+1))/2;
        System.out.printf("Triangular number: %s", tn);

        keyboard.close();
    }
// 2) Вывести все простые числа от 1 до 1000
    static void Prime_numbers() {
        
        //int n = 1000;
        int i, j, count;
        for (i=1; i < 1000; i++) {
            count = 0;
            for (j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count ==0 && i !=1){
                System.out.print(i + " ");  
            }
        }
    }
// 3) Реализовать простой калькулятор

// 4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0. 
// Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

}