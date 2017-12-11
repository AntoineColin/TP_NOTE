import java.util.Date;
import java.util.List;


public class Personne {
	
	private boolean estUnClient;
	private String nom;
	private String prenom;
	private Date dateDeNaissance;
	private List<Personne> famille;
	private List<Contrat> contrats;

	
	
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
	
	public Date obtenirDateDeNaissance() {
		return dateDeNaissance;
	}
	
	public Contrat creerContrat() {
		Contrat contrat = Contrat.creationContrat();
		return contrat;
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
		for(Contrat c:contrats) {
			desc = desc+"\nContrat num "+c.numeroContrat;
		}
		return desc;
	}
}
