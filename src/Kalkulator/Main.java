package Kalkulator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ovaj skener mozemo izvan while petlje jer je on zajednicki za svako izvrsavanje petlje
		Scanner s1 = new Scanner(System.in); //pravimo klasu skener i inicijalizujemo je ali moamo da includ-ujemo skener 3 linija
		//Za pravljenje novog objekta koistimo kljucnu rec new, navodimo objekat klase koji pravimo (Scanner) i u zagradama navodimo dakle nam skenira - System.in - sa ulaza
		while(true) {
			
			String a = s1.nextLine(); //uz pomoc . pozivamo neku metodu iz skenera
			if(a.equals("")) {
				continue; //ako je prazan string, preskacemo tu iteraciju
			}
			if(a.equals("exit") || a.equals("kraj")) {
				break;
			}
		}
	}

}
