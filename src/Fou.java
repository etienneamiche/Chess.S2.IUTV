import java.util.ArrayList;

public class Fou extends Piece{

	
	public Fou(String couleur)
	{
		this.nom="fou";
		this.couleur=couleur;
	}
	public String toString()
	{
		if (this.couleur=="noir") return "\u2657";
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
	
	
	public ArrayList<Deplacement> deplacementValide(Position départ) {
		// TODO Auto-generated method stub
		return null;
	}

}
