package com.mycompany.sistemapagamentos;

public class Cheque extends Pagamento{
    boolean aprovado;

    public Cheque(double valorTotal) {
        super(valorTotal);
    }
    
    @Override
    public double calcularValorFinal(){
        if (aprovado == true){
            
            return valorTotal;
        }
        
        return (valorTotal * 0.20);
    }
}
