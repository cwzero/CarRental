import java.util.ArrayList;
import java.util.List;

public class CarRentalCompany {
	private String name;
	private CarPool carPool;
	private List<Person> allowedPeople;
	private List<Person> failedPeople;
	
	public CarRentalCompany(String name) {
		this.name = name;
		carPool = new CarPool();
		allowedPeople = new ArrayList<Person>();
		failedPeople = new ArrayList<Person>();
	}
	
	public void doCallBacks() {
		for (Person person: failedPeople) {
			registerPerson(person);
		}
	}

	public void registerPerson(Person person) throws DriverException {
		if (!failedPeople.contains(person))
			failedPeople.add(person);
		if (!person.isLicensed()) {
			// You can't rent a car if you don't have a license! //
			throw new DriverLicenseException();
		} else if (person.getAge() < 23) {
			// You can't rent a car if you're under 23! //
			throw new DriverAgeException();
		} else {
			failedPeople.remove(person);
			allowedPeople.add(person);
		}
	}
	
	public void rentCar(RentalInformation rentalInformation) throws DriverException, CarUnvailableException {
		registerPerson(rentalInformation.getRenter());
		if (!carPool.isCarAvailable()) {
			// We're out of cars! //
			throw new CarUnvailableException();
		}
		carPool.removeCar(rentalInformation.getRental());
	}
	
	public String getName() {
		return name;
	}
}
