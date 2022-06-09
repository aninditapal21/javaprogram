package Vehicle;
import java.util.*;
public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter vehicleNumber");
		String vnumber=sc.nextLine();
		System.out.println("Enter modelName");
		String mName=sc.nextLine();
		System.out.println("Enter vehicleType");
		String vType=sc.nextLine();
		System.out.println("Enter price");
		double vPrice=sc.nextDouble();
		Vehicle v=new Vehicle( vnumber,mName, vType, vPrice);
		v.setVehicleNumber(vnumber);
		v.setModelName(mName);
		v.setVehicleType(vType);
		v.setPrice(vPrice);
		//System.out.println(v.getPrice());
		//System.out.println(v.getVehicleType());
		System.out.println(v.issueLoan());
		System.out.println(v.takeInsurance());
	}

}
