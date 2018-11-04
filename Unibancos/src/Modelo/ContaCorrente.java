/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Helpdesk_Izzy
 */
public class ContaCorrente extends ContaBancaria{
    
    private int numero;
    private double saldo;
    private int quantidadeTransacoes;

    public ContaCorrente(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
        this.quantidadeTransacoes = 0;
    }
    
    

    @Override
    public void saca(double valor) {
        if(valor>this.saldo){
            this.setSaldo(this.getSaldo()-valor);
            quantidadeTransacoes++;
        }else{
            JOptionPane.showMessageDialog(null, "Impossivel leventar saldo insuficiente");
        }
    }

    @Override
    public void deposita(double valor) {
        if(valor>0){
            this.setSaldo(this.getSaldo()+valor);
            quantidadeTransacoes++;
        }else{
            JOptionPane.showMessageDialog(null, "Nao e possivel depositar um valor negativo");
        }
    }

    @Override
    public void tiraExtrato() {
         JOptionPane.showMessageDialog(null,"Numero: \n" +  numero + " Saldo: " + saldo);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes;
    }

    public void setQuantidadeTransacoes(int quantidadeTransacoes) {
        this.quantidadeTransacoes = quantidadeTransacoes;
    }
    
}
