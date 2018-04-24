/*
 * 	Introducing the first data structure in Java,
 *  an array. Think of an array as something that holds some
 *  kind of values in a finite amount of space. Even though it sounds
 *  complex it isn't, basically think of it as a filing cabinet that stores
 *  folders and binders but in our case a cabinet of data.
 * 
 */

package javaFundamentals;

public class Arrays {

	public static void main(String[] args) {
		// The basics of declaring an array is that
		// they need a type and size as java is a typecast
		// language ( typecast, meaning it's very strict on data declaration )
		int[] array = new int[7];
		
		
		// once declared you are off to the races by simply setting the
		// array to whatever you wish, in this case i'll be declaring an array of
		// todays date
		array[0] = 4;
		array[1] = 1;
		array[2] = 4;
		array[3] = 2;
		array[4] = 0;
		array[5] = 1;
		array[6] = 8;
		
		// Here is a quick printout of our array
		System.out.print("Today's Date is ");
		
		for(int i = 0 ; i < array.length; i++) {
			
			System.out.print(array[i]);
			
			if(i == 0) {
				System.out.print("/");
			}
			if(i == 2) {
				System.out.print("/");
			}
			
		}
		
		System.out.println();
		
		// Now let's do a sample of two dimensional array's, think of them as a 2 dimensional table.
		// Let us showcase a table of animals per species
		
		String[][] animalKingdom = new String[3][6];
		
		animalKingdom[0][0] = "  X  ";
		animalKingdom[0][1] = "Cat";
		animalKingdom[0][2] = "Dog";
		animalKingdom[0][3] = "Bear";
		animalKingdom[0][4] = "Fish";
		animalKingdom[0][5] = "Bird";
		
		animalKingdom[1][0] = " Type";
		animalKingdom[1][1] = "Lion";
		animalKingdom[1][2] = "Shepard";
		animalKingdom[1][3] = "Grizzly";
		animalKingdom[1][4] = "Tuna";
		animalKingdom[1][5] = "Canary";
		
		animalKingdom[2][0] = "Speed";
		animalKingdom[2][1] = "30mph ";
		animalKingdom[2][2] = "25mph";
		animalKingdom[2][3] = "40mph";
		animalKingdom[2][4] = "20mph";
		animalKingdom[2][5] = "80mph";
		
		
		for(int row = 0 ; row < 3; row++) {
			
			for(int column  = 0 ; column < 6; column++) {
				
				System.out.print(animalKingdom[row][column] + " ");
			}
			
			System.out.println();
			
		}
		

	}

}
