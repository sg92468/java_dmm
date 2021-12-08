package practice;

public class Car {
	private double fuelCost;
	private double fuelAmount;
	
	public Car(double fuelCost, double fuelAmount) {
		this.fuelCost = fuelCost;
		this.fuelAmount = fuelAmount;
	}
	
	public void move(int d) {
		System.out.println(d + " km 走ります");
		this.fuelAmount -= (d / this.fuelCost);
	}
	
	public double getFuelAmount() {
		return this.fuelAmount;
	}
}
