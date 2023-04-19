package Figure;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Carre carre = new Carre(4,2,2);
		
		System.out.println("Coté : "+carre.getCote());
		System.out.println("Périmètre : "+carre.getPerimetre());
		
		DateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(format.format(date));
		

	}

}

