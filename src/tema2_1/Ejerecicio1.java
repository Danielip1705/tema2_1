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
		
		switch (nota) {
		case 0,1,2,3,4:
			System.out.println("Insuficiente");
			System.out.println("Espabila campeón");
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7,8:
			System.out.println("Notable");
		break;
		case 9,10:
			System.out.println("Sobresaliente");
		break;
		default:
			System.out.println("Esta nota no es posible");
		}
		sc.close();
		
			
		
		
		
		
		
		
		
			
	}

}
