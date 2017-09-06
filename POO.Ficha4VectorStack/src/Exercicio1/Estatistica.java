/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1;

import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author edy
 */
public class Estatistica {
    
    public static void ordenacao(int[] numeros){
        
        int aux;
        for(int i = 0; i<numeros.length; i++){
            for(int j = i+1; j<numeros.length; j++){
                if(numeros[i]>numeros[j]){
                    aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux; 
                }
            }
        }
        
        for(int cresce: numeros){
            System.out.println(cresce);
        }
    }
    
    public static void mediana(Vector<Integer> numeros){
        
        int inicio = 0;
        int fim = numeros.size();
        int meio;
        
        if(fim % 2 == 0){
            meio = fim/2;
        }else{
            meio = (fim+1)/2;
        }
        
        System.out.println("Numero central e " + numeros.get(meio));
    }
    
    
    
    public static void media(int media[]){
        
       int soma = 0;
       for(int i = 0; i<media.length; i++){
           media[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduza o numero"));
           soma += media[i];
       }
       
       double medias = soma/media.length;
       JOptionPane.showMessageDialog(null,"Media dos numeros e " + medias);
    }
   
    public static void main(String[] args) {
             
        int[] a = {12,12};
       // media(a);
        
        int d[] = {2,1,-3,-10};
         
     //   ordenacao(d); 
              
        
        int quat = Integer.parseInt(JOptionPane.showInputDialog("Introduza a quantidade de elemetos"));
        Vector<Integer> numeros = new Vector<>(quat);
        for(int i = 0; i<numeros.size(); i++){
            int elementos = Integer.parseInt(JOptionPane.showInputDialog("Introduza o elemeto"));
            numeros.add(elementos); 
        }
        
     //   numeros.
        mediana(numeros);
        
    }
    
}
