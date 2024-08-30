package com.mycompany.exemplo_abstrato;


public abstract class Animal {
    protected String nome;
    protected int idade;
    
    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
}
