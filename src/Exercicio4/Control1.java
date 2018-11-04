
package Exercicio4;

import Exercicio3.*;

public class Control1 {
    
   
    public static int k=0;
    
  public static int verifica(int numero, int n){
     
        if(numero == 0)
          return 0;
         else {
            
         if( n ==(numero %10))
            k++;
        }     verifica(numero / 10,n);
        
       return k;
     }
  
    public static void main(String[] args) {
      
        System.out.println(verifica(1233,3));
    }
  
}
