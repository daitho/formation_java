package Figure;

public class Carre extends FigureGeometrique{

	private long cote;
	
	
	public Carre(long cote) {
		super();
		this.cote = cote;
	}

	public long getCote() {
		return cote;
	}
	
	public long getPerimetre() {
		return 4*cote;
	}
}
