package com.mycompany.ex004;
import java.util.Scanner;

public class EX004 {

    public static void main(String[] args) {
        int num;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        num = scanner.nextInt();
        
        while (num >=0){
            System.out.println("Digite um novo numero");
            num = scanner.nextInt();
        }
    }
}
