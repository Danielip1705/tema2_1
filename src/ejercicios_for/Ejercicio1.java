package ejercicios_for;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//indicamos con la variable int el num
		int num;
		
		//creamos scanner
		Scanner sc = new Scanner(System.in);
		
		//imprimimos en pantalla que se escriba el num
		System.out.println("Indica hasta que numero quieres que se muestre en consola");
		
		//Escribimos el num
		num = sc.nextInt();
		
		//con for creamos condicion; si condicion es menor que num se suma +1
		for (int condicion =1;condicion<=num;condicion++) {
			
			//imprimimos en pantalla la condicion
			System.out.println(condicion);
			
		}
		//cerramos scanner
		sc.close();
	
	
	}

}
