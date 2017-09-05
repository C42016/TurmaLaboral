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
public class Aplicativo {
    
    public static void main(String[] args) {
        Computador co = new Computador();
        Impressora im = new Impressora();
        
        co.setVelocidadeProcessamento(10);
        co.setNumeroDeSerie(5);
        co.setTipo(" Lg");
        
        im.setVelocidadeImpressao(4);
        im.setDescriçãoVelocidadeImpressão("muito rapida");
        im.setNumeroDeSerie(7);
        im.setTipo(" a Laser ");
        
        SimulacaoDeTestes sm = new SimulacaoDeTestes();
          sm.simular(co);
          sm.simular(im);
    }
    
}
