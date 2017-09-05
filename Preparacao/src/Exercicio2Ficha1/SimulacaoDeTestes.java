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
public class SimulacaoDeTestes {
    
    public void simular(Produto p)
    {
     p.ligar();
     p.desligar();
     
     if(p instanceof Computador)
     {
      Computador c = (Computador) p;
      c.Processar();
         System.out.println(c.getVelocidadeProcessamento());
     }
     
     //
     if(p instanceof Impressora)
     {
       Impressora i =(Impressora) p;
       i.Imprimir();
         System.out.println(i.getDescriçãoVelocidadeImpressão());
         System.out.println(i.getVelocidadeImpressao());
     }
    }       
    
}
