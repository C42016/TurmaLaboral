
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
public class VectoresIguais {
    Vector<Boolean> v1,v2;
    
    /**
     * Metodo Compara os dois vectores booleanos, sengundo as condicoes de igualdade de vectores booleanos
     * do exercicio
     * @param v1
     * @param v2
     * @return
     */
    public boolean compara(Vector<Boolean> v1,Vector<Boolean>  v2 ){
        boolean teste=false;
      if(v1.size()==v2.size())
          for(int i=0; i<v1.size();i++)
              if(v1.get(i).equals(v2.get(i)))
                  teste=true;
          else
             break;     
 return teste;
    }
    
    public static void main(String[] args) {
        Vector<Boolean>v1=new Vector<>();
        Vector<Boolean>v2=new Vector<>();
        v1.add(true);
        v1.add(true);
        v1.add(false);
        v1.add(false);
        //v1.add(false);
        
        v2.add(true);
        v2.add(true);
        v2.add(false);
        v2.add(false);
        if(new VectoresIguais().compara(v1, v2))
            System.out.println("Os vectores sao iguais");
        else
            System.out.println("Os vectores sao diferentes");

    }
}
