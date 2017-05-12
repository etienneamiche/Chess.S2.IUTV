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
		return colonne;
	}

	public void setColonne(int colonne) {
		this.colonne = colonne;
	}

	public int getLigne() {
		return ligne;
	}

	public void setLigne(int ligne) {
		this.ligne = ligne;
	}
	
}
