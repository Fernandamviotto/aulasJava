package com.mycompany.gerenciamentoveiculos;

public class Caminhao extends Veiculo implements IPesado {
    
    double pesoCarga;
    int eixos;
    
    public Caminhao(String placa, String marca, String modelo, double valorDiaria, double pesoCarga, int eixos){
        super(placa, marca, modelo, valorDiaria);
        this.pesoCarga = pesoCarga;
        this.eixos = eixos;
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
