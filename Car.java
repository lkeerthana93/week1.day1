package week1.day1;

public class Car {
	public void applyBreak()
	{
		System.out.println("Apply break method has been called");
	}
	public void applyGear()
	{
		System.out.println("Apply gear method has been called");
	}
	public void switchonAc()
	{
		System.out.println("Switch On method has been called");
	}
	public void applyAcclerate()
	{
		System.out.println("Apply accelerate method has been called");
	}

	public static void main(String[] args) {
		Car c = new Car();
		c.applyAcclerate();
		c.applyBreak();
		c.applyGear();
		c.switchonAc();
		
	}
	public class MyCar
	{
		public void main(String[] args) {
			Car c = new Car();
			c.applyAcclerate();
			c.applyBreak();
			c.applyGear();
			c.switchonAc();
			
		}		
		
	}

}
