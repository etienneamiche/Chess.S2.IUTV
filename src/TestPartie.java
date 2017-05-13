import java.util.Scanner;

public class TestPartie {

	
	
	
	
	public static Deplacement saisieUtilisateur()
	{
		Scanner sc = new Scanner(System.in);
		String str;
		Position posInit;
		Position posFinal;
		int i,j;
		
		do
		{
		System.out.println("saisir une position depart:");
		str = sc.nextLine();
	
		i = ((int) str.charAt(0)) - 65;
	
		j = (int) str.charAt(1)-49; 
		
		}while( !(!(i < 0 || i > 7) && !(j < 0 || j > 7)) );
		
		posInit = new Position(i,j);
		
		do
		{
			
		System.out.println("saisir une position d'arriver:");
		str = sc.nextLine();
	
		i = ((int) str.charAt(0)) - 65;
		j = (int) str.charAt(1)-49; 
		
		}while( !( !(i < 0 || i > 7) && !(j < 0 || j > 7) ) );
		
		
		posFinal= new Position(i,j);
		

	
		Deplacement depl = new Deplacement(posInit,posFinal);
		
		return depl;
		
	}
	
	
	public static void main(String[] args)
	{
		Echiquier e = new Echiquier();
		
		Affichage p = new Affichage();
		
		e.remplir();

		p.afficher(e);
		
		e.Deplacer(saisieUtilisateur());
		p.afficher(e);
		
		e.Deplacer(saisieUtilisateur());
		p.afficher(e);	
		
		
		
	}
		
		
}
