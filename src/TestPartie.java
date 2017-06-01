import java.io.*;

public class TestPartie {

	
	
	
	
	
	public static void main(String[] args)
	{
		Echiquier e = new Echiquier();
		Affichage a = new Affichage();
		File f = new File("../save.txt");
		int i = 0;
		e.remplir();
		e.charger(f);
		while(i<7)
		{
				a.afficher(e);
				e.Deplacer();
				i++;
				e.sauvegarder(f);
		}

	}
}
