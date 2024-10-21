import java.util.Scanner;

public class DetermineArray {
	

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int [][] array= {{-1, 6, 2, 5}, {8, 7, 3, 4}, {9, 0, 1, 11}};
		int [][] data = { {8, 1, 0}, {7, 2}, {6, 5, 4, 9} };
		int x = array[2].length;
		int y = array.length;
		int q = array[1][2];
		int result = array[1][1]*array[0][2] + array[2][0];
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(q);
		System.out.println(result);
		System.out.println(array[1][1]+"/n");
		System.out.println(array[0][2]);
		System.out.println(array[2][0]);
		
		//System.out.println(data[1]);//row  "-"
		System.out.println(data[2][1]);
		
		
	}
	
}