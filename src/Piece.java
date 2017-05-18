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
		
		public abstract ArrayList<Position> deplacementValide(Position départ);
		
		
		//AJOUTER TOUT LES MOUVEMENT POSIBLE DE LA PIECE EN FONCTION DE SA POSITION ACTUELLE
		
			
		/* -un deplacement est valide si:
		 *  
		 * -la positionInitial contient une piece de la couleur du joueur courant
		 * -la position final est dans le tableau
		 * -la position final est une case vide ou une Piece Adverse
		 * -Il n'y a pas de piece présente Dans la trajectoire de la pièce déplacé
		 * (Sauf Cavalier)
		 * 
		 * 
		 */
		
		
		
}
