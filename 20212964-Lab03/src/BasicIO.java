import java.util.*;

// An exploration of basic input and output.
class BasicIO {
	// Reads and processes string input.
	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		// get first input
		System.out.print("Enter your name: ");
		String name = stdin.nextLine();
		
		// get second input
		System.out.print("Enter your years: ");
		int years = stdin.nextInt();
		
		//get third input
		System.out.print("Enter your height: ");
		int height = stdin.nextInt();
		
		// display output on console
		System.out.println("your name is " + name);
		
		// date
		System.out.printf("%1$tY년 %1$tB월 %1$te일 현재 " + name + "(" + years + ")의 키는 " + height + "cm 입니다.\n", new Date());
		
		// day count
		System.out.println(years * 365);
	} // method main
	
} // class BASIC_IO