import java.util.Random;
import java.util.Scanner;
public class condizionamento_della_somma {
	public void condizionamento_della_somma() {
	//dati non perturbati
	Scanner scanner=new Scanner(System.in);
	System.out.println("inserire numero reale x:\n");
    double x=scanner.nextDouble();
    System.out.println("inserire numero reale y:\n");
    double y=scanner.nextDouble();
    //genero gli errori
    Random rand=new Random();
    double errx=rand.nextDouble()*Math.pow(10,-7);
    double erry=rand.nextDouble()*Math.pow(10,-7);
    //dati perturbati
    double xpt=x+errx;
    double ypt=y+erry;
    //somma perturbata e non perturbata
    double s=x+y;
    double st=xpt+ypt;
    double erx=Math.abs(x-xpt)/Math.abs(x);  //errore relativo x
    double ery=Math.abs(y-ypt)/Math.abs(y);  //errore relativo y
    double erst=Math.abs(s-st)/Math.abs(s);  //errore relativo somma
    //stampa risultati
    System.out.println("x="+x);
    System.out.println("y="+y);
    System.out.println("x perturbato="+xpt);
    System.out.println("y perturbato="+ypt);
    System.out.println("somma non perturbata="+s);
    System.out.println("somma perturbata="+st);
    System.out.println("errore relativo x="+erx);
    System.out.println("errore relativo y="+ery);
    System.out.println("errore relativo somma="+erst);
	
	
	

}}
