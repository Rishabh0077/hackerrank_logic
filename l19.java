import java.io.*;Consider an algorithm that takes as input a positive integer n. If n is even, the algorithm divides it by two, and if n is odd, the algorithm multiplies it by three and adds one. The algorithm repeats this, until n is one. For example, the sequence for n=3 is as follows:

    3→10→5→16→8→4→2→1

Our task is to simulate the execution of the algorithm for a given value of n.

Input Format

The only input line contains an integer n.

Constraints

    1≤n≤10^6

Output Format

The only input line contains an integer n.

Sample Input 0

3

Sample Output 0

3 10 5 16 8 4 2 1

Sample Input 1

5

Sample Output 1

5 16 8 4 2 1 


import java.util.*;

public class Solution {

    public static void main(String[] args) {
        long n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        //int arr[]=new int[n];
        System.out.print(n+" ");
        while(n!=1){
        if(n%2==0){
            n=n/2;
            System.out.print(n+" ");
        }
        else{
            n=3*n+1;
            System.out.print(n+" ");
        }
    }
         
}
}    

