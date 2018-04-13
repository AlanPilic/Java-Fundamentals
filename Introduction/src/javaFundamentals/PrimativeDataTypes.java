/*
 * Let's dive into the
 * primitive data types in Java.
 * 
 */

package javaFundamentals;

public class PrimativeDataTypes {

	public static void main(String[] args) {
		
		/* 
		 * 2^0	2^1	2^2	2^3  2^4  2^5  2^6  2^7
		 *  1	 2	 4	 8   16   32   64   128
		 *  
		 *  A byte is a signed two's complement integer, since
		 *  it is two's complement the first
		 *  value is a negative value, therefore
		 *  
		 * +/-1  1   2   4    8   16   32   64
		 *  0	 1	 1	 1	  1	   1    1    1
		 *  
		 */
		
		byte byteMin = -128;
		byte byteMax = 127;
		System.out.println(byteMin + byteMax);
		
		// A short is similar in essence but its 16 bit signed integer,
		// therefore it's more in the sense of 0/-1 1 2 4 8 16 32 64 128 256 ... and so on
		short shortMin = -32768;
		short shortMax = 32767;
		System.out.println(shortMin + shortMax);
		
		// finally, an int is a 32 bit signed integer
		// same example as before but up to the 32 bit
		int intMin = -2147483648;
		int intMax = 2147483647;
		System.out.println(intMin + intMax);
		
		// longs are 64 bit signed integers
		long longMin = 2 * (intMax * intMax);
		System.out.println(longMin);
		
		// float, used for precision and 32 bit IEEE, a whole course can be covered
		// on this topic and why this is not used for precise measurements.
		float floatValP = 0.2232f;
		float floatValN = -0.223f;
		System.out.println(floatValP + floatValN);
		
		// Doubles are the 64 bit equivalent. Think of using these as precise measurements
		// but not as precise measurements on applications that need carry and round values.
		// Back in the 70's, an instance of this occurred in the movie Superman, a villain had the idea to
		// shave off the interest accrued on bank transactions and put it in his personal bank account,
		// this naturally lead to fraud and if applied to trillions of transactions in a day, you get the idea. 
		// For simplicities sake a great example is 10% interest on 1 cent is .1 cents, now deposit that in
		// an account and keep track of it. Time passes again now your account has accrued another 10% interest on your
		// .1 cents which equals to .01 cents and now you have a total of .11 cents of interest now multiply
		// that by a trillion transactions and you get the idea. 
		double doubleValue = 0.2982389892389d;
		System.out.println(doubleValue);
		
		// Booleans are simply true or false values similar to 0 equating to false in other languages and 1 to true
		boolean isTrue = true;
		boolean isFalse = false;
		
		// Lastly, we have the char primitive which signifies one single unicode character, a string
		// is at a low level is a grouping of characters, we'll get into that later on.
		char character = 'a';
		System.out.println(character);
		
		

	}

}
