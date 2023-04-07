package reflectionapi;


public class Employee1 {
	
	private int id;
	private String name;
	private String number;
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
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String toString2() {
		return "Employee1 [id=" + id + ", name=" + name + ", number=" + number + "]";
	}
//	public Employee1(int id, String name, String number) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.number = number;
//	}
	private Employee1() {
		
	}
	
	
	

}

