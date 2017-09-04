/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPC3;

import static TPC1.Estatistica.media;
import static TPC1.Estatistica.mediana;
import static TPC1.Estatistica.moda;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author celio manso
 */
public class Estudante extends Pessoa {
    
    
    static Vector<Pessoa> vect;
static Pessoa v;
    public Estudante(String nome, double nota1, double nota2, double nota3) {
        super(nome, nota1, nota2, nota3);
    }

    
    
    
    
    
    
     public static void mediadaturma(){
        
        
        int numeroelementos=Integer.parseInt(JOptionPane.showInputDialog("intoduza a capacidade do vecttor"));
        vect= new Vector<Pessoa>(numeroelementos) ;
        
         
       for(int i=0;i< vect.capacity(); i++){
      // vect.add(Integer.parseInt(JOptionPane.showInputDialog("intoduza o "+i+"o numero")));  
       }
   
       
        
     
       //   JOptionPane.showMessageDialog(null,"Capacidade do vector: "+vect.capacity()+"\nElementos do vector: "+vect+"\nA media e: "+media+"\n a soma e: "+soma);
          

   
    }
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        
      
         int soma = 0;
         boolean continua=true;
         while(continua==true){
             
         
      int opcao=Integer.parseInt(JOptionPane.showInputDialog("[1]-Registar alunos\n[2]-Exibir media de cada aluno\n[3]-Mostrar o estudante(s) com melhor media\n[4]-Sair\nescolha uma opcao"));
      
      switch(opcao){
          
          
          case 1: int numeroelementos=Integer.parseInt(JOptionPane.showInputDialog("intoduza a quantidade de alunos"));
        vect= new Vector<Pessoa>(numeroelementos) ;  
        for(int i =0;i<vect.capacity();i++){
            v = new Pessoa(JOptionPane.showInputDialog("informe o nome do "+i+"o aluno"),Double.parseDouble(JOptionPane.showInputDialog("introduza a nota1")),Double.parseDouble(JOptionPane.showInputDialog("introduza a nota2")),Double.parseDouble(JOptionPane.showInputDialog("introduza a nota3")));
            vect.add(v);
        } ; break;
              
              
              
          case 2: for(Pessoa o: vect){  
             soma +=o.getNota1()+o.getNota2()+o.getNota3();
        }
                
              
                double media=soma/3;
              for(Pessoa a : vect){
              JOptionPane.showMessageDialog(null,"A turma tem: "+vect.capacity()+" alunos\nNome: "+a.getNome()+"\nnota1: "+a.getNota1()+"\nnota2: "+a.getNota2()+"\nnota3: "+a.getNota3()+"\nA sua media e: "+media) ;
          }
         break;
 
          case 3:  
              
           
              break;
              
          case 4:System.exit(0); ; break;
              
          default: JOptionPane.showMessageDialog(null,"Escolha uma opcao");
              
      }
      
        
    }
        
    }
}
