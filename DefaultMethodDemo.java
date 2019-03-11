interface TestInterface
{
	//abstract void
	public void square (int a);
	
	//default method
	default void show()
	{
		System.out.println("Default method executed");
	}
	//static method
	static void show1() {
		System.out.println("Static method Executed");
	}
}
public class DefaultMethodDemo implements TestInterface{

	public void square(int a)  {
		System.out.println(a*a);
		}
	
	public static void main(String [] args) {
		DefaultMethodDemo d = new DefaultMethodDemo();
		d.square(4);
		
		//default method executed
		d.show();
		
		//static method executed
		TestInterface.show1();
	}

}
