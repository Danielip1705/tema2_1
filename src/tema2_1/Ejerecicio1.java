package tema2_1;

import java.util.Scanner;

public class Ejerecicio1 {

	public static void main(String[] args) {
		//indicamos con la variable int la nota
		int nota;
		
		//creamos scanner
		Scanner sc =  new Scanner(System.in);
		
		//imprimimos en pantalla que nota ha sacado
		
		System.out.println("Indica la nota que has sacado");
		
		//escribe la nota
		nota = sc.nextInt();
		
		//indicamos con switch la nota
		switch (nota) {
		//en el primer caso, indicamos que si la nota es 1,2,3,4. Que nos imprima insuficiente
		case 0,1,2,3,4:
			System.out.println("Insuficiente");
			System.out.println("Espabila campeón");
			break;
			//en el segundo caso, indicamos que si la nota es 5, que nos imprima suficiente
		case 5:
			System.out.println("Suficiente");
			//rompemos el caso con break
			break;
			
			//en el tercer caso, indicamos  que si la nota es 6 , que nos imprima bien
		case 6:
			System.out.println("Bien");
			//rompemos el caso con break
			break;
			
			//en el cuarto caso, indicamos que si la nota es 7 o 8, que nos imprima notable
		case 7,8:
			System.out.println("Notable");
		
		//rompemos el caso con break
		break;
		
		//en el quinto paso, indicamos que si la nota es 9 o 10, que nos imprima sobresaliente
		case 9,10:
			System.out.println("Sobresaliente");
		//rompemos el caso con break
		break;
		
		//con default, indicamos que nos imprima que la nota no existe
		default:
			System.out.println("Esta nota no es posible");
		}
		
		//cerramos scanner
		sc.close();
		
			
		
		
		
		
		
		
		
			
	}

}
