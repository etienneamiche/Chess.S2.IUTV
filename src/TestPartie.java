
public class TestPartie {

	
	
	
	
	// CREATION d'un echiquier test et remplissage avec des Pions
	
	
	
	public static void main(String[] args)
	{
		Echiquier e = new Echiquier();
		
		Affichage p = new Affichage();
		 p.afficher(e);
		 
		e.remplir();
		p.afficher("REMPLISSAGE");
		p.afficher(e);
		
		
		
	}
		
		
}
