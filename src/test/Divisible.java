package test;

public class Divisible {

	public static void main(String[] args) {

		for (int i = 1; i <= 30; i++) {
			if (i % 5 == 0)
				System.out.println("ding: " + i);
		}

		for (int i = 1; i <= 30; i++) {
			if (i % 15 == 0)
				System.out.println("dong: " + i);

		}

	}

}
//Write a java code to loop through form 1 to 30. Print ding every 
//if you find a number is divisible by 5 or print dong if every number is divisible by 15.
