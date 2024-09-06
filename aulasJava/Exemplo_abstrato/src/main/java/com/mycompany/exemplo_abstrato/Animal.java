package com.mycompany.exemplo_abstrato;


public abstract class Animal {
    protected String nome;
    protected int idade;
    
    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    //metodo abstrato que deve ser implementada em outras superclasse
    public abstract void emitirSom();
    public void dormir(){
        System.out.println(nome + "esta dormindo");
    }
}
