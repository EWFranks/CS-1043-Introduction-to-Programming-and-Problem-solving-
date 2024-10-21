
public class SwappingValues {
	public static void main(String[] args) {
	int a = Integer.MAX_VALUE;
	int b = Integer.MIN_VALUE;

	System.out.println(a);
	System.out.println(b);

	a = (a + b) - (b = a);

	System.out.println(a);
	System.out.println(b);
	
}
}