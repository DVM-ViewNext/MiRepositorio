package training.lab1;

public class Flujos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Sentencia for
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		// Array ya establecido
		int[] myNumbers = {10, 20 , 30, 40, 50};
		for(int i = 0; i < myNumbers.length; i++) {
			System.out.println(myNumbers[i]);
		}
		
		// Condicion
		for(int i = 0; i < 5; i++) {
			System.out.println("i = " + i);
			if (i == 2) break;
		}
		
		// Sentencia while
		int counter = 5;
		while(counter > 0) {
			System.out.println("Counter = " + counter);
			counter--;
		}
		
		// Sentencia do while
		int counter2 = 10;
		do {
			System.out.println("Counter2 = " + counter2);
			counter2++;
		} while (counter2 < 0);
		
		
		
		
	}

}
