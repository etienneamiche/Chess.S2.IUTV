
public class Echiquier {
	
	private Case[][] plateau;
	
	public Echiquier()
	{
		this.plateau = new Case[8][8];
		for(int i=0 ; i<8 ; i++)
			for(int j=0; j<8; j++)
			plateau[i][j] = new Case();
	}
	
	public Case getCase(int ligne,int colonne)
	{
		return plateau[colonne][ligne];
	}
	
	
	public void remplir() {
		
		for(int i = 0 ; i < 8;i++)
		{
			
			plateau[0][i].setPiece(new Pion("noir"));
		}
		
	}
	
	
	
	
	
	// CREATION d'un echiquier test et remplissage avec des Pions
	
	public static void main(String[] args)
	{
		Echiquier e = new Echiquier();
		
		for(int i = 0 ; i < 8;i++)
		{
			System.out.print(e.plateau[0][i].toString() + "  ");
		}
		
		e.remplir();
		
		System.out.print('\n'+"REMPLISSAGE" +'\n');
		
		for(int i = 0 ; i < 8;i++)
		{
			System.out.print(e.plateau[0][i].toString() + "  " );
		}
		
	}
}
