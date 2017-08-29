
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
    
    }   
}
