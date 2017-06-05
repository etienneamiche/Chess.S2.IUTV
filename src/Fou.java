import java.util.ArrayList;

public class Fou extends Piece{

	
	public Fou(String couleur)
	{
		this.nom="fou";
		this.couleur=couleur;
	}
	public String toString()
	{
		if (this.couleur=="blanc") return "\u2657";
		else return "\u265F";
	}
	/*
	-De manière générale le fou se déplace en diagonale
	d'autant de cases qu'il souhaite s'il ne rencontre pas d'obstacle.
	
	-S'il rencontre un obstacle de couleur adverse, le fou n'a pas le droit de sauter par-dessus,
	par contre il est en droit de prendre la pièce en s'arrêtant sur la case où la pièce adverse se trouvait.

	-S'il rencontre un obstacle de même couleur que lui
	il ne peut pas sauter par-dessus et est dans l'obligation de s'arrêter au plus loin dans la case adjacente.
	*/
	
	
	public ArrayList<Position> deplacementValide(Position depart,Echiquier e)
	{
		ArrayList<Position> deplacementsPossibles = new ArrayList<Position>();
		

		
		int i = 1; 
		while( e.getCase(depart.getLigne()+i , depart.getColonne() +i) != null )
		{
			if(e.getCase(depart.getLigne()+i , depart.getColonne() +i).occupe(this.getCouleur()) == true)
			{
				break;
			}
			if(e.getCase(depart.getLigne()+i , depart.getColonne() +i).occupe() == false )
				{deplacementsPossibles.add(new Position(depart.getLigne()+i,depart.getColonne()  +i));}
			if(e.getCase(depart.getLigne()+i , depart.getColonne() +i).occupe(this.oposit() ) == true)
				{
				deplacementsPossibles.add(new Position(depart.getLigne()+i,depart.getColonne()  +i));
				break;
				}
			i++;
			
		}
		i=1;
		while( e.getCase(depart.getLigne()-i , depart.getColonne()  +i) != null )
		{
			if(e.getCase(depart.getLigne()-i , depart.getColonne()  +i).occupe(this.getCouleur()) == true)
			{
				break;
			}
			if(e.getCase(depart.getLigne()-i , depart.getColonne()  +i).occupe() == false)
				{deplacementsPossibles.add(new Position(depart.getLigne()-i,depart.getColonne()  +i));}
			if(e.getCase(depart.getLigne()-i , depart.getColonne()  +i).occupe(this.oposit()) == true)
				{
				deplacementsPossibles.add(new Position(depart.getLigne()-i,depart.getColonne()  +i));
				break;
				}
			i++;
			
		}
		i=1;
		while( e.getCase(depart.getLigne() +i, depart.getColonne() -i) != null )
		{
			if( e.getCase(depart.getLigne()+i , depart.getColonne() -i).occupe(this.getCouleur()) == true)
			{
				break;
			}
			if(e.getCase(depart.getLigne() +i, depart.getColonne() -i).occupe() == false )
				{deplacementsPossibles.add(new Position(depart.getLigne()+i,depart.getColonne()-i ));}
			if( e.getCase(depart.getLigne()+i , depart.getColonne() -i).occupe(this.oposit()) == true)
			{
				deplacementsPossibles.add(new Position(depart.getLigne()+i,depart.getColonne()-i ));
				break;
			}
			i++;
			
		}

		i=1;
		while( e.getCase(depart.getLigne() -i, depart.getColonne() -i) != null )
		{
			if(e.getCase(depart.getLigne() -i, depart.getColonne() -i).occupe(this.getCouleur()) == true )
			{
				break;
			}
			if(e.getCase(depart.getLigne() -i, depart.getColonne() -i).occupe() == false)
				{deplacementsPossibles.add(new Position(depart.getLigne()-i,depart.getColonne()-i ));}
			if(e.getCase(depart.getLigne() -i, depart.getColonne() -i).occupe(this.oposit()) == true )
			{
				deplacementsPossibles.add(new Position(depart.getLigne()-i,depart.getColonne()-i ));
				break;
			}
			i++;
			
		}
		
		return deplacementsPossibles;
	}

}
