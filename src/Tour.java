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
	
	public ArrayList<Position> deplacementValide(Position depart)
	{
		ArrayList<Position> deplacementsPossibles = new ArrayList<Position>();
		
		
		return deplacementsPossibles;
	}

}
