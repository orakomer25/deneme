package day08_ifElseStatements;

import java.util.Scanner;

public class C02_IfElseIfStatement {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("lütfen bir tamsayı giriniz");
        int girilensayi=scanner.nextInt();

        if (girilensayi%3==0&& girilensayi%5==0){
            System.out.println("süper sayı");
        } else if (girilensayi%3==0) {
            System.out.println("3'ün katı");

        } else if (girilensayi%5==0) {
            System.out.println("5'in katı");


        } else {
            System.out.println("yaramaz sayı");

        }

    }
}
