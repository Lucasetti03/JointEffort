
public class Sottrazione {
    private double numero,numero1;

    public Sottrazione(double numero, double numero1) {
        this.numero = numero;
        this.numero1 = numero1;
    }
    /**
     * nel metodo, dichiariamo un attributo di tipo double e per il risultato, basta sottrarre i numeri inseriti da tastiera(fa tutto in automatico)
     * @param numero
     * @param numero1
     * @return ritorna il risultato della sottrazione tra numero e numero1
     */
    public static double calcolaSottrazione(double numero,double numero1){
        double risultato;
        risultato=numero-numero1;
        return risultato;
    }
}
