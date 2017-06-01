import java.io.*;

public class Echiquier{
	
	private Case[][] plateau;
	
	public Echiquier()
	{
		this.plateau = new Case[8][8];
		for(int i=0 ; i<8 ; i++)
			for(int j=0; j<8; j++)
			plateau[i][j] = new Case();
	}
	
	public Case[][] getPlateau()
	{
		return this.plateau;
	}
	
	public Case getCase(int ligne,int colonne)
	{
		if(ligne<8 && ligne>=0 && colonne<8 && colonne>=0 )
		{
		return plateau[ligne][colonne];
		}
		return null;
	}
	
	
	
	public Piece getPiece(Position position)
	{
		return this.plateau[position.getLigne()][position.getColonne()].getPiece();
	}
		
	public void setPiece(Piece piece,Position position)
	{
		this.plateau[position.getLigne()][position.getColonne()].setPiece(piece);
	}
	
	public boolean conditionValide(Position depart,Position arrive)
	{
		if(depart.getCase(this) != null && arrive.getCase(this) != null)
				if(
				(depart.getLigne() >= 0 && depart.getLigne() <= 7)
				&&
				(depart.getColonne() >= 0 && depart.getColonne() <= 7)
				&&
				(arrive.getLigne() >= 0 && arrive.getLigne() <= 7)
				&&
				(arrive.getColonne() >= 0 && arrive.getColonne() <= 7)
				)
					if(depart.getCase(this).getPiece().deplacementValide(depart, this).contains(arrive))
						return true;
		
		return false;
	}
	
	public void Deplacer()
	{
		//VERIFIER QUE LE DEPLACEMENT EST VALIDE
		/* comparer le Depacement a l'ArrayList de la piece Selectionée
		 */
		
		Position posInit;
		Position posFinal;
		Saisie  s;
		s = new Saisie();
		do{
		
		 posInit = s.saisiePositionInit();
		 posFinal = s.saisiePositionFinale();

		}while(!conditionValide(posInit,posFinal) );
		
	
		this.setPiece(getPiece(posInit),posFinal);
		this.setPiece(null, posInit);
		//this.getPiece(posFinal).estEchec(posFinal, this);
		
	}
	
	public void sauvegarder(File f){
		try
		{
			FileWriter fw = new FileWriter(f);
			for(int x = 0 ; x < 8;x++)
			{
				for(int y = 0 ; y < 8;y++)
				{
					fw.write(this.getCase(x, y).toString());
					fw.write("\n");
				}
			}
			fw.close();
			
		}
		catch (IOException e)
		{
			System.out.println ("Erreur lors de la lecture : " + e.getMessage());
		}
	}
	
	public void remplir() {
		
		plateau[7][0].setPiece(new Tour("blanc"));
		plateau[7][1].setPiece(new Cavalier("blanc"));
		plateau[7][2].setPiece(new Fou("blanc"));
		plateau[7][3].setPiece(new Roi("blanc"));
		plateau[7][4].setPiece(new Dame("blanc"));
		plateau[7][5].setPiece(new Fou("blanc"));
		plateau[7][6].setPiece(new Cavalier("blanc"));
		plateau[7][7].setPiece(new Tour("blanc"));
		
		plateau[0][0].setPiece(new Tour("noir"));
		plateau[0][1].setPiece(new Cavalier("noir"));
		plateau[0][2].setPiece(new Fou("noir"));
		plateau[0][3].setPiece(new Roi("noir"));
		plateau[0][4].setPiece(new Dame("noir"));
		plateau[0][5].setPiece(new Fou("noir"));
		plateau[0][6].setPiece(new Cavalier("noir"));
		plateau[0][7].setPiece(new Tour("noir"));
		for(int i = 0 ; i < 8;i++)
		{	
			plateau[1][i].setPiece(new Pion("noir"));
			plateau[6][i].setPiece(new Pion("blanc"));
		}
	}
}
