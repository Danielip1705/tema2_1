package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//indicamos con la variable int el num y contador(1)
		int num,contador=1;
		
		//creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		//imprimimos en consola que nos escriba un numero
		System.out.println("Escriba el numero");
		
		//escribimos el num
		num = sc.nextInt();
		
		//con for, indicamos con la variable int(1)
		//si i es menor igual que uno, se incremeta i
		for (int i =1;i<=num;i++) {
			
			//contador(1) se multiplica por i
			contador *=i;
			
			
		}
		//imprimimos el resultado en pantalla
		System.out.println("El factorial de " +num+ " es "+contador);
		
		//cerramos scanner
		sc.close();
	}

}
