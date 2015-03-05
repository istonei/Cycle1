
public class Cycle {

	private int numberOfWheels;
	private int weight;
	
	public Cycle(int a, int b)
	{
		this.numberOfWheels = a;
		this.weight = b;
	}
	public Cycle()
	{
		this(100, 1000);
	}
	public String toString()
	{
		return "Number of wheels:" + numberOfWheels + ", Weight:"+ weight+"";
	}
}
