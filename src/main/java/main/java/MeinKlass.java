package main.java;
import java.util.Scanner;//Для работы с консолью

public class MeinKlass {
    public static void main(String[] args) {
        /**
         Простейший консольный калькулятор.
         Считываем два числа с плав.точкой и символ операции.
         Выводим результат.
         @author Olga Pashenina
         */
        Scanner sc = new Scanner(System.in);
        double a,b=0;
        char c='+';
        System.out.println("Input first number:");
        a=sc.nextDouble();      //считываем первое число
        System.out.println("Input second number:");
        b=sc.nextDouble();      //считываем второе число
        System.out.println("Input operation symbol (+,-,/,*):");
        c=sc.next().charAt(0);  //считываем символ
        switch(c){      //в зависимости от символа выводим результат
            case'-':
                System.out.printf("Result: %.4f",(a-b));
                break;
            case'*':
                System.out.printf("Result: %.4f",(a*b));
                break;
            case'/':
                if(b==0)
                    System.out.println("Result: infinity");
                else
                    System.out.printf("Result: %.4f",(a/b));
                break;
            default:
                System.out.printf("Result: %.4f",(a+b));
                break;
        }
        sc.close();
    }
}