import java.util.ArrayList;
import java.util.List;

public class CarPool {
	private List<Car> cars;
	
	public CarPool() {
		cars = new ArrayList<Car>();
	}
	
	public boolean isCarAvailable() {
		return cars.isEmpty();
	}
	
	public void removeCar(Car car) {
		cars.remove(car);
	}
}
