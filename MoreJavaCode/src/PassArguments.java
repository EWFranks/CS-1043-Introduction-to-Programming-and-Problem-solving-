
public class PassArguments {
	public static void main ( String[] args ) {
		int[] a = { 64 };
		int [] b = { 32 };
		int c = 88 ;
		int d = 77 ;
		confused ( a, c, b, d );
		//System.out.print( a[0] + "," + b[0] + "," + c + "," + d );
		// a[0] = ,b[0] = ,c = ,d =
		}
		public static void confused( int [] c, int d, int [] a, int b ) {
		System.out.println(a[0] = 1);
		System.out.println(c[0] = 2);
		System.out.println(d = a[0]*d + c[0]);
		System.out.println(b = d + c[0]*d);
		int q = d + c[0]*d;
		System.out.println(q);
		}
}
