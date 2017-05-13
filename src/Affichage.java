
public class Affichage {


		
		public void afficher(Echiquier plateau)
		{
			System.out.print(" ");
			for(int i = 0; i<8;i++)
			{
				System.out.print(" "+(i+1));
			}
			System.out.print('\n');
			for(int i = 0; i<8;i++)
			{
				System.out.print((char)(i+65));
				for(int j=0;j<8;j++)
				{
					System.out.print("|");
					System.out.print(plateau.getPlateau()[i][j].toString());
				}
				System.out.print("|" + '\n');
			}
		}
		
		public void afficher(String message)
		{
			System.out.println(message);
		}
}
