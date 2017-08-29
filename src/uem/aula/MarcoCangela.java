
package uem.aula;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Marco Cangela Garujo
 */
public class MarcoCangela {
    
    public static void main(String[] args) {
        System.out.println("Introduza o total de alunos:");
        Scanner dados = new Scanner(System.in);
        int totalAlunos = dados.nextInt();
        Vector<Estudante> alunos = new Vector<Estudante>(totalAlunos);
       
        System.out.println("Introduza o seu nome: ");
        String nome = dados.next();
    
        Vector<Double> notas = new Vector<>(3);
        System.out.println("Introduza a sua nota 1:  ");
        double n1 = dados.nextDouble();
        System.out.println("Introduza a sua nota 2:  ");
        double n2 = dados.nextDouble();
        System.out.println("Introduza a sua nota 3:   ");
        double n3 = dados.nextDouble();
        notas.add(n1);
        notas.add(n2);
        notas.add(n3);
    }   
}
