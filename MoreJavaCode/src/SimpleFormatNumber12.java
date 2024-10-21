
public class SimpleFormatNumber12 {
	public static void main(String[] args) {
	double dblTotal = 123654.789 ; int intValue = 27;
	String stringVal = "Brick Brack";
	System.out.printf("Total is: $%,.2f%n", dblTotal); // %n is the new-line*
//$%, formats , in the printed variable
//.2 means 2 decimal places
//%n = /n
	System.out.printf("Total: %10.2f: \n", dblTotal);
	// 10 is the total length after that put including the :
	//.2 means to 2 decimal places
	System.out.printf("%4d\n", intValue);
//total legnth = 4	
	System.out.printf("%-20.9s!\n", stringVal); // \n is the new-line
//20 the total length, and .9 in the actual variable such as stringVal
}
}