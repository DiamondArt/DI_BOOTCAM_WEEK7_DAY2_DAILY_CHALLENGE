package daily;

public class Main {

	public static void main(String[] args) {
		
		Author author = new Author("Paul Loup Sutlizer","email@gmail.com", 'M', true);
		Book newBook = new Book("Hannah",author ,200, 3);
		
		System.out.println(newBook);
	}

}
