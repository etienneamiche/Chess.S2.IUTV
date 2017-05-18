import java.util.Scanner;

public class TestPartie {

	public static void main(String[] args)
	{
		Echiquier e = new Echiquier();
		
		Affichage p = new Affichage();
		e.remplir();

		p.afficher(e);
		e.Deplacer();
		
		p.afficher(e);
		
		e.Deplacer();
		p.afficher(e);	
		
		
		
	}
		
		
}
