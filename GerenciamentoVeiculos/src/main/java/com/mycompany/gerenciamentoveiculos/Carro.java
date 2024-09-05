package com.mycompany.gerenciamentoveiculos;


public class Carro extends Veiculo implements IPassageiro {
    protected int numeroPortas;
    
    public Carro(String placa, String marca, String modelo, double valorDiaria, int numeroPortas){
        super(placa, marca, modelo, valorDiaria);
        this.numeroPortas = numeroPortas;
                
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


