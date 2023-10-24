package ejercicios_for;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//indicamos con la variable int el num
		int num;
		
		//creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		//imprimimos en consola que coloque un numero
		System.out.println("Indique hasta que numero se va a contar");
		
		//escribimos num
		num = sc.nextInt();
		
		//con for, indicamos con la variable int el multiplo(3)
		//si multiplo es menor al num, se suma a multiplo 3
		for(int multiplo=1;multiplo<num;multiplo+=1) {
			if (multiplo%3==0) {
			
				//imprimimos en consola el resultado(multiplo)
				System.out.println(multiplo);
			}
			
			
		}
		
		
	}

}
