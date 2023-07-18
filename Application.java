import java.lang.reflect.Array;

public class Application {

	public static void main(String[] args) {
		// 1.  Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93}; 


//		a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
		int subtractAges = (ages[ages.length -1] - ages[0]); 
		System.out.println("1a: " + subtractAges);
		
//		b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		int[] newAges = {3, 9, 23, 64, 2, 8, 28, 93, 150};
		int subtractAges2 = (newAges[newAges.length -1] - newAges[0]); 
		System.out.println("1b: " + subtractAges2);
		
//		c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console. 
		int sum = 0; 
		for (int i = 0; i < newAges.length; i++) {
			sum += newAges[i]; 
		} System.out.println("1c: " + (sum/newAges.length));
//		2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" }; 
//		a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		int sum2 = 0; 
		for (String name : names) {
			sum2 += name.length(); 
		} System.out.println("2a: " + (sum2/names.length));
		
//		b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console. 
		String concatNames = "";
		for (String name : names) {
			concatNames += name + " "; 
		} System.out.println("2b: " + concatNames);
//		3.	How do you access the last element of any array?
		System.out.println("3: You use array.length-1 to find the last element of any given array");
//		4.	How do you access the first element of any array?
		System.out.println("4: You use array at index 0 to find the first element of an array");
//		5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		int[] nameLengths = new int[6]; 
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length(); 
		}
//		6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		int sum3 = 0; 
		for (int i = 0; i < nameLengths.length; i++) {
			sum3 += nameLengths[i]; 
		} System.out.println("6: " + sum3);  
		
		System.out.println("7: " + concatWord("Hello", 3)); 
		System.out.println("8: " + concatName("Taylor", "Self"));
		int[] numbers = {50, 20, 5}; 
		System.out.println("9: " + isGreaterThan100(numbers));
		double[] nums = {20, 10.5, 22.5, 19.25}; 
		System.out.println("10: " + numsAverage(nums));
		double[] nums2 = {15, 15.5, 13.5, 8.75}; 
		System.out.println("11: " + arraysAverage(nums, nums2));
		System.out.println("12: " + willBuyDrink(true, 10.49));
		System.out.println("13: " + carRentalFee(25));
	}
//		7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		public static String concatWord(String word, int n) {
			String newString = "";
			for (int i = 0; i < n; i++) {
			    newString += word;
			}
			return newString;
		} 
		
//		8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		public static String concatName(String firstName, String lastName) {
			String fullName = firstName + " " + lastName;
			return fullName;
		} 
//		9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100. 
		public static boolean isGreaterThan100(int[] array) {
			int sum = 0; 
			for (int i = 0; i < array.length; i++) {
				sum += array[i]; 
			} if(sum > 100) {
				return true; 
			}
			return false; 
		}
		
//		10.	Write a method that takes an array of double and returns the average of all the elements in the array.
		public static double numsAverage(double[] array) {
			double sum = 0; 
			for (int i = 0; i < array.length; i++) {
				sum += array[i];
		} return sum/array.length;   
		}
//		11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
		public static boolean arraysAverage(double[] array1, double[] array2) {
			double average1 = numsAverage(array1); 
			double average2 = numsAverage(array2); 
			if(average1 > average2) {
				return true; 
			} return false; 
		} 
//		12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			if(isHotOutside == true && moneyInPocket > 10.50) {
				return true;
			} 
			return false;  
		}
//		13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
//		Created a method to check if a person will be given a rental car fee if they are under 25 years old. 
//		1st make sure they are at least 21, if not return message saying they are not old enough to rent a car.
//		2nd if they are at least 21 but under 25 then they will get a rental car fee. 
//		3rd if they are both above 21 and 25 then return message saying there are no additional fees with their rental car. 
	
		public static String carRentalFee(int age) {
			String message1 = "Sorry, you are not old enough to rent a car."; 
			String message2 = "Thank you for your reservation. Unfortunately, an additional charge of $20 will be added to your bill for being a young renter.";
			String message3 = "Thank you for your reservation. There are no additional fees for your rental car.";
			if (age < 21) {
				return message1; 
			} else if(age >= 21 && age < 25) {
				return message2; 
			} else {
				return message3; 
			}
		}


}
