import java.util.List;

public class ContratAuto extends Contrat{
	
	public ContratAuto() {
		cotisation = 150.0;
		Contrat.instances.add(this);
	}
	
	public List<String> determinerGaranties(){
		System.out.println("Souhaitez vous la garantie Accident? Y/N");
		//demande de sélection à faire
		garanties.add("Accidents");
		garanties.add("Bris de glace");
		garanties.add("Responsabilité civile");
		return garanties;
	}
	
	
	public static Contrat creationContrat() {
		ContratAuto contrat = new ContratAuto();
		contrat.determinerGaranties();
		return contrat;
	}
	
}
