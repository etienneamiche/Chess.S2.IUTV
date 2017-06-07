
import java.util.Scanner;

public class Saisie {
	private Affichage a = new Affichage();

	public Saisie(){
		
	}

	public Position saisiePositionInit()
	{
		Scanner sc = new Scanner(System.in);
		String str;
		int i=0,j=0;
		boolean testCatch;
		do{
			testCatch = true;
			try{
				do{
					a.afficher("Saisir une position de départ:");
					str = sc.nextLine();
					i = ((int) str.charAt(0)) - 65;
					j = (int) str.charAt(1)-49; 
				}while(str.length()>2);
			}
			catch(StringIndexOutOfBoundsException e){
				testCatch = false;
			}
			catch(NullPointerException e ){
				testCatch = false;
			}
			
		}while(testCatch == false);
		
		if (i == 50 && j == 48) return new Position(-1,-1); // sa = sauvegarder
		else if (i == 34 && j == 55) return new Position(-2,-2); // ch = charger
		
		else return new Position(i,j);
		
	}
	
	public Position saisiePositionFinale() 
	{
		Scanner sc = new Scanner(System.in);
		String str;
		int i=0,j=0;
		boolean testCatch;
		do{
			testCatch = true;
			try{
				do{
					a.afficher("Saisir une position d'arrivée:");
					str = sc.nextLine();
					i = ((int) str.charAt(0)) - 65;
					j = (int) str.charAt(1)-49; 
				}while(str.length()>2);
			}
			catch(StringIndexOutOfBoundsException e){
				testCatch = false;
			}
			catch(NullPointerException e ){
				testCatch = false;
			}
		}while(testCatch == false);
		return new Position(i,j); 		
	}
}
