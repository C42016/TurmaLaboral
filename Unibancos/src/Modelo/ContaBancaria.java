/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Helpdesk_Izzy
 */
public abstract class ContaBancaria {
    
    public abstract void saca(double	valor);		
    public abstract void deposita(double valor);		
    public abstract void tiraExtrato();
    
}
