package qa.com.library2;

public class Mag extends LibraryItems implements UPdate{

	public Mag(int id, String name, double price, boolean checkout) {
		super(id, name, price, checkout);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void update() {
		System.out.println("I'm reading ");
	}
}
