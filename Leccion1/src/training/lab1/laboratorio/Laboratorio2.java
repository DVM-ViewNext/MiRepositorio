package training.lab1.laboratorio;

import java.util.Arrays;
import java.util.Scanner;

public class Laboratorio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//Búsqueda en el arreglo

		// Ejemplo:
		// Supongamos que el usuario ingresa el número 6 y el siguiente arreglo:
		// [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		// El programa debe realizar una búsqueda binaria en el arreglo y encontrar el índice del número 6
		
		// Lectura
		System.out.print("Introduce un valor: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println("Posicion: " + Arrays.binarySearch(array, num));
		
		
		
		
	}

}
