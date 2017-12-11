import java.util.List;

public class ContratMRH extends Contrat{
	
	public ContratMRH() {
		cotisation = 100.0;
		
	}
	
	public List<String> determinerGaranties(){
		garanties.add("Incendies");
		garanties.add("Vitres");
		garanties.add("Inondation");
		garanties.add("Responsabilité Civile");
		return garanties;
	}
	
	
	public Contrat creationContrat() {
		ContratMRH contrat = new ContratMRH();
		contrat.determinerGaranties();
		return contrat;
	}
}
