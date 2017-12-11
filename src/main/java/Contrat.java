import java.util.ArrayList;
import java.util.List;

public abstract class Contrat{
	protected String numeroContrat;
	protected boolean contratValide;
	protected List<String> garanties = new ArrayList<String>();
	protected double cotisation;
	
	protected static List<Contrat> instances = new ArrayList<Contrat>();
	
	
	
	public static Contrat creationContrat() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static Contrat Find(String numContrat) {
		Contrat trouve = null;
		for(Contrat c : instances) {
			if(c.numeroContrat == numContrat)
				trouve = c;
		}
		return trouve;
	}
	
	

	public List<String> determinerGaranties(){
		return garanties;
	}
	
	public double determinerCotisation() {

		return cotisation;
	}
}
