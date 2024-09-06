package com.mycompany.sistemapagamentos;

public abstract class Pagamento {
   protected double valorTotal;
    
    public Pagamento(double valorTotal){
        this.valorTotal = valorTotal;
    }
    
    public abstract double calcularValorFinal();
}
