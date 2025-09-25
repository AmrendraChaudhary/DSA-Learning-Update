/*
Geek is very fond of patterns. Once, his teacher gave him a  pattern to solve. He gave Geek an integer n and asked him to build a pattern.

Help Geek to build a pattern.

 

Example 1:

Input: 5

Output:

*********
 *******
  *****
   ***
    *

Your Task:

You don't need to input anything. Complete the function printTriangle() which takes  an integer n  as the input parameter and print the pattern.

Constraints:

1<= N <= 20
*/

class Solution {

    void printTriangle(int n) {
        // code here
    for(int i=1; i<=n;i++){
        for(int j=0;j<i-1;j++){
            System.out.print(" ");
        }
        for(int k=0;k<2*n-2*i+1;k++){
            System.out.print("*");
        }
        
        
        System.out.println();
    }
    
    }
}

/*
Problem statement
Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the N-Star Diamond.

Example:
Input: ‘N’ = 3

Output: 

  *
 ***
*****
*****
 ***
  *
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1  <= N <= 20
Time Limit: 1 sec
Sample Input 1:
3
Sample Output 1:
  *
 ***
*****
*****
 ***
  *    
Sample Input 2 :
1
Sample Output 2 :
*
*
*/

public class Solution {
    public static void nStarDiamond(int n) {
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }
        for(int j=0;j<2*i+1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=n-1;i>=0;i--){
          for(int k=0;k<n-i-1;k++){
              System.out.print(" ");
          }
          for(int j=0;j<2*i+1;j++){
            System.out.print("*");  
          }
       System.out.println();   
      } 
}
}