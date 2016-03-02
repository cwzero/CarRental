
public class Car {
	private int id;
	private String name;
	private int maxPersons;
	private int range;
	private double fuelLevel;
	
	public Car() {
		
	}

	public Car(int id, String name, int maxPersons, int range, double fuelLevel) {
		this();
		this.id = id;
		this.name = name;
		this.maxPersons = maxPersons;
		this.range = range;
		this.fuelLevel = fuelLevel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaxPersons() {
		return maxPersons;
	}

	public void setMaxPersons(int maxPersons) {
		this.maxPersons = maxPersons;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public double getFuelLevel() {
		return fuelLevel;
	}

	public void setFuelLevel(double fuelLevel) {
		this.fuelLevel = fuelLevel;
	}
}
