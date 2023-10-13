package ejercicio_while;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int contNeg=0;
		int mediaNeg;
		int cantidad=0;
		int total =0;
		double neg=0;
		int contcero =0;
		
		Scanner sc = new Scanner(System.in);
		
		
		while (cantidad<10) {
			System.out.println("Introduzca el " + (cantidad + 1) + " numero");
			
			num = sc.nextInt(); //1º
			
			
			cantidad++; //2º
			
			if (num<0) {
				contneg++;
				num += neg;
			} //3º
				
			else if (num==0) {
				contcero++;
			} //4º
			else if (num>=0) {
				total += num;
			}
		
		}
		
		System.out.println("La suma de los numeros positivos son: " +total);
		medianeg = con
		System.out.println("La media de los numeros negativos son: " +neg/contneg);
		System.out.println("En los 10 numeros que has insertado, hay en total " +contcero+ " ceros");
		
		
		sc.close();
		
		
	}
}



