package week1.day1;

public class TwoWheeler {
	
		int noOfWheels=2;
		short noOfMirrors=2;
		long chassisNumber=34127856L;
		boolean isPunctured=true;
		String bikeName="Yamaha";
		double runningKM=34.89;
	public static void main(String[] args) {
		TwoWheeler t = new TwoWheeler();
		System.out.println("Number of Wheels : " + t.noOfMirrors);
		System.out.println("Number of Mirrors : " + t.noOfMirrors);
		System.out.println("ChasisNumber : " + t.chassisNumber);
		System.out.println("isPunctured : " + t.isPunctured);
		System.out.println("Bike name : " + t.bikeName);
		System.out.println("Running time : " + t.runningKM);
	}
}
