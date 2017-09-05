/*
 * Faça um programa (utilizando recursividade) que peça para o utilizador digitar um número,
 * em seguida, faça a soma de todos os algarismos do número. 
 * Exemplos: 1111 = 1+1+1+1 = 4 2090 = 2+0+9+0 = 11.
 */
package Ficha6;

import javax.swing.JOptionPane;

/**
 *
 * @author Helpdesk_Izzy
 */
public class SomaDigitos {
    
    
   public static void main(String[] args) {
      
        SomaDigitos a = new SomaDigitos();
           String numero = (JOptionPane.showInputDialog("Introduza o numero: "));

       JOptionPane.showMessageDialog(null, a.soma(numero));
 
    }
    
    int aux =0, add;
    public int soma(String n){
    //(Base)   
        if (aux == n.length())
        return 0;
        
    //(Recursao)    
        add = Integer.parseInt(String.valueOf(n.charAt(aux)));
        aux++;
        return add + soma(n);      
    }
  
}