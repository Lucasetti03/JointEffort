/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author utente
 */
public class Somma {
    private double numero,numero1;
    /**
     * creo il costruttore di Somma
     * @param numero
     * @param numero1 
     */
    public Somma(double numero, double numero1) {
        this.numero = numero;
        this.numero1 = numero1;
    }
    /**
     * nel metodo, dichiariamo un attributo di tipo double e per il risultato, basta sommare i numeri inseriti da tastiera(fa tutto in automatico)
     * @param numero
     * @param numero1
     * @return ritorna il risultato della addizione tra numero e numero1
     */
    public static double calcolaSomma(double numero,double numero1){
        double risultato;
        risultato=numero+numero1;
        return risultato;
    }
}
