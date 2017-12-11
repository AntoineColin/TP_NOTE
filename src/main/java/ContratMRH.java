import java.util.List;

public class ContratMRH extends Contrat{
	
	public ContratMRH() {
		cotisation = 100.0;
		Contrat.instances.add(this);
	}
	
	public List<String> determinerGaranties(){
		garanties.add("Incendies");
		garanties.add("Vitres");
		garanties.add("Inondation");
		garanties.add("Responsabilité Civile");
		return garanties;
	}
	
	
	public static Contrat creationContrat() {
		ContratMRH contrat = new ContratMRH();
		contrat.determinerGaranties();
		return contrat;
	}
}
