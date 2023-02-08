package daily;

public class Book {
	
	private String name;
	private Author author;
	private double price;
	private int qty;
	
	public Book() {
		super();
	}
	
	public Book(String name, Author author, double price, int qty) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}


	public String getName() {
		return name;
	}
	
	public Author getAuthor() {
		return author;
	}
	

	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQty() {
		return qty;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	@Override 
	public String toString() {
		
		return this.name + " by "+ this.author.toString();
	}
	
}