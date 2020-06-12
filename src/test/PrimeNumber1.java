package test;

public class PrimeNumber1 {

	public static void main(String[] args) {
		
		//Find Prime Number
		//Prime Number is a number which divisible by 1 and number itself
	
		primeNumberFinder(7);

		}

		public static void primeNumberFinder(int num) {

			int num1 = num;

			int count = 0;
			for (int i = 2; i <= num1 - 1; i++) {
				if (num1 % i == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(num1 + " : is Prime NNumber");
			} else {
				System.out.println(num1 + " : is not Prime Number");
			}

	}

}
