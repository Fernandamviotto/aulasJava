package com.mycompany.smartphone;

public class Celular {
    
    //atributos
    private int anodeFabricacao;
    private String nome;
    private String marca;
    
    //construtor 
    Celular(int anodeFabricacao, String nome, String marca){
        this.anodeFabricacao = anodeFabricacao;
        this.nome = nome;
        this.marca = marca;
    }
    
    //metodos
    public boolean atender;
    public boolean desligar;
    public boolean tirarFoto;
    public boolean receberDigital;
    
        
    public void atender(boolean acao){
       if (acao)
           System.out.println("A chamada foi atendida");
       else 
           System.out.println("A chamada não foi atendida");
    }
    
    public void desligar(boolean acao){
        if(acao)
            System.out.println("O celular foi desligado");
        else
            System.out.print("Nao foi possivel desligar o celular");
    }
    
    public void tirarFoto(boolean acao){
        if(acao)
            System.out.println("Foto tirada");
        else
            System.out.print("Não foi possivel tirar a foto");
    }
    
    public void receberDigital(boolean acao){
        if(acao)
            System.out.println("Tela desbloqueada");
        else
            System.out.print("Nao foi desbloquear a tela");
    }
}
