package qa.com.library;

public class Book extends Library3 {
	
	boolean hardback;
	boolean onlineBook;
	String type;
	
	
	public Book(boolean onAShelf, int numberOfCopies, String personName, double personDOB, String address,
			boolean inStock, boolean hardback, boolean onlineBook, String type) {
		super(onAShelf, numberOfCopies, personName, personDOB, address, inStock);
		this.hardback = hardback;
		this.onlineBook = onlineBook;
		this.type = type;
	}


	public Book(boolean onAShelf, int numberOfCopies, String personName, double personDOB, String address,
			boolean inStock) {
		super(onAShelf, numberOfCopies, personName, personDOB, address, inStock);
	}


	public boolean isHardback() {
		return hardback;
	}


	public void setHardback(boolean hardback) {
		this.hardback = hardback;
	}


	public boolean isOnlineBook() {
		return onlineBook;
	}


	public void setOnlineBook(boolean onlineBook) {
		this.onlineBook = onlineBook;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
	
	
	

}

