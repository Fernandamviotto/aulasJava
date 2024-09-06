package com.mycompany.gerenciamentoveiculos;


public class GerenciamentoDeVeiculos {
    private Veiculo[] veiculos;
    private int indice;
    
    public GerenciamentoDeVeiculos(){
        veiculos = new Veiculo[10];
        indice = 0;
    }
    
    public void adicionarVeiculo(Veiculo veiculo) {
        if (indice < veiculos.length) {
            veiculos[indice] = veiculo;
            indice++;
            System.out.println("Veículo adicionado com sucesso!");
        } else {
            System.out.println("Capacidade máxima atingida! Não é possível adicionar mais veículos.");
        }
    }
    
    public void Relatorio(){
        if(indice == 0){
            System.out.println("Nenhum veiculo cadastrado");
        } else{
            for(int i = 0; i < indice; i++){
                //colocar os dados de cada string
            }
        }
    }
    
}
