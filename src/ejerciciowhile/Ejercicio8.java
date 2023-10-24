package ejerciciowhile;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arbol1;
		int arbol2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserte el numero de metro que mide el árbol");
		
		arbol1 = sc.nextInt();
		
		System.out.println("Inserte el numero de metro que mide el árbol");
		
		arbol2 = sc.nextInt();
		
		while (arbol1>=0 && arbol2>=0) {
		System.out.println("Inserte el numero de metro que mide el árbol");
			
		arbol1 = sc.nextInt();
			
		System.out.println("Inserte el numero de metro que mide el árbol");
			
		arbol2 = sc.nextInt();
		}
		if (arbol1>arbol2) {
			System.out.println("El árbol mas alto de todos mide: " +arbol1);
		} else if (arbol2>arbol1) {
		System.out.println("El árbol mas alto de todos mide: " +arbol2);
		}
		sc.close();
	}

}
