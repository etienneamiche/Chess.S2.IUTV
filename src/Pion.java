import java.util.ArrayList;

public class Pion extends Piece{
	
	


	
	public Pion(String couleur)
	{
		this.nom="pion";
		this.couleur=couleur;
	}
	
	public String toString()
	{
		if (this.couleur=="noir") return "|"+"\u265F";
		else return "|"+"\u2659";
	}
	
	public ArrayList<Deplacement> deplacementValide(Position depart)
	{
		ArrayList<Deplacement> deplacementsPossibles = new ArrayList<Deplacement>();
		
		
		return deplacementsPossibles;
	}

}
