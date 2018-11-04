package uem.aula;

import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Alfredo
 */
<<<<<<< HEAD:src/uem/aula/SjtTurmaLaboral.java
public class SjtTurmaLaboral {
=======
public class TurmaLaboral {
//atributos
    Vector<Estudante> estudante;

    public TurmaLaboral(int numeroEstudantes) {
        estudante = new Vector<>(numeroEstudantes);
    }
<<<<<<< HEAD:src/uem/aula/TurmaLaboral.java
    public static void adicionarEstudante(){
        int a = 0;
        String nome = JOptionPane.showInputDialog("Nome do estudante: ");
    }
=======
>>>>>>> 9b7217de6c7bbbadd11ccc4351ee28489d364429:src/uem/aula/TurmaLaboral.java

>>>>>>> a587cc77bacee248839fc0d0e0596fc52d3d0c0e:src/uem/aula/SjtTurmaLaboral.java
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    }

}
