/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ficha5Recursividade;

import javax.swing.JOptionPane;

/**
 *
 * @author edy
 */
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
