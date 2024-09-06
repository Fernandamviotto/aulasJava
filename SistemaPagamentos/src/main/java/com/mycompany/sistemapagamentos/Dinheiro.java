package com.mycompany.sistemapagamentos;

public class Dinheiro extends Pagamento{
    
    public Dinheiro(double valorTotal){
        super(valorTotal);
    }
    
    @Override
    public double calcularValorFinal(){
        double desconto = valorTotal * 0.10;
        return valorTotal - desconto;
    }
    
}
