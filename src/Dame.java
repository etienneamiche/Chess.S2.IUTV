import java.util.ArrayList;

public class Dame extends Piece{

	public Dame(String couleur)
	{
		this.nom="dame";
		this.couleur=couleur;
	}
	
	public String toString()
	{
		if (this.couleur=="noir") return "\u265B";
		else return "\u2655";
	}
	/*
	-La dame peut se déplacer en diagonale, à l'horizontale ou à la verticale d'autant de cases qu'elle souhaite.
	Elle dispose en fait de la combinaison des pouvoirs du fou et de la tour.
	
	-Si elle rencontre un obstacle de couleur adverse, la dame n'a pas le droit de sauter par-dessus,
	par contre elle est en droit de prendre la pièce en s'arrêtant sur la case où la pièce adverse se trouvait.
	
	-Si elle rencontre un obstacle de même couleur qu'elle,elle ne peut pas sauter par-dessus
	et est dans l'obligation de s'arrêter au plus loin dans la case adjacente.
	 */
	
	public ArrayList<Position> deplacementValide(Position depart,Echiquier e)
	{
		ArrayList<Position> deplacementsPossibles = new ArrayList<Position>();
		int i = 1; 
		while( e.getCase(depart.getLigne()+i , depart.getColonne() +i) != null )
		{
			if(e.getCase(depart.getLigne()+i , depart.getColonne() +i).occupe(this.getCouleur() ) == true)
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
		
		i = 1; 
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
		
		return deplacementsPossibles;
	}

}
