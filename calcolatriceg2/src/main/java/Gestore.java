import java.util.Scanner;

public class Gestore {
    public static void main(String[] args){
       int operazione;
      double numero, numero1;
Scanner scan = new Scanner(System.in);
System.out.println("Scegliere il tipo di operazione:");
System.out.print("Inserire 1 per l'addizione, 2 per la sottrazione, 3 per la moltiplicazione, 4 per la divisione, 0 per uscire: ");
operazione = scan.nextInt();
numero=scan.nextInt();
numero1=scan.nextInt();
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
        
    break;
    
    default :
    System.out.print("Uscita programma");
   }
  } 
 }

