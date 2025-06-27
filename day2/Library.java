package week1.day2;

public class Library {
	String addBook(String bookTitle)
	{
	
		System.out.println("Book added successfully");
		return bookTitle;
	}
	void issueBook()
	{
		System.out.println("Book Issued successffully");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lm=new Library();
		System.out.println(lm.addBook("Psycology of MOney"));
		lm.issueBook();
		
		
	
	}

}
