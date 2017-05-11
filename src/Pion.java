import java.util.ArrayList;

public class Pion extends Piece{
	
	public Pion(String couleur)
	{
		super("pion",couleur);
		
	}
	
	public ArrayList<Position> deplacementValide(Position depart)
	{
		ArrayList<Position> deplacementsPossibles = new ArrayList<Position>();
		
		deplacementsPossibles.add(depart);
		return deplacementsPossibles;
	}

}
