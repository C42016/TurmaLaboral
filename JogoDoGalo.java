
import java.util.Random;
import java.util.Vector;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juvencia Chongo
 */
public class JogoDoGalo {
Vector<Integer> vector=new Vector<>();

    /**
     * Este metodo possiilita ao usuario preencher o vector com os numeros desejados ate a quantidade desejada
     */
    
    public void preenchervector(){
       
       
        
}
    /**
     *com o uso da classe Random, este metodo gera numros aleatorios entre 0 e o tamnho do vector.
     * os numeros gerados seram usados no  metodo adivinhar que ira usar como indice.
     * o metodo nextInt recebe como parametro o limite maximo+1 do intervalo dos numeros a serem criados
     * @see adivinhar()
     * @return int
     */
    public int gerarIndice(){
   
        //instância um objeto da classe Random usando o construtor básico
		Random gerador = new Random();
                return gerador.nextInt(vector.size()+1);
    }
    
    /**Metodo que retorna o o numero inteiro na posicao gerada pelo metodo gerarIndie() do vector
     * @see gerarIndice()
     * @return 
     */
    public int adivinhar(){
        int i=gerarIndice();
       
        return (int) vector.get(i);
    }
    
    public boolean verificar(int i){
        
        if(adivinhar()==i)
            return true;
        else 
            return false;
    }
    
    public boolean nuncaperde(){
     int proximo=Integer.parseInt(JOptionPane.showInputDialog("Advinha o proximo nr"));

        while(verificar(proximo)==false){
            this.verificar(proximo);
        }
        return true;
    }
    
    public static void main(String[] args) {
        
        JogoDoGalo jogar=new  JogoDoGalo();
       
        jogar.preenchervector();
        
        //jogar.verificar(vector);
        
        if(jogar.nuncaperde())
            System.out.println("Acertou Em cheio "+jogar.adivinhar());
        else
    System.out.println("errou Em cheio "+jogar.adivinhar());

    }
}

