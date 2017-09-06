/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1;

/**
 *
 * @author edy
 */
import java.util.Collections;
import javax.swing.JOptionPane;
import java.util.Vector;

public class Estatistica1 {
    
    static  Vector <Integer> vector;
    
    public static void moda(){
       int numeroelementos = Integer.parseInt(JOptionPane.showInputDialog("Introduza a capacidade do vector"));
        vector= new Vector<Integer>(numeroelementos) ;
       
       for(int i=0;i< vector.capacity(); i++){
       vector.add(i,Integer.parseInt(JOptionPane.showInputDialog("Introduza o " + i + " o numero")));
      
       }
       int moda1=0;
       int repeticao=0;
        for(int i=0;i< vector.capacity(); i++){
           int  numrepeticoes=0;
           for(int j=0;j<vector.capacity();j++){
               if(vector.elementAt(i)==vector.elementAt(j)){
                numrepeticoes++;   
               }
               if(numrepeticoes > repeticao){
                   moda1=vector.elementAt(i);
                   repeticao=numrepeticoes;
               }
           }
          
        }
        
            JOptionPane.showMessageDialog(null, "A moda e: "+moda1+"\n Numero de repeticoes: "+repeticao+"\nCapacidade do vector: "+vector.capacity()+"\nElementos do vector: "+vector);    
             

         
         
       }
    
     public static void mediana(){
       
       
       int numeroelementos=Integer.parseInt(JOptionPane.showInputDialog("intoduza a capacidade do vecttor"));
        vector= new Vector<Integer>(numeroelementos) ;
       
       for(int i=0;i< vector.capacity(); i++){
       vector.add(i,Integer.parseInt(JOptionPane.showInputDialog("intoduza o "+i+"o numero")));
      
       }
       
      double mediana;
             Collections.sort(vector);
            if(numeroelementos % 2 ==1){
               mediana=(numeroelementos+1)/2;
                JOptionPane.showMessageDialog(null,"Capacidade do vector: "+vector.capacity()+"\nElementos do vector: "+vector+"\nA mediana e: "+mediana);    
            } else if(numeroelementos % 2 ==0){
                mediana=((numeroelementos/2 )+(numeroelementos/2+1))/2;
                 JOptionPane.showMessageDialog(null,"Capacidade do vector: "+vector.capacity()+"\nElementos do vector: "+vector+"\nA mediana e: "+mediana);    
               
        }    
        
   }
     
     public static void media(){
        
        
        int numeroelementos=Integer.parseInt(JOptionPane.showInputDialog("intoduza a capacidade do vecttor"));
        vector= new Vector<Integer>(numeroelementos) ;
        
          int soma = 0;
       for(int i=0;i< vector.capacity(); i++){
       vector.add(Integer.parseInt(JOptionPane.showInputDialog("intoduza o "+i+"o numero")));  
       }
   
        for(int i=0;i< vector.capacity(); i++){  
     soma =soma+vector.elementAt(i);
        }
        
       double media=soma/vector.capacity();
          JOptionPane.showMessageDialog(null,"Capacidade do vector: "+vector.capacity()+"\nElementos do vector: "+vector+"\nA media e: "+media+"\n a soma e: "+soma);
          

   
    }
    
    
     public static void main(String[] args) {
         boolean continua=true;
         while(continua==true){
             
         
      int opcao=Integer.parseInt(JOptionPane.showInputDialog("[1]-Calcular moda\n[2]-calcularmediana\n[3]-Calcular media\n[4]-Sair\nescolha uma opcao"));
      
      switch(opcao){
          case 1: moda(); break;
          case 2:mediana() ; break;
          case 3:media(); break;
          case 4: System.exit(0); break;
          default: JOptionPane.showMessageDialog(null,"Escolha uma opcao");
              
      }
      
        
    }
     }
    
}
