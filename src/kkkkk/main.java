package kkkkk;

import java.util.Scanner;
public class main {
 
    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);
  
        System.out.println("Введите число 1 ");
        int num1 = scan.nextInt();
        double pu = num1;
        double res;
 
        while (true) {
 
            System.out.println("Введите число 2 ");
            int num2 = scan.nextInt();
            System.out.println("Введите операцию");
            String action = scan.next();
            res = pu;
            if ( action.equals("=")) {
                System.out.println("Результат:" + res);
                break;
 
            } else if (action.equals("+")) {
                System.out.println("Результат");
                pu = pu + num2;
                res = pu;
                System.out.println(res);
 
            } else if (action.equals("-")) {
                System.out.println("Результат");
                pu = pu - num2;
                res = pu;
                System.out.println(res);
 
            } else if (action.equals("/")) {
                System.out.println("Результат");
                pu = num1 / num2;
                res = pu;
                System.out.println(res);
 
            } else if (action.equals("*")) {
                System.out.println("Результат");
                pu = pu * num2;
                res = pu;
                System.out.println(res);
            } 
             else {
                System.out.println("Такой операции нет, повторите ввод.");
            }
        }
    }
}