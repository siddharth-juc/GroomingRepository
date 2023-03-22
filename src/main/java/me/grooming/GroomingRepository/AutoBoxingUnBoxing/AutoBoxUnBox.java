package me.grooming.GroomingRepository.AutoBoxingUnBoxing;

public class AutoBoxUnBox {

	public void autoBox() {

		/*
		 * Declaring primitive type
		 */
		int i = 8;

		/*
		 * Now we will use Wrapper Class
		 */
		Integer i_wrap = i;
		Integer c_wrap = Integer.valueOf(8);

		System.out.println("Value of i declared 	=====> " + i);
		System.out.println("value of i_wrap used 	=====> " + i_wrap.intValue());

		/*
		 * Checking if both Objects are equal, the wrapper object initialized as Object
		 * & the wrapper object using primitive value
		 */
		System.out.println("i_wrap.equals(c_wrap)   =====> " + i_wrap.equals(c_wrap));
		
	}
	
	public void unBox() {
		
		/*
		 * Declaring as Wrapper Object
		 */
		Integer i = Integer.valueOf(7);
		
		/*
		 * Let's check if primitive operations are possible on Wrapper Objects
		 */
		System.out.println("Let's see . . . . . . ");
		System.out.println(" i + 1 is equal to 		=====> " + (i + 1));
		System.out.println(" i - 1 is equal to 		=====> " + (i - 1));
		
	}

}
