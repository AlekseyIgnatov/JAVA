
//Урок 1. Знакомство с языком программирования Java
//Формат сдачи: ссылка на подписанный git-проект.


import java.util.Scanner;
public class Lesson_1 {
   

public static void main(String[] args) {
    //Triangle_number();
    //Prime_numbers();
    //Calc();
    Equation();
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
    static void Calc() {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Input number a: ");
        double a = keyboard.nextDouble();
    
        System.out.print("Enter any operator(+ , - , * , /) ");
        char operator = keyboard.next().charAt(0);
        
        System.out.print("Input number b: ");
        double b = keyboard.nextDouble();

        keyboard.close();

        switch (operator) {
    case '+':
        System.out.println(a + " + " + b + " = " + (a + b));
        break;
    case '-':
        System.out.println(a + " - " + b + " = " + (a - b));
        break;
    case '*':
        System.out.println(a + " x " + b + " = " + (a * b));
        break;
    case '/':
        System.out.println(a + " / " + b + " = " + (a / b));
        break;
    default:
        System.err.println("Invalid Operator Specified.");
        break;
}
    }
// 4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0. 
// Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
    static void Equation() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input equation: ");
        String str = keyboard.nextLine();
        
        int i,j;
        int x1=0;
        int y1=0;
        int count=0;
        String[] words = str.split("\\s");
        char[] a = words[0].toCharArray();
        char[] b = words[2].toCharArray();
               
        int sum = Integer.parseInt(words[4]);
          
        for (i=1; i < 10; i++) {
            if (a[0] == '?') {
                x1 = i*10 + Integer.parseInt(String.valueOf(a[1]));
            } else if (a[1] == '?') {
                x1 = Integer.parseInt(String.valueOf(a[0]))*10 + i;
            }
            for (j=1; j < 10; j++) {
                if (b[0] == '?') {
                    y1 = j*10 + Integer.parseInt(String.valueOf(b[1]));
                } else if (b[1] == '?') {
                    y1 = Integer.parseInt(String.valueOf(b[0]))*10 + j;
                }
                if (x1 + y1 == sum) {
                    System.out.printf("%d + %d = %d",x1,y1,sum);
                } else {
                    count++;
                }
            }
        }
        if (count != 0) {
           System.out.print("There is no solution!"); 
        }
    }        
}
