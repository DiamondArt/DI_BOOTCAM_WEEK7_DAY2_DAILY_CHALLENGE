package daily;

public class Author {
	
	private String name;
	private String email;
	private char gender;
	private boolean isMale = true;
	
	// constructor
	public Author(String name, String email, char gender, boolean isMale) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.isMale = isMale;
	}

	//setter and getter
	public String getName() {
		return name;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	@Override
	public String toString() {
		return this.name + "(" +this.gender +") at email " + this.email;
	}
	
	
	
	
	
	

	
	
	

}
