/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPC5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author euliterio
 */
public class Exercicio5 {
   
  
    /**
     * Este vector serve para guardar todos elementos adicionados
     *
     * @since
     */
    private static Vector<Integer> inteiros; 
  static  Stack<Integer> auxivector = new Stack<>();

   
   

    public static void main(String[] args) {

        
        
        int num=Integer.parseInt(JOptionPane.showInputDialog("informe a capacidade do vector"));
       inteiros = new Vector<>(num);
       for(int i=0;i<inteiros.capacity();i++ ){
           inteiros.addElement(Integer.parseInt(JOptionPane.showInputDialog("informe o "+i+" elemento")));
           
         
       } 
        
        int au;
        Collections.sort(inteiros);
        auxivector.addAll(inteiros);
        for (int i = 0; i < auxivector.size(); i++) {
            for (int j = i + 1; j < auxivector.size(); j++) {
                if (auxivector.get(i) > auxivector.get(j)) {
                    au = auxivector.get(i);
                    auxivector.set(i, auxivector.elementAt(j));
                    auxivector.set(j, au);
                }
            }
        }
       JOptionPane.showMessageDialog(null, "Os elementos do vector: "+auxivector);
       try{
          for(int i=0;i<auxivector.capacity();i++){
         // for (int r : auxivector) {
            JOptionPane.showMessageDialog(null,"eliminando: "+auxivector.pop());
        //}
          }
       }catch(Exception e){
        
    }
     JOptionPane.showMessageDialog(null, "Os elementos do vector: "+auxivector); 
    } 
    
       
       
    }

