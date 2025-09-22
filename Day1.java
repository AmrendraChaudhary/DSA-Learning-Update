// PROBLEM 1st

/*Geek is very fond of patterns. Once, 
his teacher gave him a square pattern to solve. 
He gave Geek an integer n and asked him to build a pattern.
Input:
n = 3
Output:
* * *
* * *
* * *

Input:
n = 5
Output:
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *

*/
class Solution {

    void printSquare(int n) {
        // code here
        for(int i=0;i<n;i++){
            for (int j= 0;j<n;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}


// PROBLEM 2nd

/*Geek is very fond of patterns. Once,
 his teacher gave him a pattern of triangle to solve. 
 He gave Geek an integer n and asked him to build a pattern.
Help Geek to build a triangle pattern using stars(*).

Example 1:

Input:
n = 5
Output:
* 
* * 
* * * 
* * * * 
* * * * *
Example 2:

Input: 
n = 6
Output:
* 
* * 
* * * 
* * * * 
* * * * *
* * * * * *

*/

class Solution {

    void printTriangle(int n) {
        // code here
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
                if(j==i)
                  System.out.println("");
            }
        }
    }
}


// PROBLEM 3rd

/*
Geek is very fond of patterns. Once, 
his teacher gave him a  pattern to solve. 
He gave Geek an integer n and asked him to build a pattern.
Help Geek to build a pattern.

Example 1:

Input: 5
Output:
1
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5
Example 2:

Input: 3
Output:
1
1 2 
1 2 3 
Your Task:

You don't need to input anything. Complete the function printTriangle() which takes an integer n  as the input parameter and prints the pattern.

Expected Time Complexity: O(n2).
Expected Auxiliary Space: O(1).

Constraints:
1<= n <= 100
*/

class Solution {

    void printTriangle(int n) {
        // code here
        for(int i=1; i<=n; i++){
           for(int j=1;j<=i;j++){
               System.out.print(j+" ");
               if(j==i)
               System.out.println("");
           } 
        }
    }
}

// PROBLEM 4th

/*
Geek is very fond of patterns. Once,
his teacher gave him a  pattern to solve. 
He gave Geek an integer n and asked him to build a pattern.
Help Geek to build a pattern.


Example 1:

Input: 5

Output:
1
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5


Your Task:

You don't need to input anything.Complete the function printTriangle() which takes  an integer n  as the input parameter and print the pattern.

Constraints:

1<= N <= 20
*/

class Solution {

    void printTriangle(int n) {
        // code here
        if(n>=1 && n<=20){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(i+" ");
                    if(j==i)
                    System.out.println("");
                }
            }
        }
    }
}