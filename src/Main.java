
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Toyota car1 = new Toyota("Jack");
		//System.out.println(car1.ownerName + " " + car1.getVIN());
		
		Toyota car2 = new Toyota("Tim");
		//System.out.println(car2.ownerName + " " + car2.getVIN());

		Toyota car3= new Toyota("Elliot");
		car3.changeOwner("cho");
		//System.out.println(car3.ownerName + " " + car3.getVIN());
		
		Nissan car4 = new Nissan("Tom");
		//System.out.println(car4.ownerName + " " + car4.getVIN());
		
		Hyundai car5 = new Hyundai("Hyun");
		
		Car[] tList = {car1, car2, car3, car4, car5};
		
		for (int i=0; i<tList.length; i++)
		{
			System.out.println(tList[i].ownerName);
			tList[i].setOwnerAddress("ohio");
			System.out.println(tList[i].getOwnerAddress());
		}
	}	

}
