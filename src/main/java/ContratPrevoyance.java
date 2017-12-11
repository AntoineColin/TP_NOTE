import java.util.List;

public class ContratPrevoyance extends Contrat{
	
	public ContratPrevoyance() {
		cotisation = 75;
		
	}
	
	public List<String> determinerGaranties(){
		garanties.add("Accidents de la vie");
		garanties.add("Maladie");
		garanties.add("Mutuelle");
		return garanties;
	}
	
	public Contrat creationContrat() {
		ContratPrevoyance contrat = new ContratPrevoyance();
		contrat.determinerGaranties();
		return contrat;	
	}
}
