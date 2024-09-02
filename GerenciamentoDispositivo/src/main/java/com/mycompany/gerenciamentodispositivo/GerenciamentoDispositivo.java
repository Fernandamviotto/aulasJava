package com.mycompany.gerenciamentodispositivo;

public class GerenciamentoDispositivo {

    public static void main(String[] args) {
        DispositivoTelefonico [] dispositivos = new DispositivoTelefonico[]{
            new TelefoneFixo("1234-5678", "Modelo A"),
            new Celular("9203-7753", "Modelo B", "Operadora Tim"),
            new Smartphone("9765-5969", "Modelo C", "Operadora Claro", "Android"),            
        };   
        
        for (DispositivoTelefonico dispositivo : dispositivos){
            dispositivo.ligar();
            dispositivo.mostrarDetalhes();
            
            if (dispositivo instanceof Smartphone){
                Smartphone smartphone = (Smartphone)dispositivo;
                smartphone.acessarInternet();
                smartphone.enviarMensagem("Oi", "foto.jpg");
            } else if (dispositivo instanceof Celular){
                ((Celular) dispositivo).enviarMensagem("Olá, tudo bem?");
            } else if (dispositivo instanceof TelefoneFixo){
                ((TelefoneFixo) dispositivo).verificarLinhaTelefonica();
            }
            
        }
    }
}
