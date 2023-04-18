package FormationExercice1;

import FormationExercice1.gestion.GestionClient;
import FormationExercice1.gestion.GestionFacture;
import FormationExercice1.gestion.GestionProduit;

public class Main {

	public static void main(String[] args) {
		
		//Initialisation de Client
		
		GestionClient gestionClient = new GestionClient();
		gestionClient.initialisationClient();
		gestionClient.ajoutClient(new Client(4,"Max","Louis","Nantes", "0902339232","mlouis@gmail.com"));
		gestionClient.supprimerClient(gestionClient.retrouverClient(1));
		gestionClient.afficherClient(1);
		gestionClient.afficherClient(gestionClient.rechercherClientsParNom("M"));
		System.out.println();
		
		//Initialisation de Produit
		GestionProduit gestionProduit = new GestionProduit();
		gestionProduit.initialisationProduit();
		gestionProduit.afficherProduit(1);
		gestionProduit.afficherProduit(gestionProduit.rechercherProduitParPrix(30));
		System.out.println(gestionProduit.getTaille());
		
		GestionFacture gestionFacture = new GestionFacture();
		gestionFacture.ajouterFacture("1", gestionClient.retrouverClient(1));
		gestionFacture.afficherFacture(gestionFacture.retrouverFacture("Facture-1"));
		//gestionFacture.ajouterLigneProduit(gestionFacture.retrouverFacture("Facture-1"), new DetailDocument(1, 12, gestionProduit.retrouverProduit(1)));
//		gestionFacture.ajouterLigneProduit("1", new DetailDocument(2, 15, gestionProduit.retrouverProduit(2)));
//		gestionFacture.ajouterLigneProduit("1", new DetailDocument(3, 20, gestionProduit.retrouverProduit(3)));
//		gestionFacture.ajouterLigneProduit("1", new DetailDocument(4, 122, gestionProduit.retrouverProduit(5)));
//		gestionFacture.ajouterLigneProduit("1", new DetailDocument(5, 10, gestionProduit.retrouverProduit(6)));
//		//gestionFacture.afficherFacture("1");
		
		/*GestionDocument document = new GestionDocument();
		document.getDevis().setClient(gestionClient.retrouverClient(1));
		document.ajouterDetailDocument(new DetailDocument(1, 12, gestionProduit.retrouverProduit(1)));
		document.ajouterDetailDocument(new DetailDocument(2, 5, gestionProduit.retrouverProduit(2)));
		document.ajouterDetailDocument(new DetailDocument(3, 4, gestionProduit.retrouverProduit(4)));
		document.ajouterDetailDocument(new DetailDocument(4, 9, gestionProduit.retrouverProduit(5)));
		document.ajouterDetailDocument(new DetailDocument(5, 20, gestionProduit.retrouverProduit(6)));
		document.afficherDocument("44");*/
		
		
		/*
		GestionDocument devis1 = new GestionDocument();
		devis1.getDocument().setClient(gestionClient.retrouverClient(1));
		devis1.ajouterDetailDocument(new DetailDocument(1, 12, gestionProduit.retrouverProduit(1)));
		devis1.ajouterDetailDocument(new DetailDocument(2, 5, gestionProduit.retrouverProduit(2)));
		devis1.ajouterDetailDocument(new DetailDocument(3, 4, gestionProduit.retrouverProduit(4)));
		devis1.ajouterDetailDocument(new DetailDocument(4, 9, gestionProduit.retrouverProduit(5)));
		devis1.ajouterDetailDocument(new DetailDocument(5, 20, gestionProduit.retrouverProduit(6)));
		System.out.println(devis1.toString());
		
		*Devis devis1 = new Devis();
		devis1.setClient(mapClient.get(1));
		devis1.getListe().add(new DetailDocument(1, 12, mapProduit.get(1) ));
		devis1.getListe().add(new DetailDocument(2, 5, mapProduit.get(2)));
		devis1.getListe().add(new DetailDocument(3, 4, mapProduit.get(4)));
		devis1.getListe().add(new DetailDocument(4, 9, mapProduit.get(5)));
		devis1.getListe().add(new DetailDocument(5, 20, mapProduit.get(6)));
		
		System.out.println("Nom du client: "+devis1.getClient().getNom()+" "+devis1.getClient().getPrenom());
		System.out.println("Total devis1 "+devis1.calculMontant()+"€");
		System.out.println(devis1.toString()+"€");
		
		Commande commande1 = new Commande();
		commande1.setClient(mapClient.get(1));
		commande1.getListe().add(new DetailDocument(1, 11, mapProduit.get(3)));
		commande1.getListe().add(new DetailDocument(2, 10, mapProduit.get(5)));
		commande1.getListe().add(new DetailDocument(3, 20, mapProduit.get(6)));
		
		System.out.println("Nom et prénom: "+devis1.getClient().getNom()+" "+devis1.getClient().getPrenom());
		System.out.println("Total commande1 "+commande1.calculMontant()+"€");
		*/

	}

}
