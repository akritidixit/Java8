import java.util.HashMap;
import java.util.Map;
public class LambdaDemo5 {
 
	public static void main(String [] args) {
		
		Map<String, String> books = new HashMap <> ();
		books.put("Let us c", "yashwant kanetkar");
		books.put("oops", "simon kendal");
		books.put("java", "David Etheidge");

		books.forEach((key,value) -> System.out.println("Book Name:- " + key + ",Author:-" + value));
		
		System.out.println();
		books.forEach((key,value) -> {
			System.out.println("Book Nmae: " +key + " Author:-" +value);
		});
		System.out.println();
		
		
	}
}
