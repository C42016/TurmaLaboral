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
public class Computador extends Produto{
    private double VelocidadeProcessamento;

    public double getVelocidadeProcessamento() {
        return VelocidadeProcessamento;
    }

    /**
     * 
     * @param VelocidadeProcessamento 
     */
    
    public void setVelocidadeProcessamento(double VelocidadeProcessamento) {
        this.VelocidadeProcessamento = VelocidadeProcessamento;
    }
    
    
    
    @Override
    public void ligar()
    {
        System.out.println(" O computador está pronto para uso ");  
    }
    @Override
    public void desligar()
    {
        System.out.println(" computador já pode ser desligado com segurança");
    }
    
    public void Processar()
    {
        System.out.println("Computador processando");
    }
    
}
