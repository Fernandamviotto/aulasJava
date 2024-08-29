package com.mycompany.ex002;
import java.util.Scanner;

public class EX002 {

    public static void main(String[] args) {
        double nota;
        
       Scanner scanner = new Scanner(System.in);
       System.out.println("Digite a nota");
       nota = scanner.nextDouble();
       
       if(nota >=90){
           System.out.println("Sua nota é A");
       }else if(nota >=80){
           System.out.println("Sua nota é B");
       }else if(nota >=70){
           System.out.println("Sua nota é C");
       }else
           System.out.println("Sua nota é D");
    }
}
