/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ficha5Recursividade;

import java.util.Scanner;

/**
 *
 * @author edy
 */
public class Exercicio2 {
    
    /**
     * 
     * @param num1
     * @param num2
     * @return 
     * Este metodo recursivo faz a multiplicacao de 2 numeros
     * sem o usar o operador de multiplicacao
     */
    
        public static int multiplicacao(int num1, int num2){
            if(num1==1){
               return num2; 
            }
            
            if(num1==0){
                return 0;
            }
            
            return num2+multiplicacao(num1-1, num2);
        }
    
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int soma = 0;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Introduza o primeiro mumero");
        numero1 = in.nextInt();
        System.out.println("Introduza o segundo mumero");
        numero2 = in.nextInt();
        
        System.out.println("A multiplicacao dos numero e " + multiplicacao(numero1, numero2));
        
        
    }
    

    
}
