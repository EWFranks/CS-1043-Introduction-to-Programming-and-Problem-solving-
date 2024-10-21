
public class Methods {
	public static void main(String[] args) {
		String[] myStringArray;// declaring an array
		myStringArray = new String[] { "a", "b", "c" };// initialize an array.

		int array2D[][] = { { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } };// initialize and array with braces

		// index through an array with[i][j]
		// [i.length] is the length of the row
		//

		class Main {
			public boolean check(int n1, int n2, int l, int r) {

				if (l <= n1 && n1 <= r)
					if (l <= n2 && n2 <= r)
						return true;// means numbers are in given tolerance
				return false;
			}

			// b
			public int min(int a[]) {
				int m = a[0];
				for (int i = 0; i < a.length; i++)// finding min
					if (a[i] < m)
						m = a[i];
				return m;

			}

			// c
			public int max(int a[]) {
				int m = 0;
				for (int i = 0; i < a.length; i++)// finding max index
					if (a[m] < a[i])
						m = i;
				return m;

			}

			// d
			public int count(int a[], int t) {
				int m = 0;// count
				for (int i = 0; i < a.length; i++)
					if (a[i] == t)
						m++;
				return m;// returning count

			}

			// e
			public double mean(int a[]) {
				double m = 0;
				for (int i = 0; i < a.length; i++)// finding mean
					m = m + a[i];
				return m / a.length;

			}

			// f
			public int count_greater(int a[], int t) {
				int m = 0;// count
				for (int i = 0; i < a.length; i++)
					if (t < a[i])
						m++;
				return m;// returning count

			}// g

			public void change_length(int a[]) {
				int m[] = new int[a.length * 2];
				for (int i = 0; i < a.length; i++)
					m[i] = a[i];
				a = m;

			}

			// h
			public int[] sum_rows(int a[][]) {
				int m[] = new int[a.length];
				for (int i = 0; i < a.length; i++) {
					int s = 0;
					for (int j = 0; j < a[0].length; j++)
						s = s + a[i][j];

					m[i] = s;
				}
				return m;
			}
			// i

			public int search(int a[], int t) {

				for (int i = 0; i < a.length; i++)
					if (a[i] == t)
						return i;
				;
				return -1;
			}

			// j
			public int sum_diagonal(int a[][]) {
				int s = 0;
				for (int i = 0; i < a.length; i++) {
					s = s + a[i][i];
				}
				return s;
			}
			public int minorDiagonal(int[][] array){
			    int k = 0, j = 0;
			    int sumMinD = 0;
			     k = array.length - 1;
			    for ( j = 0, k = 0; j <= array.length && k >= 0; j++, k--) {
			            sumMinD += array[j][k];

			    }
			return sumMinD;
			}
		}
	}
}
