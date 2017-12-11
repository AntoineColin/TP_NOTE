
public class  Comparator<t extends Personne>{
	
	
	public int compare(t p1, t p2) {
		return p1.obtenirContrats().size() - p2.obtenirContrats().size();
	}
}
