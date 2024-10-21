
public class GivenTolerance {
	public static void main(String[]args)[] {
		int [] x = {1, 2, 3, 4, 5, 7};

int [] y = new int[3];//length 3\
 cutUpArray(x, y);
}
public static void cutUpArray(int[] arrayToCutUp, int[] arrayToCopyTo) {
	for( int i = 0; i< arrayToCopyTo.length; i++) {
		arrayToCutUp[i] = arrayToCopyTo[i];
	}
}
}