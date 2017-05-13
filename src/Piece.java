import java.util.ArrayList;

public abstract class Piece {

		protected String nom;
		protected String couleur;
		 
	
		
		public String getNom()
		{
			return this.nom;
		}
		
		public String getCouleur()
		{
			return this.couleur;
		}
		
		public abstract String toString();
		
		public abstract ArrayList<Deplacement> deplacementValide(Position départ);
		
		
		
}
