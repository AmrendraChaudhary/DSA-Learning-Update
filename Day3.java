/*
Geek is very fond of patterns. Once, his teacher gave him a pattern to solve. He gave Ram an integer n and asked him to build a pattern.
Help Ram build a pattern.

Example 1:

Input: 5
Output:
    *
   ***  
  *****
 *******
*********
Example 2:

Input: 3
Output:
  *
 ***  
*****
Your Task:
You don't need to input anything. Complete the function printTriangle() which takes an integer n  as the input parameter and prints the pattern.*/
 static void pattern7(int N)
{
    // This is the outer loop which will loop for the rows.
    for (int i = 0; i < N; i++)
    {
        // For printing the spaces before stars in each row
        for (int j =0; j<N-i-1; j++)
        {
            System.out.print(" ");
        }
       
        // For printing the stars in each row
        for(int j=0;j< 2*i+1;j++){
            
            System.out.print("*");
        }
        
        // For printing the spaces after the stars in each row
         for (int j =0; j<N-i-1; j++)
        {
            System.out.print(" ");
        }
       

        // As soon as the stars for each iteration are printed, we move to the
        // next row and give a line break otherwise all stars
        // would get printed in 1 line.
        System.out.println();
    }
}