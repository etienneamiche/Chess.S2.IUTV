
public class TestPartie {

	
	
	
	
	// CREATION d'un echiquier test et remplissage avec des Pions

	
	
	public static void main(String[] args)
	{
		Echiquier e = new Echiquier();
		
		Affichage p = new Affichage();
		
		//afficher echiquier vide;
		
		p.afficher(e);
		 
		e.remplir();
		
		p.afficher("REMPLISSAGE");
		
		
		Position posInit = new Position(1,3);
		Position posFinal = new Position(3,3);
		Deplacement depl = new Deplacement(posInit,posFinal);
		//afficher echiqier rempli
		p.afficher(e);
		
		// deplacer une piece de la case[1][3] a la case[3][3]
		
		e.Deplacer(depl);
		
		
		p.afficher(e);
		
		
		
	}
		
		
}
