

public class TestPartie {

	
	private Echiquier e;
	
	public TestPartie(Echiquier ech)
	{
		this.e=ech;
	}
	
	public Echiquier getEchiquier()
	{
		return this.e;
	}
	
	
	
	public static void main(String[] args)
	{
		Echiquier e = new Echiquier();
		Affichage a = new Affichage();
		TestPartie t = new TestPartie(e);
		t.e.remplir();

		a.afficher(t.e);
		t.e.Deplacer();
		
		a.afficher(t.e);
		
		t.e.Deplacer();
		a.afficher(t.e);
	}
}
