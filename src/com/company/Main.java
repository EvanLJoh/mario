package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       Scanner val = new Scanner(System.in);
       System.out.println("Input number between 1 and 9: ");
       int num = val.nextInt();
       int num2 = num;
       while (num < 1 || num > 8) {
           System.out.println("The number is not between 1-9. Please input a number between 1 and 9: ");
           num = val.nextInt();
       }
       if (num > 1 && num < 9){
           String a = "#";
           String s = " ";
           for (int i = 0 ; i < num2; i++){
               System.out.println(s.repeat(num-1) + a.repeat(i+1));
               num = num - 1;
               System.out.println();
           }
       }
       if (num == 1) {
           System.out.println("#");
       }
    }
}
