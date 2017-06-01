
import java.util.Scanner;

public class Saisie {

	public Saisie(){
		
	}

	public Position saisiePositionInit()
	{
		Scanner sc = new Scanner(System.in);
		String str;
		int i,j;
		do{
		System.out.println("Saisir une position départ:");
		str = sc.nextLine();
	
		i = ((int) str.charAt(0)) - 65;
	
		j = (int) str.charAt(1)-49; 
		System.out.println(i + " " +j);

		}while(str.length()>2);
		
		return new Position(i,j);
		
	}
	
	public Position saisiePositionFinale() 
	{
		Scanner sc = new Scanner(System.in);
		String str;
		int i,j;

			do{
				System.out.println("Saisir une position d'arrivée:");
				str = sc.nextLine();
			
				i = ((int) str.charAt(0)) - 65;
				j = (int) str.charAt(1)-49; 
				System.out.println(i + " " +j);
			}while(str.length()>2);
			return new Position(i,j);
	
		 		
	}
}
