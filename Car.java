public class Car{
	public static String companyName="Honda";
	public String carModel="Civic";
	public static void main(String args[])
	{
		Car car1=new Car();
		Car car2=new Car();
		System.out.println("Company :"+Car.companyName);
		System.out.println("Car1 Model:"+car1.carModel);
		System.out.println("Car2 Model:"+car2.carModel);
	}
}