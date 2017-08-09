
public abstract class Car {

	static int VIN = 0;
	String ownerName;
	String ownerAddreess;
	String fullCarVIN;
	int warYears;
	
	public Car(String name)
	{
		VIN++;
		this.ownerName = name;
	}
	
	public abstract void setWarYears();
	
	public String getOwnerName()
	{
		return this.ownerName;
	}
	
	public void changeOwner(String name)
	{
		this.ownerName = name;
	}
	
	public String getVIN()
	{
		return this.fullCarVIN;
	}
	
	public void setOwnerAddress(String x)
	{
		ownerAddreess = x;
	}
	
	public String  getOwnerAddress()
	{
		return ownerAddreess;
	}
	
}
