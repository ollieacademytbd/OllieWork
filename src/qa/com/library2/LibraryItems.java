package qa.com.library2;

public abstract class LibraryItems {
	
	public int id;
	public String name;
	public double price;
	public boolean checkout;
	
	
	
	public LibraryItems(int id, String name, double price, boolean checkout) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.checkout = checkout;
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



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public boolean isCheckout() {
		return checkout;
	}



	public void setCheckout(boolean checkout) {
		this.checkout = checkout;
	}
	
	
	
	
	
	
	

	
	

}
