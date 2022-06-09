package Vehicle;

public class Vehicle implements Loan,Insurance{
	private String vehicleNumber;
	private String modelName;
	private String vehicleType;
	private double price;
	Vehicle(String vehicleNumber,String modelName,String vehicleType,double price){
		this.vehicleNumber=vehicleNumber;
		this.modelName=modelName;
		this.vehicleType=vehicleType;
		this.price=price;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double issueLoan() {
		double loan=0.0;
		//System.out.println(getVehicleType());
		if(getVehicleType().equalsIgnoreCase("4 wheeler"))
			 loan=(0.8*getPrice());
		if(getVehicleType().equalsIgnoreCase("3 wheeler"))
			 loan=(0.75*getPrice());
		if(getVehicleType().equalsIgnoreCase("2 wheeler"))
			 loan=(0.5*getPrice());
		return loan;
	}
	public double takeInsurance() {
			double insAmount=0.0;
		if(getPrice()<=150000)
			insAmount=3500;
		if(150000<getPrice() && getPrice()<=300000)
			insAmount=4000;
		if(getPrice()>300000)
			insAmount=5000;
		return insAmount;
	}
	
	
}
