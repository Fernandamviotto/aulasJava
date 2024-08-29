package com.mycompany.gerenciamentodispositivo;


public class Celular extends DispositivoTelefonico{
    
    protected String operadora;
    
    public Celular(String numero, String modelo, String operadora) {
        super(numero, modelo);
        this.operadora = operadora;
    }
    
    @Override
    public void ligar(){
    System.out.println("Ligando para o numero" + numero + "usando o modelo" + modelo + "da operadora" + operadora);
}
    public void enviarMensagem(String mensagem){
        System.out.println("Enviando mensagem" + mensagem + "para" + numero + "via" + operadora);
    }
}
