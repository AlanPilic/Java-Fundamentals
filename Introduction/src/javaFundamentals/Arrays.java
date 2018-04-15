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
		

	}

}
