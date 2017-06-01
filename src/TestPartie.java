import java.io.*;

public class TestPartie {

	
	
	
	
	
	public static void main(String[] args)
	{
		Echiquier e = new Echiquier();
		Affichage a = new Affichage();
		File f = new File("/home/armen/eclipse-workspace/Projet Echecs/save.txt");
		int i = 0;
		e.remplir();
		
		while(i<7)
		{
				a.afficher(e);
				e.Deplacer();
				i++;
				e.sauvegarder(f);
		}

	}
}
