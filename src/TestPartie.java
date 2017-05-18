import java.util.Scanner;

public class TestPartie {

	public static void main(String[] args)
	{
		Echiquier e = new Echiquier();
		Affichage a = new Affichage();
		
		e.remplir();

		a.afficher(e);
		e.Deplacer();
		
		a.afficher(e);
		
		e.Deplacer();
		a.afficher(e);
	}
}
