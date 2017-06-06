import java.io.*;

public class Echiquier{
	
	private Case[][] plateau;
	private File f;
	private Affichage a = new Affichage();
	
	public Echiquier()
	{
		this.plateau = new Case[8][8];
		for(int i=0 ; i<8 ; i++)
			for(int j=0; j<8; j++)
			plateau[i][j] = new Case();
		this.f = new File("../save.txt");
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
	
	public int deplacer(String couleur, Boolean tourBlanc)
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
			if (posInit.getColonne() == -1 && posInit.getLigne() == -1)
			{
				this.sauvegarder(f,tourBlanc);
				a.afficher("=== Partie Sauvegardée ===");
				return -1;
			}
			
			if (posInit.getColonne() == -2 && posInit.getLigne() == -2)
			{
				int tour = this.charger(f);
				a.afficher("\n=== Partie Chargée ===\n");
				return (tour - 3);							//Retourne -2 si tour des blancs, -3 si tours des noirs
			}
				
			posFinal = s.saisiePositionFinale();

		}while(!conditionValide(posInit,posFinal) );

		if ((getPiece(posInit).getCouleur()) != couleur) return 0;
		
		this.setPiece(getPiece(posInit),posFinal);
		this.setPiece(null, posInit);
		if (echecRoi() == couleur)
		{
			a.afficher("Echec au roi " + couleur);
			this.setPiece(getPiece(posFinal),posInit);
			this.setPiece(null, posFinal);
			return 0;
		}
		
		return 1;
		
	}
	
	public String echecRoi(){
		for(int x = 0 ; x < 8;x++)
		{
			for(int y = 0 ; y < 8;y++)
			{
				if((this.getCase(x, y).occupe()) && (this.getCase(x, y).getPiece().getNom() == "roi"))
				{
					if (this.getCase(x, y).getPiece().estEchec(new Position(x,y),this))
					{
						String couleur = this.getCase(x, y).getPiece().getCouleur();
						return couleur;
					}
				}
			}
		}
		return null;
	}
	
	public boolean echecEtMat(){
		if (echecRoi() == "blanc" || echecRoi() == "noir"){
			if (echecRoi() == "blanc"){
				for(int x = 0 ; x < 8;x++)
				{
					for(int y = 0 ; y < 8;y++)
					{
						if ((this.getCase(x, y).occupe()) && (this.getCase(x, y).getPiece().getNom() == "roi") && (this.getCase(x, y).getPiece().getCouleur() == "blanc")) {
							Piece roi = this.getCase(x, y).getPiece();
							Position p = new Position(x,y);
							int compteur = 0;
							for (int i = 0; i < roi.deplacementValide(p, this).size();i++)
							{
								Position posFinal = roi.deplacementValide(p, this).get(i);
								Piece tmp = null;
								if (posFinal.getCase(this).getPiece() != null) tmp = posFinal.getCase(this).getPiece();
								this.setPiece(getPiece(p),posFinal);
								this.setPiece(null, p);
								if (echecRoi() == "blanc")
								{
									this.setPiece(getPiece(posFinal),p);
									this.setPiece(null, posFinal);
									compteur++;
								}
								else
								{
									this.setPiece(getPiece(posFinal),p);
									this.setPiece(null, posFinal);
								}
								if (tmp != null){
									this.setPiece(tmp, posFinal);
								}
							}
							if (compteur == roi.deplacementValide(p, this).size()){
								a.afficher("Echecs et Mat ! Noir a gagné !");
								return true;
							}
						}
							
					}
				}
			}
			if (echecRoi() == "noir"){
				for(int x = 0 ; x < 8;x++)
				{
					for(int y = 0 ; y < 8;y++)
					{
						if ((this.getCase(x, y).occupe()) && (this.getCase(x, y).getPiece().getNom() == "roi") && (this.getCase(x, y).getPiece().getCouleur() == "noir")) {
							Piece roi = this.getCase(x, y).getPiece();
							Position p = new Position(x,y);
							int compteur = 0;
							for (int i = 0; i < roi.deplacementValide(p, this).size();i++)
							{
								Position posFinal = roi.deplacementValide(p, this).get(i);
								Piece tmp = null;
								if (posFinal.getCase(this).getPiece() != null) tmp = posFinal.getCase(this).getPiece();
								this.setPiece(getPiece(p),posFinal);
								this.setPiece(null, p);
								if (echecRoi() == "noir")
								{
									this.setPiece(getPiece(posFinal),p);
									this.setPiece(null, posFinal);
									compteur++;
								}
								else
								{
									this.setPiece(getPiece(posFinal),p);
									this.setPiece(null, posFinal);
								}
								if (tmp != null){
									this.setPiece(tmp, posFinal);
								}
							}
							if (compteur == roi.deplacementValide(p, this).size()){
								a.afficher("Echecs et Mat ! Blanc a gagné !");
								return true;
							}
						}
							
					}
				}
			}
		}
		return false;
	}
	
	public void sauvegarder(File f, Boolean tourBlanc){
		try
		{
			FileWriter fw = new FileWriter(f);
			String s = "";
			for(int x = 0 ; x < 8;x++)
			{
				for(int y = 0 ; y < 8;y++)
				{
					s += this.getCase(x, y).toString();
				}
			}
			if (tourBlanc) s += "1";
			else s += "0";
			fw.write(s);
			fw.close();
			
		}
		catch (IOException e)
		{
			a.afficher("Erreur lors de la lecture : " + e.getMessage());
		}
	}
	
	public int charger(File f){
		try
		{
		    FileReader fr = new FileReader (f);
		    int c = fr.read();
		    this.vider();
		    for(int x = 0 ; x < 8;x++)
			{
				for(int y = 0 ; y < 8;y++)
				{
					if((char) c == '\u2659') plateau[x][y].setPiece(new Pion("blanc")); 				
					else if((char) c == '\u265F') plateau[x][y].setPiece(new Pion("noir")); 	
					
					else if((char) c == '\u2656') plateau[x][y].setPiece(new Tour("blanc"));		
					else if((char) c == '\u265C') plateau[x][y].setPiece(new Tour("noir"));		
					
					else if((char) c == '\u2658') plateau[x][y].setPiece(new Cavalier("blanc"));		
					else if((char) c == '\u265E') plateau[x][y].setPiece(new Cavalier("noir"));
					
					else if((char) c == '\u2657') plateau[x][y].setPiece(new Fou("blanc"));			
					else if((char) c == '\u265F') plateau[x][y].setPiece(new Fou("noir"));			
					
					else if((char) c == '\u2654') plateau[x][y].setPiece(new Roi("blanc"));		
					else if((char) c == '\u265A') plateau[x][y].setPiece(new Roi("noir"));			
					
					else if((char) c == '\u2655') plateau[x][y].setPiece(new Dame("blanc"));	
					else if((char) c == '\u265B') plateau[x][y].setPiece(new Dame("noir"));	
					
					c = fr.read();
				}
			}
		    fr.close();
		    return c - 48;
		}
		catch (FileNotFoundException e)
		{
			a.afficher("Le fichier n'a pas été trouvé" + e.getMessage());
			return -1;
		}
		catch (IOException e)
		{
			a.afficher("Erreur lors de la lecture : " + e.getMessage());
			return -1;
		}
	}
	
	public void vider(){
		for(int x = 0 ; x < 8;x++)
		{
			for(int y = 0 ; y < 8;y++)
			{
				plateau[x][y].setPiece(null);
			}
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
