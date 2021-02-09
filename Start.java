public class Start extends Book {
public static void main(String [] args){
	    Book b = new Book();
	    b.setIsbn("40069336885");
	    b.setBookTitle("LIFE OF PIE");
	    b.setAuthorName("Dr Nousheen Punom");
	    b.setPrice(500.50);
	    b.setAvailableQuantity(100);
	    b.addQuantity(5);
	    b.sellQuantity(365);
	    b.showDetails();
	   
            

	}
	    }