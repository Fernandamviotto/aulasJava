package com.mycompany.gerenciamentoveiculos;


public class Carro extends Veiculo{
    protected int numeroPortas;
    
    public Carro(String placa, String marca, String modelo, double valorDiaria, int numeroPortas){
        super(placa, marca, modelo, valorDiaria);
        this.numeroPortas = numeroPortas;
    }
    
    @Override
    public abstract double calcularAluguel(int dias);{
    System.out.println("O valor do aluguel para" + /*dias +*/ "é de" + valorDiaria);
    }
}
