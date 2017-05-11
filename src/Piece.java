
public abstract class Piece {

		protected String nom;
		protected String couleur;
		
		public Piece(String nom, String couleur){
			
			this.nom=nom;
			this.couleur=couleur;
		}
		
		public String getNom()
		{
			return this.nom;
		}
		
		public String getCouleur()
		{
			return this.couleur;
		}
		
		
		public abstract boolean deplacementValide(Deplacement deplacement);
		
		
		
}
