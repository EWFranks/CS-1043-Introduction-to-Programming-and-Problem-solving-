import java.util.Scanner;

public class Second {

		public static void main(String[] args) {
			Scanner console = new Scanner(System.in);
			System.out.println("What is the file name?");
			String filename = console.nextLine();

			int[][] gradesArray = Lab10Tools.fromFile(filename);

			console.close();

			int[] students = calcTotalStudents(gradesArray);
			double[][] percentage = calcPCT(gradesArray, students);
			double[] average = calcAveragePercent(percentage, gradesArray);
			
			String ans = String.format("%25s%s%18s%s"," ", "Grades", " ", "# students");
			ans += "\n";
			System.out.println("--------------------------------------------------------------");
			ans += String.format("%6s%8s%8s%8s%8s%8s","  Course", "A", "B", "C", "D", "F");
			
			for (int i = 0; i < gradesArray.length; i++) {
				ans += "\n";
				if(i < 9)
					ans += String.format("%6s", "  Course"+(i+1));
				else
					ans += String.format("%6s", " Course"+(i+1));
				for (int j = 0; j < gradesArray[i].length; j++) {
					ans += String.format("%8s",gradesArray[i][j]);
				}
				ans += String.format("%8s",students[i]);

			}
			ans += "\n";
			ans += String.format("%6s", "  Avg%");
			for (int i = 0; i < 5; i++) {
				String a = "%9s";
				if(i == 0)
					a = "%11s";
				if(i == 4)
					a = "%6s";
				ans += String.format(a,average[i]);
			}
			System.out.println(ans);
			System.out.println("--------------------------------------------------------------");
		}

		public static int[] calcTotalStudents(int[][] gradesArray) {
			int rtotal = 0;

			int[] student = new int[gradesArray.length];
			for (int i = 0; i < gradesArray.length; i++) {
			rtotal = 0;
			for (int j = 0; j < gradesArray[i].length; j++) {
			rtotal = rtotal + gradesArray[i][j];
			}
			student[i] = rtotal;
			}
			return student;
			}

		public static double[][] calcPCT(int[][] gradesArray, int[] N) {
			
			double[][] pct = new double[gradesArray.length][5];
			for (int i = 0; i < gradesArray.length; i++) {
				for (int j = 0; j < gradesArray[i].length; j++) {
					pct[i][j] = 100 * gradesArray[i][j] / N[i];
				}
			}
			return pct;
		}

		public static double[] calcAveragePercent(double[][] pct, int[][] gradeArray) {

			double[] average = new double[5];
			double sum;
			for (int i = 0; i < 5; i++) {
				sum = 0.0;
				for (int j = 0; j < gradeArray.length; j++) {
					sum += pct[j][i];
				}
				average[i] = sum / gradeArray.length;
			}
			return average;
		}	
	}
