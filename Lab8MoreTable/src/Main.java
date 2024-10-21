
public class Main {
public static void main(String[] args) {

	int array[][]={{1,2,3},{4,5,6},{7,8,9}};

	System.out.println(isItSquare(array));
	System.out.println(hasNumber(array,6));
	System.out.println(sumRowI(array,2));
	System.out.println(sumColumnJ(array,1));
	System.out.println(sumDiagonal(array,false)); 
	
	 public static boolean isItSquare(int[][] mSquare) {

        if (mSquare == null || mSquare.length == 0) return false;
        for (int i = 0; i < mSquare.length; i++) {
            if (mSquare[i].length != mSquare.length) return false;
        }
        return true;
    }

    public static int sumDiagonal(int[][] mSquare, boolean flag) {

        int forwardTotal = 0;
        int backwardTotal = 0;

        for (int i = 0; i < mSquare.length; i++) {
            forwardTotal += mSquare[i][i];
            backwardTotal += mSquare[i][mSquare.length - i - 1];
        }
        return flag ? forwardTotal : backwardTotal;
    }

      // have assumed the index will start from 1 onwards and not from 0
     // so if we want to find the sum of row 1, then index passed will be 1 and not 0
    public static int sumRowI(int[][] mSquare, int index) {
        int total = 0;
        for (int i = 0; i < mSquare.length; i++) {
            total += mSquare[index - 1][i];
        }
        return total;

    }

// have assumed the index will start from 1 onwards and not from 0
  // so if we want to find the sum of column 1, then index passed will be 1 and not 0
    public static int sumColumnJ(int[][] mSquare, int index) {
        int total = 0;
        for (int i = 0; i < mSquare.length; i++) {
            total += mSquare[i][index - 1];
        }
        return total;
    }

    public boolean hasNumber(int[][] mSquare, int value) {

        for (int i = 0; i < mSquare.length; i++) {
            for (int j = 0; j < mSquare[i].length; j++) {
                if (mSquare[i][j] == value) return true;
            }
        }
        return false;
    }
}
