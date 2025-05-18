
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Main main=new Main();
		main.runtime();
		
	}
	public void runtime() {
		while(true) {
			double espreal=Math.exp(2);
			System.out.println("esponenziale reale,solo errore di arrotondamento:"+espreal);
			System.out.println("inserire parametro per l'esponente calcolato:");
			Scanner scanner=new Scanner(System.in);
			int k=scanner.nextInt();
			double esptot=0;
			for(int i=0;i<k;i++) {
				esptot=esptot+this.espcalc(i);
			}
		double error=Math.abs(espreal-esptot);
			System.out.println("l'esponenziale di due approssimato al k-esimo termine è:"+esptot+"\n l'errore analitico è:"+ error);
			
			
		}

		
	}
	public double espcalc(int index) {
		double espcal=Math.pow(2, index)/this.factorial(index);
		return espcal;
	}
	public double factorial(int index) {
		long fact=1;
		for(int j=2;j<=index;j++) {
			fact=fact*j;
		}
		return fact;
	}

}

