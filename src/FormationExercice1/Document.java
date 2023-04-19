package FormationExercice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Document {
	
	private int code;
	private String date;
	private double montant;
	private Client client;
	private List<DetailDocument> listeDetail = new ArrayList<>();
	//private boolean statutListeDetail = false;
	
	
	public Document() {
	}
	
	public String getKey() throws Exception {
		throw new Exception("La methode getKey doit être surcharger");
	}

	public Document(int code, String date, double montant, Client client) {
		this.code = code;
		this.date = date;
		this.montant = montant;
		this.client = client;
		
	}

	
	public List<DetailDocument> getListeDetail() {
		return Collections.unmodifiableList(getListeDetail());
	}
	
	public void jouterLigneDetail(DetailDocument ligneDetail) throws Exception{
		if(ligneDetail == null)
			throw new Exception("La ligne détail est vide");
		listeDetail.add(ligneDetail);
	}

	public double calculMontant() {
		double total = 0;
		if(listeDetail != null) {
			System.out.println("-----------------------------------");
			System.out.println("|code | Quantité | Produit | Libelle | Prix |");
			System.out.println("-----------------------------------");
			for(DetailDocument detail : listeDetail) {
				System.out.println(detail.toString() );
				total = total + detail.getQuantite()*detail.getPrix();
			}
			System.out.println("------------------------------------");
			listeDetail = new ArrayList<>();
			this.montant = total;
		}
		return this.montant;
	}

	

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
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

	@Override
	public String toString() {
		//this.statutListeDetail = true;
		try {
			return  getKey()+
					"\nNom du client: "+this.client.getNom()+" "+this.client.getPrenom()+""
					+"Date : " + this.date+""
					+ "\nMontant total "+calculMontant()+"€";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
