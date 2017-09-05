/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ficha6;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Helpdesk_Izzy
 */
public class CombinacoesPossiveis {
    
       
    public static void main(String[] args){
        CombinacoesPossiveis  a = new CombinacoesPossiveis();
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("introduza o numero correspondente as geracoes"));
        ArrayList<Character> array = new ArrayList<>();
        String alfabeto = "ABCDEFGHIJKLMNOPKRSTUVWXYZ";
        String aux = "";
  
        for(int i = 0 ; i<n ; i++){
            aux += alfabeto.charAt(i);
            array.add(alfabeto.charAt(i));
            
        }
            
        
        
        auxiliar = aux;
     
        a.sequencia(array);
            
    }
    
    int cont;
    static String auxiliar;
    boolean passou = false;
    
    public void sequencia(ArrayList<Character> caracteres){ 
        char troca;
        String alf="";
        for(int i = 0; i<caracteres.size();i++)
            alf += String.valueOf(caracteres.get(i));
        
        if (passou == true && alf.equals(auxiliar))
            System.exit(0);
    
        if (cont != caracteres.size()){
            System.out.println(alf);
 
            troca  = caracteres.get(cont);
            caracteres.set(cont, caracteres.get(cont+1));
            caracteres.set(cont+1, troca);
            cont++;
                    
            if(cont == caracteres.size()-1)
                cont = 0;
            
            passou = true;
            sequencia(caracteres);  
        }
       
           
    }
    
    
}
