/*
Geek is very fond of patterns. Once, his teacher gave him a pattern to solve. He gave Geek an integer n and asked him to build a pattern.

Help Geek build a star pattern.

Example 1:

Input: 5
Output:
* * * * *
* * * * 
* * * 
* *  
* 
Example 2:

Input: 3
Output:
* * * 
* *  
* 

*/
class Solution {

    void printTriangle(int n) {
        // code here
        for(int i = 0; i<n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print("* ");
                if(j==1)
                System.out.println();
            }
        }
    }
}

/*
Geek is very fond of patterns. Once, his teacher gave him a  pattern to solve. He gave Geek an integer n and asked him to build a pattern.

Help Geek to build a pattern.

 

Example 1:

Input: 5

Output:
1 2 3 4 5
1 2 3 4
1 2 3 
1 2  
1 

 

Your Task:

You don't need to input anything. Complete the function printTriangle() which takes  an integer n  as the input parameter and print the pattern.
*/
class Solution {

    void printTriangle(int n) {
        // code here
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j+" ");
                if(j==n-i)
                System.out.println();
            }
        }
    }
}