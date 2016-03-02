
public class RentalInformation {
	private Person renter;
	private Car rental;
	private int distance;
	private int riders;

	public Person getRenter() {
		return renter;
	}

	public void setRenter(Person renter) {
		this.renter = renter;
	}

	public Car getRental() {
		return rental;
	}

	public void setRental(Car rental) {
		this.rental = rental;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getRiders() {
		return riders;
	}

	public void setRiders(int riders) {
		this.riders = riders;
	}
}
