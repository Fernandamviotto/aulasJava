package com.mycompany.gerenciamentoveiculos;

public class Moto extends Veiculo implements IPassageiro {
    
    protected boolean temSidecar;
    
    public Moto(String placa, String marca, String modelo, double valorDiaria, boolean temSidecar){
        super(placa, marca, modelo, valorDiaria);
        this.temSidecar = temSidecar;
    }
    
    @Override
    public double calcularAluguel(int dias){
        if (temSidecar == true){
            return (dias * valorDiaria * 0.10) + valorDiaria;
        } 
        
        return dias * valorDiaria;
        
    }
    
    @Override
    public int calcularCapacidade(){
       if (temSidecar == true){
            return 2;
        } 
        
        return 1;
    }
}

