package pack;

public class Customer {

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Customer() is called");
	}
	private Identifier id;
	public Customer(Identifier id) {
		super();
		System.out.println("Customer(identifier) is called");
		this.id = id;
		id.display();
	}
	public Identifier getId() {
		return id;
	}
	public void setId(Identifier id) {
		this.id = id;
		System.out.println("setId(identifier) is called");
		id.display();
	}
	/*public void getInformation(){
		id.display();
	}*/

}
