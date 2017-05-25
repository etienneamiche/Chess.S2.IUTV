import java.util.ArrayList;

public class Pion extends Piece{
	

	
	public Pion(String couleur)
	{
		this.nom="pion";
		this.couleur=couleur;

	}
	
	public String toString()
	{
		if (this.couleur=="noir") return "\u2659";
		else return "\u265F";
	}
/*
	-Il ne se déplace habituellement vers l'avant que d'une seule case et doit s’arrêter dès qu'il croise un obstacle.
	Il ne recule jamais.
	
	-Mais pour un pion n'ayant pas encore bougé, il est autorisé de le déplacer vers l'avant de deux cases ;
	cela n'est toutefois pas obligatoire.
	Un pion ayant déjà été déplacé n'est plus autorisé à se déplacer de deux cases à la fois.
	
	-Le pion prend en diagonale (toujours vers l'avant) ; ce mouvement n'est autorisé que pour prendre une pièce adverse.
	
	-Prendre une piece adjascente n'est pas une obligation,
	rien ne l'empêche d'aller vers l'avant s'il n'y a pas d'obstacle.
	
*/	
	public ArrayList<Position> deplacementValide(Position depart,Echiquier e)
	{
		ArrayList<Position> deplacementsPossibles = new ArrayList<Position>();
		
		
		if (this.couleur == "noir")
		{
			if(e.getCase(depart.getLigne()+1,depart.getColonne()) == null)
			{
				deplacementsPossibles.add( new Position(depart.getLigne()+1,depart.getColonne()) );
				
				if (depart.getLigne() == 1 )
				{
					Position pos2=new Position(depart.getLigne()+2,depart.getColonne());
					deplacementsPossibles.add(pos2);
				}
			}
			
		
			if(e.getCase(depart.getLigne()+1,depart.getColonne()-1) != null) 
			{
				Position pos3 = (new Position(depart.getLigne()+1,depart.getColonne()-1));
				deplacementsPossibles.add(pos3);
			}
			
			if( (e.getCase(depart.getLigne()+1,depart.getColonne()-1) != null) )
			{
				Position pos4 = (new Position(depart.getLigne()+1,depart.getColonne()+1));
				deplacementsPossibles.add(pos4);
			}

		}

			
		return deplacementsPossibles;
	}

}
