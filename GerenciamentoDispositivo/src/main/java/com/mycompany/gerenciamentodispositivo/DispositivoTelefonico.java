package com.mycompany.gerenciamentodispositivo;

public class DispositivoTelefonico {
    //atributo
protected String numero;
protected String modelo;

//construtor
public DispositivoTelefonico(String numero, String modelo){
    this.numero = numero;
    this.modelo = modelo;
}

public void ligar(){
    System.out.println("Ligando para o numero" + numero + "usando o modelo" + modelo);
}

public void mostrarDetalhes(){
    System.out.println("Numero" + numero + "Modelo" + modelo);
}
}
