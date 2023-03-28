package ecommerce;

public class Main {

	public static void main(String[] args) {
		int loopLimit = 101;
		int iterations = 0;
		for (int i=5;i< loopLimit;i++) {
		    iterations += 1;
		}
		System.out.println(iterations);
		int numberOfCups = 0;
		do {
		    System.out.println("I'm feeling sleepy");
		    numberOfCups += 1;
		    System.out.println("I drunk " + numberOfCups + " cups of coffee");
		    } while (numberOfCups < 10);
		System.out.println("I'm feeling awake now!");

	}

}
