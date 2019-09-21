package prvipaket;

import java.util.Scanner;

public class PrviDomaciZadatak1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double a,b,c,n;
		System.out.println("Unesi prvi broj: ");
		a=sc.nextDouble();
		System.out.println("Unesi drugi broj: ");
		b=sc.nextDouble();
		System.out.println("Unesi trci broj: ");
		c=sc.nextDouble();
		n=(a+b+c)/3;
		System.out.println("Srednja vrednost unetih brojeva je: " +n);

	}

}
