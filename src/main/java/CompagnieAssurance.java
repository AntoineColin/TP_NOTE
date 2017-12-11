
import java.util.List;

public class CompagnieAssurance {
	
	private String nom;
	private List<Personne> clients;
	private List<Personne> prospects;
	
	
	public int obtenirNombreDeClients() {
		int nb = 0;
		for(Personne p : clients) {
			nb++;
		}
		return nb;
	}
	
	public int obtenirNombreDeProspects() {
		int nb = 0;
		for(Personne p : prospects) {
			nb++;
		}
		return nb;
	}
	
	public int obtenirNombreDeContrats() {
		int nb = 0;
		for(Personne p : clients) {
			for(Contrat c: p.obtenirContrats()) {
				nb++;
			}
		}
		return nb;
	}

	public void ajouterClient(Personne personne) {
		clients.add(personne);
		
	}

	public void ajouterProspects(Personne personne) {
		prospects.add(personne);
		
	}
}
