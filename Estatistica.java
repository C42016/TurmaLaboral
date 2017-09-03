
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juvencia Chongo
 */
public class Estatistica {
    
    public void moda(Vector<Integer> vector, int elementos){
       int moda=0;
       int nVezes;
       int comparaV=0;
            
        
    
        for (int p = 0; p <vector.size(); p++) {     
            nVezes = 1;     
    
            for (int k = p + 1; k <vector.size(); k++) {     
                if (vector.get(p) == vector.get(k)) {     
                    ++nVezes;     
                }     
            }
            moda =  vector.get(p); 
//            if (nVezes > comparaV) {     
//                moda =  vector.get(p).toString();
//                comparaV = nVezes;     
////            }     
//           if (nVezes == comparaV) {     
//                moda = moda+","+ vector.get(p).toString();     
//                comparaV = nVezes;     
//            }     
        }     
    
        System.out.println("Moda: "+moda);     
    }     
     
        
    
    
    public void mediana(Vector<Integer> vetor, int elemenos){
        int e=0;
        if((vetor.size()%2)==0){
             e=vetor.elementAt(((elemenos-1)/2))+(vetor.elementAt((elemenos-1)/2 +1));
          System.out.println(e/2);   
        }else
           System.out.println(vetor.get((vetor.size()-1)/2));
    }
   
    
    public void media(Vector<Integer> vetor, int elemenos){
        int media;
        int soma=0;
       for(int i=0;i<vetor.size();i++)
        soma+=vetor.get(i);
        System.out.println( media=soma/vetor.size());;
    
    }
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>(8);
        
        vector.add(0, 5);
        vector.add(1, 10);
        vector.add(2, 13);
        vector.add(3, 9);
        vector.add(4, 3);
        vector.add(5, 10);
       vector.add(6, 5);
        System.out.println(vector.size()); 
      new Estatistica().mediana(vector, vector.size());
        //System.out.println(vector.size());
    }
    
}
