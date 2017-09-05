/*
 * Crie um algoritmo que calcula o número de digitos binários 
 * de um número n (inteiro positivo) ou seja converte
 * um número inteiro positivo em um binário
 */
package Ficha6;

import javax.swing.JOptionPane;

/**
 *
 * @author Helpdesk_Izzy
 */
public class ConverteBinario {
    public static void main(String[] args) {
        ConverteBinario a = new ConverteBinario();
        
       int num = 0;
       
       
           num = Integer.parseInt(JOptionPane.showInputDialog("Introduza o numero "));
           
        
        a.calculaBin(num);
        JOptionPane.showMessageDialog(null, res);
       
       
    }
    
    static String res = "";
    public void calculaBin(int n){
        if (n != 0){
           calculaBin(n/2);
           res += ""+(n % 2);
          
            
        }
      
    }
}
