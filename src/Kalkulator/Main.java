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
			String[] b = a.split(" "); //split nad stringom vraca listu stringova koji se nalaze u stringu a - zato pravimo listu stringova i smestamo taj rez
			if(b.length != 3) { //ne treba .length() jer nije f-ja, nego je polje - to sto vraca a.split()
				System.out.println("Ulaz nema 3 parametra"); 
				continue;	//nama trebaju tacno tri elementa, ako ima 2 ili 5 el ice continue, ako nije, nastavice nesto raditi (sabirati npr)
			}
		}
	}

}
