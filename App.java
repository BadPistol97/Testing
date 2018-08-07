public class App{
	
	public static void main(String [] agrs) {
		
		Machine mach1 = new Machine();
		
		mach1.start();
		
		Person person1 = new Person("Bob");
		person1.greet();
		
		Info info1 = new Machine();
		// okay because Machine class implements Info interface
		// variable of type Info pointing to an object of type Machine
		
		info1.showInfo();
		
		Info info2 = person1;
		info2.showInfo();
		
		output_info(mach1);
		output_info(person1);
		
	}
	
	private static void output_info(Info info) {
		
		info.showInfo();
	}
}