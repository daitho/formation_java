package FormationExercice1;

import java.util.Date;

public abstract class Document {
	
	private String code;
	private Date date;
	private double montant;
	private Client client;
	
	public Document() {
		super();
	}

	public Document(String code, Date date, double montant, Client client) {
		super();
		this.code = code;
		this.date = date;
		this.montant = montant;
		this.client = client;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	
	
	

}
