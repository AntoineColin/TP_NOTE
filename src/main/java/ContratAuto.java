import java.util.List;

public class ContratAuto extends Contrat{
	
	public ContratAuto() {
		cotisation = 150.0;
		
	}
	
	public List<String> determinerGaranties(){
		System.out.println("Souhaitez vous la garantie Accident? Y/N");
		garanties.add("Accidents");
		garanties.add("Bris de glace");
		garanties.add("Responsabilit� civile");
		return garanties;
	}
	
	
	public Contrat creationContrat() {
		ContratAuto contrat = new ContratAuto();
		contrat.determinerGaranties();
		return contrat;
	}
	
}