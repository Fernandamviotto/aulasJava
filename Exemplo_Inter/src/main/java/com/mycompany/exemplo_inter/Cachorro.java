package com.mycompany.exemplo_inter;


public class Cachorro implements Animal {
    
    @Override
    public void fazersom(){
        System.out.println("Latido");
    }
    
    @Override
    public void mover(){
        System.out.println("Correr...");
    }
}
