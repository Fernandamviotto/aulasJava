package com.mycompany.gerenciamentoveiculos;

public class Moto extends Veiculo implements IPassageiro {
    
    protected boolean temSidecar;
    
    public Moto(String placa, String marca, String modelo, double valorDiaria, boolean temSidecar){
        super(placa, marca, modelo, valorDiaria);
        this.temSidecar = temSidecar;
    }
    
    @Override
    public abstract double calcularAluguel(int dias);{
        System.out.println("O aluguel do carro da placa" + placa +  "marca" + marca + "e modelo" + modelo +"é de" +valorDiaria);
    }
    
    @Override
    public int calcularCapacidade(){
        System.out.println(" A capacidade de passageiros é de");
    }
}

