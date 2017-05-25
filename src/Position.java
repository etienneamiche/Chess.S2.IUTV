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
	
	public boolean equals(Object o)
	
	{
		Position c = (Position) o;
	
			return (this.ligne==c.ligne && this.colonne==c.colonne );

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
	
	public Case getCase(Echiquier e)
	{
		return e.getCase(this.ligne,this.colonne);
	}
	
	public String toString()
	{
		return "" + this.ligne + this.colonne;
	}
}
