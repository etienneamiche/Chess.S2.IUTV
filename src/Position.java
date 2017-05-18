public class Position {
	
	private int ligne;
	private int colonne;
	
	public Position()
	{
	}
	
	public Position(int ligne,int colonne)
	{
		this.setLigne(ligne);
		this.setColonne(colonne);
	}

	public int getColonne() {
		return this.colonne;
	}

	public void setColonne(int colonne) {
		this.colonne = colonne;
	}

	public int getLigne() {
		return this.ligne;
	}

	public void setLigne(int ligne) {
		this.ligne = ligne;
	}
	
	public Piece getPiece(Position position,Echiquier e)
	{
		return e.getPiece(position);
	}
	
	public String toString()
	{
		return "" + this.ligne + this.colonne;
	}
}
