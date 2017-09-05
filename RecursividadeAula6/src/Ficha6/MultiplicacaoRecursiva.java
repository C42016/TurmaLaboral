/*
 *Faça um método recursivo que realize a multiplicação 
 *entre dois números inteiros, 
 *sem utilizar o operador de multiplicação (*).
 */
package Ficha6;

import javax.swing.JOptionPane;

/**
 *
 * @author Helpdesk_Izzy
 */
public class MultiplicacaoRecursiva {
    
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
       int x = Integer.parseInt(JOptionPane.showInputDialog(" introduza o valor do primeiro numero "));
       int y = Integer.parseInt(JOptionPane.showInputDialog(" introduza o valor do segundo numero "));
       
       JOptionPane.showMessageDialog(null, multiplica(x, y));
       // System.out.println(" "+multiplica(x, y));
    }
    
    /**
     * mult, variavel que vai acumulando os resultados 
     * retornados por cada chamada do metodo
     * 
     * metodo que retorna o produto dos dois valores lidos pelo teclado
     */
    static int produto=0;
    public static int multiplica(int x, int y)
    {
    if(x==0)
      return x;
       
      //mult = mult + y;
        produto +=y;
        multiplica(x-1, y);
        return produto;
    }
}
