
package Exercicio1;

import javax.swing.JOptionPane;

public class Exercicio1 {
    
    public static void conversaoBinaria(int n){
        if(n>0){
            conversaoBinaria(n / 2);
            System.out.println(n % 2);
            
        }
    }
    
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduza o numero"));
        conversaoBinaria(numero); 
    } 
    
}
