import java.util.ArrayList;

public class Tour extends Piece{

	public Tour(String couleur)
	{
		this.nom="tour";
		this.couleur=couleur;
	}
	
	
	public String toString()
	{
		if (this.couleur=="blanc") return "\u265C";
		else return "\u2656";
	}

	/*-la tour se déplace horizontalement ou verticalement 
	 *d'autant de cases qu'elle souhaite si elle ne rencontre pas d'obstacle.
	
	 -Si elle rencontre un obstacle de couleur adverse,
	 la tour n'a pas le droit de sauter par-dessus, par contre elle est en droit de prendre la pièce en s'arrêtant
	 sur la case où la pièce adverse se trouvait.
	 
	 -Si elle rencontre un obstacle de même couleurqu'elle,
	 elle ne peut pas sauter par-dessus et est dans l'obligation de s'arrêter au plus loin dans la case adjacente.
	*/
	
	public ArrayList<Position> deplacementValide(Position depart,Echiquier e)
	{
		ArrayList<Position> deplacementsPossibles = new ArrayList<Position>();
		
		int i = 1; 
		while( e.getCase(depart.getLigne()+i , depart.getColonne()) != null )
		{
			if(e.getCase(depart.getLigne()+i , depart.getColonne()).occupe(this.getCouleur()) == true)
			{
				break;
			}
			if(e.getCase(depart.getLigne()+i , depart.getColonne()).occupe() == false )
				{deplacementsPossibles.add(new Position(depart.getLigne()+i,depart.getColonne() ));}
			if(e.getCase(depart.getLigne()+i , depart.getColonne()).occupe(this.oposit()) == true)
				{
				deplacementsPossibles.add(new Position(depart.getLigne()+i,depart.getColonne() ));
				break;
				}
			
			i++;
			
		}
		i=1;
		while( e.getCase(depart.getLigne()-i , depart.getColonne()) != null )
		{
			if(e.getCase(depart.getLigne()-i , depart.getColonne()).occupe(this.getCouleur()) == true)
			{
				break;
			}
			if(e.getCase(depart.getLigne()-i , depart.getColonne()).occupe() == false)
				{deplacementsPossibles.add(new Position(depart.getLigne()-i,depart.getColonne() ));}
			if(e.getCase(depart.getLigne()-i , depart.getColonne()).occupe(this.oposit()) == true)
				{
				deplacementsPossibles.add(new Position(depart.getLigne()-i,depart.getColonne() ));
				break;
				}
		
			i++;
			
		}
		i=1;
		while( e.getCase(depart.getLigne() , depart.getColonne() +i) != null )
		{
			if(e.getCase(depart.getLigne(), depart.getColonne()+i).occupe(this.getCouleur()) == true)
			{
				break;
			}
			if(e.getCase(depart.getLigne() , depart.getColonne() +i).occupe() == false )
				{deplacementsPossibles.add(new Position(depart.getLigne(),depart.getColonne()+i ));}
			if( e.getCase(depart.getLigne() , depart.getColonne() +i).occupe(this.oposit()) == true)
			{
				deplacementsPossibles.add(new Position(depart.getLigne(),depart.getColonne()+i ));
				break;
			}
		
			i++;
			
		}

		i=1;
		while( e.getCase(depart.getLigne() , depart.getColonne() -i) != null )
		{
			if(e.getCase(depart.getLigne() , depart.getColonne() -i).occupe(this.getCouleur()) == true)
			{
				break;
			}
			if(e.getCase(depart.getLigne() , depart.getColonne() -i).occupe() == false)
				{deplacementsPossibles.add(new Position(depart.getLigne(),depart.getColonne()-i ));}
			if(e.getCase(depart.getLigne() , depart.getColonne() -i).occupe(this.oposit()) == true )
			{
				deplacementsPossibles.add(new Position(depart.getLigne(),depart.getColonne()-i ));
				break;
			}
			i++;
			
		}
		
		
		System.out.println(deplacementsPossibles.toString());
		
		return deplacementsPossibles;
	}

}
