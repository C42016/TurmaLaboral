/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.aula;

import javax.swing.JOptionPane;

/**
 *
 * @author Dercio
 */
public class TesteEstudante {
    
    public static void main(String[] args) {
        ControleEstudante cE= new ControleEstudante();
        cE.Regista();
        JOptionPane.showMessageDialog(null,"melhores alunos"+ cE.buscaMelhores());
    }
    
}
