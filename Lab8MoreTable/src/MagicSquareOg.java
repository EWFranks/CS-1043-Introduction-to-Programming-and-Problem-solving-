import java.lang.reflect.Array;

public class MagicSquare {
	public static void main(String[] args) {
		int array2D[][]= {{2,7,6}, {9,5,1}, {4,3,8}};
	
	if(isItSquare(array2D)) {
			System.out.print("True");
	}else
			System.out.print("False");
	}
	

   // Example stub:
	public static boolean isItSquare( int [][] array2D ) {
		for (int row = 0; row<array2D.length; row++) {
			if (array2D[row].length!= array2D.length) {
				return false;
				
			}
		}
		return true;
	}
	
	public static int sumColumn(int array2D[][], int large) {
		int sum = 0;
		for (int row = 0; row<array2D.length; row++) {
			sum += array2D[row][large];
		}
		return sum;
	}

	public static int sumDiagonal(int array2D[][], boolean size) {
		int sum = 0;
		if(size==true){
			for (int i=0; i<array2D.length; i++) {
				sum+=array2D[i][i];
			}
}
else {
	for (int i=0; i<array2D.length; i++) {
		sum+=array2D[i][array2D.length-i-1];
	}
}
return sum;
	}

	
	public static int sumRow(int[][]array2D,int sumArray) {
		int sum = 0;
		for ( int row = 0; row<array2D[sumArray].length; row++) {
			sum+=array2D[sumArray][row];
		}
		return sum;
	}
	
	// Enter these stubs FIRST! : sumDiagonal, sumRowI, sumColumnJ, hasNumber.
	public static boolean hasNumber(int[][]array2D,int number) {
		boolean found=false;
		for ( int row = 0; row<Array.getLength( row++);) {
			for (int column=0; column<array2D[row].length; column++) {
			if(array2D[row][column]==number) {
				found = true;
			}
				
			}
			}
		return found;
		}
	}