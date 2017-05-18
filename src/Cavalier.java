import java.util.ArrayList;

public class Cavalier extends Piece{

	public Cavalier(String couleur)
	{
		this.nom="cavalier";
		this.couleur=couleur;
	}
	
	public String toString()
	{
		if (this.couleur=="blanc") return "\u265E";
		else return "\u2658";
	}
	/*
	-Le cavalier se déplace en formant un "L",
	c'est à dire deux cases verticalement et une case horizontalement (ou l'inverse).
	
	-Il a le droit de sauter par-dessus toutes les pièces, quelle que soit leur couleur, pour arriver sur une case vide.
	
	-Si la case d'arrivée est occupée par une pièce adverse, il prend sa place en éliminant cette pièce.
	
	-Si la case d'arrivée est occupée par une pièce de son camp, il ne peut en aucun cas s'y rendre.
	*/
	public ArrayList<Position> deplacementValide(Position depart)
	{
		ArrayList<Position> deplacementsPossibles = new ArrayList<Position>();
		
		
		return deplacementsPossibles;
	}

}
