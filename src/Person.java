
public class Person {
	private int id;
	private String name;
	private String lastName;
	private int age;
	private boolean licensed;
	
	public Person() {
		
	}

	public Person(int id, String name, String lastName, int age, boolean licensed) {
		this();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.licensed = licensed;
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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isLicensed() {
		return licensed;
	}

	public void setLicensed(boolean licensed) {
		this.licensed = licensed;
	}
}
