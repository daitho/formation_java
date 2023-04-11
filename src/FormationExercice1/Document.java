package FormationExercice1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Document {
	
	private String code;
	private Date date;
	private double montant;
	private Client client;
	private List<DetailDocument> liste;
	
	
	public Document() {
	}

	public Document(String code, Date date, double montant, Client client) {
		this.code = code;
		this.date = date;
		this.montant = montant;
		this.client = client;
		
	}

	
	public List<DetailDocument> getListe() {
		if(liste == null) {
			liste = new ArrayList<>();
		}
		return liste;
	}

	public double calculMontant() {
		double total = 0;
		if(liste != null) {
			System.out.println("-----------------------------------");
			System.out.println("|code | Quantité | Produit | Prix |");
			System.out.println("-----------------------------------");
			for(DetailDocument detail : liste) {
				System.out.println("| "+detail.getidDetailDocument() +" | "+ detail.getQuantite()+" | "+ detail.getProduit().getCodeProduit()+" | "+detail.getPrix()+" | ");
				total = total + detail.getQuantite()*detail.getPrix();
			}
			System.out.println("------------------------------------");
			liste = new ArrayList<>();
		}
		return total;
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
