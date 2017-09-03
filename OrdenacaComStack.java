
import java.util.Stack;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JUVENCIA´S COMPUTER
 */
public class OrdenacaComStack {
    
    /**
     * Metodo que procura  maior valor no vector e adiciona em uma Stack, ordenando o vector
     * @param v
     * @param s 
     */
    void Selecao (Vector<Integer> v,Stack<Integer> s) {
        int i, j, aux, imaior; 
        
        for (j=v.size()-1; j>0; j--) { 
            imaior = 0; 
            for(i=1; i<j; i++){ 
            if(v.get(imaior)<v.get(i))
            imaior = i;
           
            aux =  v.get(j);
           v.set(j, v.get(imaior)); 
            v.set(imaior, aux);
         
            }
             
             s.push(v.get(j));
             
           
}
                    } 
    
    
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<Integer>();
        Stack<Integer> s=new Stack<>();
        // Preenchimeno do vector
        vector.addElement(2);
        vector.addElement(0);
        vector.addElement(4);
        vector.addElement(1);
        vector.addElement(9);
        vector.addElement(10);
        vector.addElement(3);
        
        System.out.println("Vector original");
        //Imprime o vector original(Sem nenhuma alteracao)
        for(Integer c: vector)
           System.out.println(" "+c);
        // instacia a classe OrdenacaComStack e chama o metodo que ordena o vector na stack
     new OrdenacaComStack().Selecao(vector,s);
    //Imprime os dados do vector ja ordenados na stack
      System.out.println("Stack ordenada");
        for(Integer c: s)
           System.out.print(" "+c);
     
  }

}
