
public class Case {
	
	private Piece piece;
	
	public Case()
	{
		
	}
	
	public Case(Piece piece)
	{
		this.piece=piece;
	}

	public Piece getPiece()
	{
		return this.piece;
	}
	
	public void setPiece(Piece piece)
	{
		this.piece = piece;
	}

	public boolean occupé()
	{
		return (this.piece != null);
	}
	
	public boolean occupé(String couleur)
	{
		if (this.piece == null) return false;
		return(this.piece.getCouleur() == couleur);
	}
	
	public String toString()
	{
		if (this.piece==null) return "vide";
		return this.getPiece().toString();
	}
}

