/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.aula;

import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Toni Maunde
 */
public class MiltonTurmaLaboral {
    Vector<Estudante> listaDeAlunos;
    
    public void adicionar(){
        int r = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos deseja registar: ?"));
        listaDeAlunos= new Vector<>(r);
        int i;
        for(i=0; i<listaDeAlunos.size(); i++){
            String n = JOptionPane.showInputDialog("Introduza o nome do Aluno.");
            double n1 = Double.parseDouble(JOptionPane.showInputDialog("Introduza a nota do teste 1"));
            double n2 = Double.parseDouble(JOptionPane.showInputDialog("Introduza a nota do teste 2"));
            double n3 = Double.parseDouble(JOptionPane.showInputDialog("Introduza a nota do teste 3"));
            
            double media= (n1+n2+n3)/3;
            Vector<Double> notas= new Vector<>();
            
            notas.add(n1);
            notas.add(n2);
            notas.add(n3);
            Estudante estudante= new Estudante(n, notas, media);
        }
    }
    public static void main(String[] args) {
        
    }
}
