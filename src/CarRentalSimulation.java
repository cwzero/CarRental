
public class CarRentalSimulation {
	public static void main(String[] args) {
		Person[] people = {
				new Person(1, "Jack", "Sparrow", 32, false), 
				new Person(2, "Phil", "Collins", 68, true), 
				new Person(3, "Justin", "Bieber", 18, true), 
				new Person(4, "Perry", "Mason", 47, true), 
				new Person(5, "Bart", "Simpson", 22, false), 
				new Person(6, "Marge", "Simpson", 44, true), 
				new Person(7, "Maggie", "Simpson", 17, true)};
		CarRentalCompany company = new CarRentalCompany("AVIS");
		for (Person p: people) {
			try {
				company.registerPerson(p);
			} catch (DriverException | CarUnvailableException ex) {
				System.err.println(ex.getClass().getName());
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}
