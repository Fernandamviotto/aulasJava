package com.mycompany.sistemapagamentos;

public class CartaoCredito extends Pagamento{
    protected int NumeroParcelas; 
    
    public CartaoCredito(double valorTotal, int NumeroParcela){
        super(valorTotal);
        this.NumeroParcelas = NumeroParcelas;
    }
    
    @Override
    public double calcularValorFinal(){
        if (NumeroParcelas > 1){
            
            return (valorTotal * 0.02 )* NumeroParcelas;
        }
        
        return valorTotal;
    }
}
