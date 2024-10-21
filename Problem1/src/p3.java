public static void main(String[] args) {
Scanner console = new Scanner(System.in);
System.out.println("What is the file name?");
String filename = console.nextLine();

int[][] gradesArray = Lab10Tools.fromFile(filename);

console.close();

int[] students = calcTotalStudents(gradesArray);
double[][] percentage = calcPCT(gradesArray, students);
double[] average = calcAveragePercent(percentage, gradesArray);

System.out.printf("%25s%s%18s%s\n"," ", "Grades", " ", "# students");
System.out.printf("%6s%8s%8s%8s%8s%8s\n"," Course", "A", "B", "C", "D", "F");
for (int i = 0; i < gradesArray.length; i++) {
System.out.printf("\n");
if(i < 9)
System.out.printf("%6s", " Course"+(i+1));
else
System.out.printf("%6s", " Course"+(i+1));
for (int j = 0; j < gradesArray[i].length; j++) {
System.out.printf("%8s",gradesArray[i][j]);
}
System.out.printf("%8s",students[i]);
}
System.out.printf("\n");
System.out.printf("%6s", " Avg%");
for (int i = 0; i < 5; i++) {
String a = "%9s";
if(i == 0)
a = "%11s";
if(i == 4)
a = "%6s";
System.out.printf(a,average[i]);
}
}
