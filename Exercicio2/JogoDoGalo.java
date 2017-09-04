/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio2;

import java.util.Random;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Dercio
 */
public class JogoDoGalo {

    Vector<Integer> numeros;

    /**
     * O metodo recebe um vector de inteiros usuario seleciona um dos elementos
     * contidos no vector e de forma aleatoria o metodo seleciona uns dos
     * elemntos do vector e compara com o elementos escolhido pelo usuario e
     * repete essa operacao ate que o elemento escolhido pelo usuario conscida
     * com o elemnto selecionado de forma aleatoria imprime uma mensagem
     * informando que o usario vence
     *
     * @param numeros
     */
    public void jogo(Vector<Integer> numeros) {
        Random random = new Random();
        JOptionPane.showMessageDialog(null, numeros.toString());
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, " Dos numeros Apresentados \n Qual sera o numero sorteado ?"));
        
        for (int i = 0; i < numeros.capacity(); i++) {
            int posicao = random.nextInt(10);
            if (a == numeros.get(posicao)) {
                
                JOptionPane.showMessageDialog(null, " Parabens acertou!!!! \n O Numero :" + a + " esta na posicao: " + posicao);
                 a= Integer.parseInt(JOptionPane.showInputDialog(null, " 1.jogar \n 2. sair"));
                if(a==1)
                    jogo(numeros);
               else break;
            } 
            else if (i == 9) {
                jogo(numeros);
            }

        }

    }
    
   
    

    public static void main(String[] args) {

        JogoDoGalo jogo = new JogoDoGalo();
        jogo.numeros = new Vector<>(10);
        jogo.numeros.add(1);
        jogo.numeros.add(2);
        jogo.numeros.add(3);
        jogo.numeros.add(5);
        jogo.numeros.add(5);
        jogo.numeros.add(7);
        jogo.numeros.add(9);
        jogo.numeros.add(91);
        jogo.numeros.add(20);
        jogo.numeros.add(7);

        jogo.jogo(jogo.numeros);

    }

}
