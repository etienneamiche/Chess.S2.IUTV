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
	public ArrayList<Position> deplacementValide(Position depart,Echiquier e)
	{
		ArrayList<Position> deplacementsPossibles = new ArrayList<Position>();
		if (e.getCase(depart.getLigne()+2, depart.getColonne()+1) != null)
			deplacementsPossibles.add(new Position(depart.getLigne()+2, depart.getColonne()+1));
		
		if (e.getCase(depart.getLigne()+2, depart.getColonne()-1) != null)
			deplacementsPossibles.add(new Position(depart.getLigne()+2, depart.getColonne()-1));
		
		if (e.getCase(depart.getLigne()-2, depart.getColonne()+1) != null)
			deplacementsPossibles.add(new Position(depart.getLigne()-2, depart.getColonne()+1));
		
		if (e.getCase(depart.getLigne()-2, depart.getColonne()-1) != null)
			deplacementsPossibles.add(new Position(depart.getLigne()-2, depart.getColonne()-1));
		
		if (e.getCase(depart.getLigne()+1, depart.getColonne()+2) != null)
			deplacementsPossibles.add(new Position(depart.getLigne()+1, depart.getColonne()+2));
		
		if (e.getCase(depart.getLigne()-1, depart.getColonne()+2) != null)
			deplacementsPossibles.add(new Position(depart.getLigne()-1, depart.getColonne()+2));
		
		if (e.getCase(depart.getLigne()+1, depart.getColonne()-2) != null)
			deplacementsPossibles.add(new Position(depart.getLigne()+1, depart.getColonne()-2));
		
		if (e.getCase(depart.getLigne()-1, depart.getColonne()-2) != null)
			deplacementsPossibles.add(new Position(depart.getLigne()-1, depart.getColonne()-2));
		
		for (int i =0; i<deplacementsPossibles.size();i++)
		{
			if(e.getCase(deplacementsPossibles.get(i).getLigne(), deplacementsPossibles.get(i).getColonne()).occupe()) deplacementsPossibles.remove(i);
		}
		
		System.out.println(deplacementsPossibles.toString());
		return deplacementsPossibles;
	}

}
