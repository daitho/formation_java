package FormationExercice1;

public class Facture extends Document {

	public Facture() {
		super();

	}

	public Facture(String code, String date, double montant, Client client) {
		super(code, date, montant, client);
	}
	
	public String getKey() throws Exception {
		//throw new Exception("La methode getKey doit être surcharger");
		return "Facture-"+getCode();
	}
	
	

}
