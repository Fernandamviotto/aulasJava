package com.mycompany.sistemapagamentos;

public class GerenciamentoPagamento {
    private Pagamento[] pagamentos;
    private int indice;
    
    public GerenciamentoPagamento(){
        pagamentos = new Pagamento[5];
        indice = 0;
    }
}