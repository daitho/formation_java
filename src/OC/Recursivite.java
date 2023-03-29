package OC;

// Récursivité: action qui s'initialise à l'intérieur d'elle-même.
// Les méthodes récursives servent à passer des structures en couches.
public class Recursivite {
	
	public static void main(String[] args) {
		
		System.out.println(RecursionInJava.factorial(5));
		

	}

}

//définissez des classes
class RecursionInJava {
public static int factorial(int n) {
	 if (n == 1) return 1;
   else return n * factorial (n-1);
}
}