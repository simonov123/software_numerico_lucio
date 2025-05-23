import java.util.ArrayList;
import java.util.Scanner;
public class calcolo_polinomio_di_ruffini {
	public void runtime() {
		//inserimento dati inziali (valore di x e grado polinomio,inserimento costanti del valore di x)
		Scanner scan=new Scanner(System.in);
		System.out.println("inserire il grado del polinomio");
		int grado=scan.nextInt();
		System.out.println("inserire base x");
		int base=scan.nextInt();
		ArrayList<Integer> costanti=new ArrayList<>();
		for(int i=0;i<grado+1;i++) {
			System.out.println("inserire moltiplicatore per x elevato a "+i);
			costanti.add(scan.nextInt());
		}
		//applicazione del metodo di Ruffini
		int p=costanti.get(grado);
		for (int j=0;j<grado;j++) {
			p=p*base+costanti.get(grado-(j+1));
		}
		//stampa dei risultati
		System.out.println("il valore del polinomio è: "+p);
		for (int k=0;k<grado+1;k++) {
			System.out.println(costanti.get(grado-k)+"*"+base+" elevato a "+k);
		}
		
		
		
	}

}
/*METODO DI RUFFINI-HORNER
Applicato a un polinomio di grado 5 
poniamo ogni volta in evidenza il termine x in comune
p5x= c0+c1x1+c2x2+c3x3+c4x4+c5x5
=c0+x(c1+c2x1+c3x2+c4x4+c5x4)
=c0+x(c1+x(c2+c3x1+c4x2+c5x3))
=c0+x(c1+x(c2+x(c3+c4x1+c5x2)))
=c0+x(c1+x(c2+x(c3+x(c4+c5x))))

in questo modo ho trasformato un polinomio di grado 5 in un prodotto di binomi 
a questo punto posso partire dalle parentesi più interne ed eseguire il calcolo ricorsivamente

(((((c5)*x+c4)*x+c3)*x+c2)*x+c1)*/
 

