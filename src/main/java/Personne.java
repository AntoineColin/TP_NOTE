import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Personne {
	
	private boolean estUnClient;
	private String nom;
	private String prenom;
	private Date dateDeNaissance;
	private ArrayList<Personne> famille;
	private ArrayList<Contrat> contrats;
	
	
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
		//TODO
	}
	
	public void resilierContrat(String nomContrat) {
		//TODO
	}
	
	public List<Contrat> obtenirContrats(){
		ArrayList<Contrat> contrats;
		//TODO
		return contrats;
	}
	
	public List<Contrat> obtenirContratsAuto(){
		ArrayList<Contrat> contrats;
		//TODO
	}
	
	public List<Contrat> obtenirContratsMRH(){
		ArrayList<Contrat> contrats;
		//TODO
	}
	
	public String toString() {
		String desc;
		//TODO
		return desc;
	}
}
