/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio2Ficha1;

/**
 *
 * @author Helpdesk_Izzy
 */
public class Impressora extends Produto{
   private double velocidadeImpressao;
   private String descriçãoVelocidadeImpressão;
   

    public double getVelocidadeImpressao() {
        return velocidadeImpressao;
    }

    public void setVelocidadeImpressao(double velocidadeImpressao) {
        this.velocidadeImpressao = velocidadeImpressao;
    }

    public String getDescriçãoVelocidadeImpressão() {
        return descriçãoVelocidadeImpressão;
    }

    public void setDescriçãoVelocidadeImpressão(String descriçãoVelocidadeImpressão) {
        this.descriçãoVelocidadeImpressão = descriçãoVelocidadeImpressão;
    }
   
    
   
    
    public void ligar()
    {
        System.out.println("A impressora está pronto para receber documentos");
    }
    public void desligar()
    {
        System.out.println( "A impressora não está mais disponível");
    }
    
    public void Imprimir()
    {
        System.out.println("A impressora está em uso");
    }
}
