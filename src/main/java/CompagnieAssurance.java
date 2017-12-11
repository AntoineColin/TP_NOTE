
import java.util.ArrayList;
import java.util.List;

public class CompagnieAssurance {
	
	private String nom;
	private List<Personne> clients = new ArrayList<Personne>();
	private List<Personne> prospects = new ArrayList<Personne>();
	
	
	public int obtenirNombreDeClients() {
		int nb = 0;
		nb += clients.size();
		return nb;
	}
	
	public int obtenirNombreDeProspects() {
		int nb = 0;
		nb += prospects.size();
		return nb;
	}
	
	public int obtenirNombreDeContrats() {
		int nb = 0;
		for(Personne p : clients) {
			nb += p.obtenirContrats().size();
		}
		return nb;
	}

	public void ajouterClient(Personne personne) {
		clients.add(personne);
		
	}

	public void ajouterProspects(Personne personne) {
		prospects.add(personne);
		
	}
	
	@SuppressWarnings("unchecked")
	public Personne obtenirPlusGrosClient() {
		Personne whale = null;
		int max = 0;
		if(!clients.isEmpty()) {
			whale = clients.get(0);
			max = clients.get(0).obtenirContrats().size();
			if(clients.size()>1)
			clients.sort((java.util.Comparator<? super Personne>) new Comparator<Personne>());
		}
		return whale;
	}
}
