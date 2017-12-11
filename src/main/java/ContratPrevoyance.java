import java.util.List;

public class ContratPrevoyance extends Contrat{
	
	public ContratPrevoyance() {
		cotisation = 75;
		Contrat.instances.add(this);
	}
	
	public List<String> determinerGaranties(){
		//demande de sélection à faire
		garanties.add("Accidents de la vie");
		garanties.add("Maladie");
		garanties.add("Mutuelle");
		return garanties;
	}
	
	public static Contrat creationContrat() {
		ContratPrevoyance contrat = new ContratPrevoyance();
		contrat.determinerGaranties();
		return contrat;	
	}
}
