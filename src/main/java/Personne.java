import java.util.ArrayList;
import java.util.List;


public class Personne {
	
	private boolean estUnClient;
	private String nom;
	private String prenom;
	private String dateDeNaissance;
	private List<Personne> famille;
	private List<Contrat> contrats = new ArrayList<Contrat>();

	public Personne(String nom,String prenom,String naissance) {
		estUnClient = false;
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = naissance;
	}

	public boolean estClient() {
		return estUnClient;
	}
	public void setClient(boolean estUnClient) {
		this.estUnClient = estUnClient;
	}
	
	public String obtenirNomComplet() {
		String nomComplet = nom;
		
		return nomComplet;
	}
	
	public String obtenirDateDeNaissance() {
		return dateDeNaissance;
	}
	
	public Contrat creerContrat(CompagnieAssurance ca, String type) {
		
		Contrat c = null;
		if(type == "Auto") {
			c = ContratAuto.creationContrat();
		}else if(type == "MRH") {
			c= ContratMRH.creationContrat();
		}else if(type == "Prevoyance") {
			c= ContratPrevoyance.creationContrat();
		}else {
			ca.ajouterProspects(this);
			return null;
		}
		estUnClient = true;
		ca.ajouterClient(this);
		contrats.add(c);
		return c;
	}
	
	public void resilierContrat(Contrat actuel) {
		contrats.remove(actuel);
	}
	
	public void resilierContrat(String nomContrat) {
		contrats.remove(Contrat.Find(nomContrat));
	}
	
	public List<Contrat> obtenirContrats(){
		return contrats;
	}
	
	@SuppressWarnings("null")
	public List<Contrat> obtenirContratsAuto(){
		List<Contrat> contratsAuto = null;
		for(Contrat c : contrats) {
			if(c instanceof ContratAuto)
				contratsAuto.add(c);
		}
		return contratsAuto;
	}
	
	@SuppressWarnings("null")
	public List<Contrat> obtenirContratsMRH(){
		List<Contrat> contratsMRH = null;
		for(Contrat c : contrats) {
			if(c instanceof ContratMRH)
				contratsMRH.add(c);
		}
		return contratsMRH;
	}
	
	public String toString() {
		String desc = "Nom : "+nom+", Prénom : "+prenom+", Né le : "+dateDeNaissance;
		if(!contrats.isEmpty()) {
			for(Contrat c:contrats) {
				desc = desc+"\nContrat num "+c.numeroContrat;
			}
		}
		return desc;
	}
}
