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
		public String oposit()
		{
			if (this.couleur=="noir") return "blanc";
			else return "noir";
		}
		
		public abstract String toString();
		
		public abstract ArrayList<Position> deplacementValide(Position depart,Echiquier e);

		public boolean estEchec2(Position actuelle, Echiquier e){ 
			for(int x = 0 ; x < 8;x++)
			{
				for(int y = 0 ; y < 8;y++)
				{
					if(e.getCase(x, y).occupe(this.oposit()))
					{
						Piece p = e.getCase(x,y).getPiece();
						Position posP = new Position(x,y);
						for (int i =0; i < p.deplacementValide(posP, e).size();i++)
						{
							Position possibles = p.deplacementValide(posP, e).get(i);
							if(possibles == actuelle) {System.out.println("Echec");return true;}
						}
					}
				}
			}
			System.out.println("Pas Echec");
			return false;
		}
		
		public boolean estEchec(Position init, Echiquier e){ 
			
			ArrayList<Position> liste = new ArrayList<Position>();
			
			for(int x = 0 ; x < 8;x++)
			{
				for(int y = 0 ; y < 8;y++)
				{
					if(e.getCase(x, y).occupe(this.oposit()))
					{
						Piece p = e.getCase(x,y).getPiece();
						Position posP = new Position(x,y);
						
						for (int i =0; i < p.deplacementValide(posP, e).size();i++)
						{
							liste.add(p.deplacementValide(posP, e).get(i));
							
						}
						
						
					}
				}
				
			}
			System.out.println(liste.toString());
			if (liste.contains(init)) {System.out.println("Echec");
			
				return true;}
			
			System.out.println("Pas Echec");
			return false;
		}
		
		
		

		
		

		
		
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
