package uem.aula;

import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Alfredo
 */
public class TurmaLaboral {
//atributos
    Vector<Estudante> estudante;

    public TurmaLaboral(int numeroEstudantes) {
        estudante = new Vector<>(numeroEstudantes);
    }
    public static void adicionarEstudante(){
        int a = 0;
        String nome = JOptionPane.showInputDialog("Nome do estudante: ");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    }

}
