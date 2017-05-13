
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
	
	

	
	public Piece getPiece(Position position)
	{
		return this.plateau[position.getLigne()][position.getColonne()].getPiece();
	}
	
	
	public void setPiece(Piece piece,Position position)
	{
		this.plateau[position.getLigne()][position.getColonne()].setPiece(piece);
	}
	
	
	public void Deplacer(Deplacement dep)
	{
		//VERIFIER QUE LE DEPLACEMENT EST VALIDE
		/* comparer le Depacement a l'ArrayList de la piece Selectionée
		 */
		
		this.setPiece(getPiece(dep.getPositionInitial()), dep.getPositionFinal());
		this.setPiece(null, dep.getPositionInitial());
		
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
		plateau[0][4].setPiece(new Roi("noir"));
		plateau[0][3].setPiece(new Dame("noir"));
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
