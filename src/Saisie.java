
import java.util.Scanner;

public class Saisie {

	public Saisie(){
		
	}

	public Position saisiePositionInit()
	{
		Scanner sc = new Scanner(System.in);
		String str;
		int i,j;
	
		System.out.println("Saisir une position dÃ©part:");
		str = sc.nextLine();
	
		i = ((int) str.charAt(0)) - 65;
	
		j = (int) str.charAt(1)-49; 

		
		return new Position(i,j);
		
	}
	
	public Position saisiePositionFinale() 
	{
		Scanner sc = new Scanner(System.in);
		String str;
		int i,j;
			
				System.out.println("Saisir une position d'arrivés:");
				str = sc.nextLine();
			
				i = ((int) str.charAt(0)) - 65;
				j = (int) str.charAt(1)-49; 
			
			return new Position(i,j);
	
		 		
	}
}
