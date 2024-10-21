
//

//General java syntax rules
//---Brackets and class methods set up
//Identify and correct syntax errors.
//-----missing semicolons, brackets, make sure functions are typed correctly.


//Enhanced for-loop: show how to print every element in a type-int array using an
//enhanded for-loop.


enhanced for loop	traditional for loop
int[] scores = {99, 75, 82};
int sum = 0; // running total

for (int value : scores)
{
   System.out.print(value + " ");
   sum += value;
}

System.out.println(sum);

//-------------------------Another enhanced loop

int[] scores = {99, 75, 82};

for (int value : scores)
{
   System.out.print(value + " ");
}