/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.ContaBancaria;
import Modelo.ContaCorrente;
import Modelo.ContaPoupanca;
import javax.swing.JOptionPane;

/**
 *
 * @author Helpdesk_Izzy
 */
public class Controle {
    
    public int quantidade(){
        return   Integer.parseInt(JOptionPane.showInputDialog("Introduza a quantidade de contas"));
    }
    
    ContaBancaria conta[] = new ContaBancaria[this.quantidade()];
    
    public boolean criarConta(){
        int tipoConta = 0;
        for(int i = 0; i<conta.length; i++){
        tipoConta = Integer.parseInt(JOptionPane.showInputDialog("Escolha o tipo de conta \n"
                + " 1 - Conta corrente \n"
                + "2 - Conta poupanca"));
        
        
        switch(tipoConta){
            case 1: ContaCorrente cc = new ContaCorrente(Integer.parseInt(JOptionPane.showInputDialog("Introduza o numero da conta")),
                 Integer.parseInt(JOptionPane.showInputDialog("Introduza o saldo da conta")));
                 conta[i] = cc;
            break;
            case 2: ContaPoupanca cp = new ContaPoupanca(Integer.parseInt(JOptionPane.showInputDialog("Introduza o numero da conta")),
                 Integer.parseInt(JOptionPane.showInputDialog("Introduza o saldo da conta")));
                 conta[i] = cp;
            break;
            
            default:JOptionPane.showMessageDialog(null, "Tipo de conta inexistinte");
            break;
        }
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        Controle c = new Controle();
        c.criarConta();
    }
    
}
