import java.util.Scanner;

public class Gestore {
    public static void main(String[] args){
        /**
         * dichiariamo le variabili
         */
       int operazione;
      double numero, numero1;
     /**
      * creiamo il menu
      */
Scanner scan = new Scanner(System.in);
System.out.println("Scegliere il tipo di operazione:");
System.out.print("Inserire 1 per l'addizione, 2 per la sottrazione, 3 per la moltiplicazione, 4 per la divisione, 0 per uscire: ");
operazione = scan.nextInt();
numero=scan.nextInt();
numero1=scan.nextInt();
/**
 * nello switch inseriamo tutti i case possibili, e richiamiamo la loro relativa classe e metodo
 */
switch (operazione) {
    case 1:
       Somma.calcolaSomma(numero,numero1);
       break;
       
    case 2:
       Sottrazione.calcolaSottrazione(numero, numero1);
       break;
    
    case 3:
       Moltiplicazione.calcolaMoltiplicazione(numero, numero1);
       break;
    
    case 4:
        Divisione.calcolaDivisione(numero, numero1);
        break;
    case 5:
        Modulo.calcolaModulo(numero, numero1);
        break;
    default :
    System.out.print("Uscita programma");
   }
  } 
 }

