package org.example;

import java.util.Scanner;
/*
    A≠0 olmak üzere klavyeden katsayıları girilen ikinci dereceden denklemin köklerini hesaplayan program.

        Ax²+Bx+C = 0              Ax²+Bx+C = 0                  Ax²+Bx+C = 0
        A = 1                     A = 2                         A = 1
        B = -2                    B = -7                        B = 2
        C = 1                     C = 3                         C = 3

        Katlı Kök Vardır :        Gerçel Kökler Vardır :        Sanal Kökler Vardır.
        Katlı Kök : 1,00          Kökler :0,50	3,00
*/

public class Main {
    public static void main(String[] args) {

        double a,b,c,d,x1,x2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ax²+Bx+C = 0");
        System.out.print("A = ");
        a = scanner.nextDouble();
        System.out.print("B = ");
        b = scanner.nextDouble();
        System.out.print("C = ");
        c = scanner.nextDouble();

        d = b*b-4*a*c;
            if (d>0){
                System.out.println("\nGerçel Kökler Vardır : ");
                x1 = (-b-Math.sqrt(d))/(2*a);
                x2 = (-b+Math.sqrt(d))/(2*a);
                System.out.printf("Kökler :%.2f\t%.2f",x1,x2);
            } else if (d==0) {
                System.out.println("\nKatlı Kök Vardır : ");
                x1 =-b/(2*a);
                System.out.printf("Katlı Kök : %.2f",x1);
            }
            else
                System.out.println("\nSanal Kökler Vardır. ");
    }
}