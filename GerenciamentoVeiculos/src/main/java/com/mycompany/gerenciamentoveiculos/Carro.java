package com.mycompany.gerenciamentoveiculos;


public class Carro extends Veiculo implements IPassageiro {
    protected int numeroPortas;
    
    public Carro(String placa, String marca, String modelo, double valorDiaria, int numeroPortas){
        super(placa, marca, modelo, valorDiaria);
        this.numeroPortas = numeroPortas;
                
    }
    
    @Override
    public double calcularAluguel(int dias){
     if (dias > 7){
            return (dias * valorDiaria * 0.05) + valorDiaria;
        } 
            return dias * valorDiaria;
}
    
    @Override
    public int calcularCapacidade(){
        return 5;
    }
}


