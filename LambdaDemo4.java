import java.util.Arrays;
import java.util.List;

public class LambdaDemo4 {

	public static void main(String[] args) {
	new Thread(new Runnable() {
		public void run() {
			System.out.println("Before java8, too much code for too little to do");
		}
	}).start();
	
	//java 8 way:
	new Thread(() -> System.out.println("In java8, lambda expression rocks !!")).start();
	System.out.println("________*****************************______________________");
	//iterating over list using lambda expressions
	
	List features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
	features.forEach(n -> System.out.println(n));
	System.out.println("__________________****************************___________________");
	
	//even better use method reference feature of java8
	//method reference is donated by :: (double colon) operator
	//looks similar to scope resolution operator of c++ 
	//features.forEach(System.out::println);
	}

}
