import java.util.ArrayList;

public class Roi extends Piece{

	public Roi(String couleur)
	{
		this.nom="roi";
		this.couleur=couleur;
	}
	
	public String toString()
	{
		if (this.couleur=="blanc") return "\u265A";
		else return "\u2654";
	}
	/*
	-Le roi ne peut se déplacer que d'une seule case dans n'importe quel sens.
	
	-Si une case est occupée par une pièce de son camp, le roi n'a pas le droit de s'y déplacer.
	
	-Si une case est occupée par une pièce adverse, le roi peut prendre sa place en éliminant cette pièce.
	
	-Le roi n'est autorisé à se déplacer sur une case que si celle-ci n'est pas attaquée par une pièce adverse.
	Comparer a la liste de deplacement possible de toute les piece adverse du plateau
	*/
	public ArrayList<Position> deplacementValide(Position depart,Echiquier e)
	{
		ArrayList<Position> deplacementsPossibles = new ArrayList<Position>();
		
		if (e.getCase(depart.getLigne()-1, depart.getColonne()) != null) 			//haut
			deplacementsPossibles.add(new Position(depart.getLigne()-1, depart.getColonne()));
		
		if (e.getCase(depart.getLigne()+1, depart.getColonne()) != null) 			//bas
			deplacementsPossibles.add(new Position(depart.getLigne()+1, depart.getColonne()));
		
		if (e.getCase(depart.getLigne(), depart.getColonne()-1) != null) 			//gauche
			deplacementsPossibles.add(new Position(depart.getLigne(), depart.getColonne()-1));
		
		if (e.getCase(depart.getLigne(), depart.getColonne()+1) != null) 			//droite
			deplacementsPossibles.add(new Position(depart.getLigne(), depart.getColonne()+1));
		
		if (e.getCase(depart.getLigne()+1, depart.getColonne()+1) != null) 			//diagonale bas droit
			deplacementsPossibles.add(new Position(depart.getLigne()+1, depart.getColonne()+1));
		
		if (e.getCase(depart.getLigne()+1, depart.getColonne()-1) != null) 			//diagonale bas gauche
			deplacementsPossibles.add(new Position(depart.getLigne()+1, depart.getColonne()-1));
		
		if (e.getCase(depart.getLigne()-1, depart.getColonne()+1) != null) 			//diagonale haut droit
			deplacementsPossibles.add(new Position(depart.getLigne()-1, depart.getColonne()+1));
		
		if (e.getCase(depart.getLigne()-1, depart.getColonne()-1) != null) 			//diagonale haut gauche
			deplacementsPossibles.add(new Position(depart.getLigne()-1, depart.getColonne()-1));
		
		
		for (int i =0; i<deplacementsPossibles.size();i++)
		{
			if(e.getCase(deplacementsPossibles.get(i).getLigne(), deplacementsPossibles.get(i).getColonne()).occupe(this.getCouleur())) deplacementsPossibles.remove(i);
		}
	}
}
