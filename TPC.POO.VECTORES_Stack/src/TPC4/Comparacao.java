/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPC4;

import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author celio manso
 */
public class Comparacao {
    
    
    
    public static void main(String[] args) {
       Vector<Boolean> v1 = new Vector(Integer.parseInt(JOptionPane.showInputDialog("informe o tamanho do vector1")));
         Vector<Boolean> v2 = new Vector(Integer.parseInt(JOptionPane.showInputDialog("informe o tamanho do vector2")));
      
         for(int i=0;i<v1.capacity();i++){
           boolean  num=Boolean.parseBoolean(JOptionPane.showInputDialog("introduza o "+i+"o valor do vector1"));
             v1.addElement(num);
         }
         
          for(int i=0;i<v2.capacity();i++){
             boolean  num1=Boolean.parseBoolean(JOptionPane.showInputDialog("introduza o "+i+"o  valor do vector2"));  
             v2.addElement(num1);
         }
          
        for (int i=0;i< v1.capacity();i++){
    for(int j=0;j<v2.capacity();j++){
 if ( v1.capacity() ==  v2.capacity() &&  v1.elementAt(i) ==  v2.elementAt(j)){
  JOptionPane.showMessageDialog(null,"São idênticos\n  vector1"+v1+"\nvector 2"+v2+"\ntamanho do vector1: "+v1.capacity()+"\ntamanho do vector2: "+v2.capacity());
  }else{JOptionPane.showMessageDialog(null,"São diferentes\n  vector1: "+v1+"\nvector 2: "+v2+"\ntamanho do vector1: "+v1.capacity()+"\ntamanho do vector2: "+v2.capacity());}
}
        }    
    }
    
    
    
}
