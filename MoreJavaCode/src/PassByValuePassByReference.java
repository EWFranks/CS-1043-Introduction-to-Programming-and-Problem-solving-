
public class PassByValuePassByReference {
	public static void main ( String[] args ) {
		int[] a = { 64 };
		int [] b = { 32 };
		int c = 88 ;
		int d = 77 ;
		confused ( a, c, b, d );
		System.out.print( a[0] + "," + b[0] + "," + c + "," + d );
		// a[0] = ,b[0] = ,c = ,d =
		}
		public static void confused( int [] c, int d, int [] a, int b ) {
		a[0] = 1;
		c[0] = 2;
		d = a[0]*d + c[0];
		b = d + c[0]*d;
		}
}
