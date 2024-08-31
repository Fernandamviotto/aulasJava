package com.mycompany.exemplo_inter;


public class Peixe implements Animal{
    @Override
    public void fazersom(){
        System.out.println("Bolhas, Bolhas");
    }
    
    @Override
    public void mover(){
        System.out.println("Nadar...");
    }
}
