package training.lab1;

import java.util.Arrays;

public class ListasArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Metodos arrays
		int[] arr1 = {0, 2, 4, 6, 8, 10};
		int[] arr2 = {0, 2, 4, 6, 8, 10};
		int[] arr3 = {10, 8, 6, 4, 2, 0};
		
		boolean result1 = Arrays.equals(arr1, arr2);
		boolean result2 = Arrays.equals(arr1, arr3);
		
		System.out.println("Result1: " + result1);
		System.out.println("Result2: " + result2);
		
		// Array origen o fuente
		int[] source = {12, 1, 5, -2, 16, 18, 20, 25};
		
		// Array origen o fuente
		int[] dest = Arrays.copyOfRange(source, 3, 7);
		
		System.out.println("Destino " + dest[0]);
		System.out.println("Destino " + dest[1]);
		System.out.println("Destino " + dest[2]);
		System.out.println("Destino " + dest[3]);
		
		// Metodo .toString()
		int[] source2 = {12, 1, 5, -2, 16, 18, 20, 25};
		System.out.println(Arrays.toString(source2));
		
		// Metodo sort(), ordenar un array
		int[] source3 = {12, 1, 5, -2, 16, 18, 20, 25};
		Arrays.sort(source3);
		System.out.println("Resultado ordenado: " + Arrays.toString(source3));
		
		// Obtener longitud de array
		int[] userAge = {21, 22, 23, 24, 25, 26};
		System.out.println(userAge.length);
		
		
		
		
	}

}
