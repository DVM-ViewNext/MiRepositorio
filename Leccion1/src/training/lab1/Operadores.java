package training.lab1;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Tipos de datos 
		//Los tipos de datos en java pueden ser clasificados como
		//Primitive Type o Reference Type
		
		//Almacenan valores
		//Tipo Primitive - byte, short, int,long, float, double, char y boolean
		
		
		//Se almacena en memoria y puede ser cambiado
		//Tipo Reference - Ej String message = "Hello";
			
		//Declaracion de Variables
		
		/*String message = "Hello World"; //Almacena datos que se representan como texto
		
				//Trabajan con valores numericos
				byte userAge = 20;
				short numberOfStudents = 45;
				int numberOfEmployees = 500;
				long numberOfInhabitants = 21021313012678L;

				float hourlyRate = 60.5F; //La letra F indica que es un float
				double numberOfHours = 5120.5;

				char grade = 'A';
				
				boolean promote = true;

				byte level = 2, userExperience = 5;*/
		int x = 5;
		int y = 10;
		x = y;
		System.out.println("Nueva asignación a X: " + x);

		x = x + 2;
		//x += 2; // hace lo mismo
		System.out.println("Nueva suma de 2: " + x);
		
		
		x++;
		// ++x; // hace lo mismo
		System.out.println("Incremento en 1: " + x);
		
		x = x - 2;
		// x -= 2; // hace lo mismo
		System.out.println("Resta de 2: " + x);
		
		x = x * 2;
		// x *= 2; // hace lo mismo
		System.out.println("Multiplicación por 2: " + x);
		
		x = x / 2;
		// x /= 2; // hace lo mismo
		System.out.println("División: " + x);
		
		
		int userAge = 34;
		int userAge1 = 34;
		if(userAge == userAge1) {
			 System.out.println("Son valores iguales");
		}
		
		int userAge2 = 24;
		int userAge3 = 37;
		if(userAge2 != userAge3) {
			 System.out.println("Son diferentes valores");
		}
		
		if(userAge2 > 0 && userAge3 > 0) {
			 System.out.println("Los valores de las variables son mayores");
		}
		
		if(userAge2 < 30 || userAge3 > 100) {
			 System.out.println("Se cumple al menos una condición");
		}
	}

}
