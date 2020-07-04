package qa.com.library2;

public class Users {
	private int phonenumber;
	private String addressFirstLine;
	private String idNumber;
	private boolean activeUser;
	private String name;
	private String gender;
	
	
	
	public Users(int phonenumber, String addressFirstLine, String idNumber, boolean activeUser, String name,
			String gender) {
		super();
		this.phonenumber = phonenumber;
		this.addressFirstLine = addressFirstLine;
		this.idNumber = idNumber;
		this.activeUser = activeUser;
		this.name = name;
		this.gender = gender;
		
		
	
	
	System.out.println("Name: " + this.name + "Address: " + this.addressFirstLine + "ID Number: " + this.idNumber + "Is this user active: " + this.activeUser + "Gender: " + this.gender);
	
	
	}


	public int getPhonenumber() {
		return phonenumber;
	}


	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}


	public String getAddressFirstLine() {
		return addressFirstLine;
	}


	public void setAddressFirstLine(String addressFirstLine) {
		this.addressFirstLine = addressFirstLine;
	}


	public String getIdNumber() {
		return idNumber;
	}


	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}


	public boolean isActiveUser() {
		return activeUser;
	}


	public void setActiveUser(boolean activeUser) {
		this.activeUser = activeUser;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	

}
