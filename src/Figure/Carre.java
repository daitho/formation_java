package Figure;

public class Carre extends FigureGeometrique{

	private long cote;
	
	
	Carre(long cote, int x, int y){
	     //Appel du constructeur de la classe mère FigureGeometrique
	     super(x, y);
	     this.cote = cote;
	  }

	public long getCote() {
		return cote;
	}
	
	public long getPerimetre() {
		return 4*cote;
	}
	
	public long getAire() {
		return cote*cote;
	}
}
