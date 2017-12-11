
public class ClassePrincipale {
	
	
	
	public static void main(String[] args) {
		CompagnieAssurance groupama = new CompagnieAssurance();
		Personne bobby = new Personne("Perret","Bobby","8 juin 2002");
		Personne billy = new Personne("Perret","Billy","8 juin 2002");
		Personne rony = new Personne("Piedbeau","Rony","11 mars 1990");
		Personne tina = new Personne("Perret","Tina","6 septembre 1975");
		bobby.creerContrat(groupama, "Prevoyance");
		tina.creerContrat(groupama, "Prevoyance");
		tina.creerContrat(groupama, "Auto");
		
		bobby.toString();
		billy.toString();
		rony.toString();
		tina.toString();
	}
}
