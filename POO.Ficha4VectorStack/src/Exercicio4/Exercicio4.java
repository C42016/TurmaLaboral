/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio4;

import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author edy
 */
public class Exercicio4 {
    
    private static Vector<Boolean> booleans1 = new Vector<>();
    private static Vector<Boolean> booleans2 = new Vector<>();
    Vector<Integer> auxivector = new Vector<>();
   
    int valor;

    
    public boolean Adicionar() {
        do {
            this.booleans1.add(Boolean.parseBoolean(JOptionPane.showInputDialog("Introduza o valor booleano")));
            valor = JOptionPane.showConfirmDialog(null, "Deseja terminar  de registrar elemenentos no primeiro vector?");
        } while (!(valor == 0));
        do {
            this.booleans2.add(Boolean.parseBoolean(JOptionPane.showInputDialog("Escreva o valor booleano")));
            valor = JOptionPane.showConfirmDialog(null, "Deseja terminar  de registrar elemenentos no primeiro vector?");
        } while (!(valor == 0));
        return true;
    }

    public boolean Comparar() {
        int controlar = 0;
        if (booleans1.size() == booleans2.size()) {
            for (int i = 0; i < booleans1.size(); i++) {
                if (booleans1.elementAt(i) == booleans2.get(i)) {
                    controlar++;
                    if (controlar == booleans2.size()) {
                        return true;
                    }
                } else {
                    return false;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Exercicio4 exercicio4 = new Exercicio4();
        exercicio4.Adicionar();
        JOptionPane.showMessageDialog(null, "Vector 1 \n" + booleans1 + " vector 2 \n" + booleans2);
        if (exercicio4.Comparar()) {
            JOptionPane.showMessageDialog(null, "Sao igusis");
        } else {
            JOptionPane.showMessageDialog(null, "Sao diferentes");
        }
    }
    
}
