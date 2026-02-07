package Week1.day2;

public class LibraryManagement {

	public static void main(String[] args) {
		Library lib= new Library();
		String bookName = lib.addBook("Java Selenium");
		lib.issueBook();
	}

}
