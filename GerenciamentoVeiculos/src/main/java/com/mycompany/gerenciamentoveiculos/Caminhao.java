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
    public double calcularAluguel(int dias){
        if (eixos > 2){
            return ((dias * valorDiaria * 0.02 ) + valorDiaria) * eixos;
        } 
            return dias * valorDiaria;
    }
    
    @Override
    public double calcularTaxaPeso(){
        return 0.05;
    }
    
}
