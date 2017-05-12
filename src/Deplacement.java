
public class Deplacement {
	private Position positionInitial;
	private Position positionFinal;
	
	public Deplacement(Position positionInitial, Position positionFinal)
	{
		this.positionFinal=positionFinal;
		this.positionInitial=positionInitial;
	}
	
	
	
	
	
	public String toString()
	{
		return this.positionInitial.toString() + "-" + this.positionFinal.toString();
	}
	
	public Position getPositionFinal() {
		return positionFinal;
	}
	public void setPositionFinal(Position positionFinal) {
		this.positionFinal = positionFinal;
	}
	public Position getPositionInitial() {
		return positionInitial;
	}
	public void setPositionInitial(Position positionInitial) {
		this.positionInitial = positionInitial;
	}
	
	
	
}
