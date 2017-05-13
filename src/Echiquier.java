
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
		return plateau[colonne][ligne];
	}
	
	
	public void remplir() {
		
		for(int i = 0 ; i < 8;i++)
		{
			
			plateau[1][i].setPiece(new Pion("noir"));
			plateau[6][i].setPiece(new Pion("blanc"));
		}
		
	}
	
	
	
	

	

}
