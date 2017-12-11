import java.util.List;

public abstract class Contrat{
	protected String numeroContrat;
	protected boolean contratValide;
	protected List<String> garanties;
	protected double cotisation;
	
	
	
	public abstract Contrat creationContrat();
	
	public List<String> determinerGaranties(){
		return garanties;
	}
	
	public double determinerCotisation() {

		return cotisation;
	}
}
