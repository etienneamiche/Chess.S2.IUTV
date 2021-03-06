
public class Case {
	
	private Piece piece;

	public Case()
	{
		this.piece = null;
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

	public boolean occupe()
	{
		return (this.piece != null);
		
		
	}
	
	public boolean occupe(String couleur)
	{
		
		if (this.piece == null) return false;
		return(this.piece.getCouleur() == couleur);
		
		
	}
	
	public String toString()
	{
		if (this.piece==null) return "_";
		return this.getPiece().toString();
	}
}

