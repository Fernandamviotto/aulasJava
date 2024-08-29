package com.mycompany.gerenciamentodispositivo;


public class Smartphone extends Celular {
    
    protected String sistemaOperacional;
    public Smartphone(String numero, String modelo, String operadora, String sistemaOperacional) {
        super(numero, modelo, operadora);
        this.sistemaOperacional = sistemaOperacional;
    }
    
    @Override
    public void ligar(){
    System.out.println("Ligando para o numero" + numero + "usando o modelo" + modelo + "com o" + sistemaOperacional);
}
 
    public void acessarInternet(){
        System.out.println("Acessando a internet pelo smartphone com" + sistemaOperacional);
    }
    
    
    public void enviarMensagem(String mensagem, String midia){
        System.out.println("Enviando mensagem" + mensagem + "com" + midia + "para" + numero + "via" + operadora);
    }
}
