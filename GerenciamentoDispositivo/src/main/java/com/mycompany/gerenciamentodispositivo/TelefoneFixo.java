
package com.mycompany.gerenciamentodispositivo;


public class TelefoneFixo extends DispositivoTelefonico {
    
    public TelefoneFixo(String numero, String modelo) {
        super(numero, modelo);
    }
    
    @Override
    public void ligar(){
    System.out.println("Ligando para o numero fixo" + numero + "usando o modelo" + modelo);
}
   public void verificarLinhaTelefonica(){
       System.out.println("Verificando linha telefonica para o numero fixo" + numero);
   }
}
