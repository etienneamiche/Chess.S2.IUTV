
public class Partie {
	private Echiquier e;
	private Affichage a;
	private boolean tourBlanc;
	
	public Partie(){
		this.e = new Echiquier();
		this.a = new Affichage();
		this.tourBlanc = true;
		e.remplir();
		a.afficher(e);
	}
	
	public void tourDeJeu(){
		int verif;
		if (tourBlanc)
		{
			do{
				a.afficher("\nAu tour des blancs :");
				verif = e.deplacer("blanc",tourBlanc);
				if (verif == -3)
				{
					tourBlanc = false;
					return;
				}
			}while (verif != 1);
			tourBlanc = false;
		}
		else
		{
			do{
				a.afficher("\nAu tour des noirs :");
				verif = e.deplacer("noir",tourBlanc);
				if (verif == -2)
				{
					tourBlanc = true;
					return;
				}
			}while (verif != 1);
			tourBlanc = true;
		}
	}
	
	public void jeu(){
		boolean partie = true;
		do{
			tourDeJeu();
			a.afficher(e);
		}while (partie);
	}	
}
