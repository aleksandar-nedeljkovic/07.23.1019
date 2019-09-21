package prvipaket;

import java.util.Scanner;

public class PrviDomaciZadatak2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double r,p,v;
		System.out.println("Unesi poluprecnik: ");
		r=sc.nextDouble();
		p=Math.PI;
		v=(4*r*r*r*p)/3;
		System.out.println("Zapremina loopte je: " +v);

	}

}
