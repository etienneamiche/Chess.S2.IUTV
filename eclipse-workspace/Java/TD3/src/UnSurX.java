
public class UnSurX {
	private int x;
	
	public UnSurX(int x){
		this.x = x;
	}

	public int calculEntier(){
		try {
			return 1/x;		
		} 
		
		catch(ArithmeticException e)
		{
			System.out.println("Division par 0 dans calculEntier() !");
			return 0;
		}

	}
	
	public double calculReel(){
		return 1/(double) x;
	}
	
	public String toString(){
		return 1+"/"+this.x;
	}
}
