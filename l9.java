Today we're expanding our knowledge of Strings and combining it with what we've already learned about loops. Check out the Tutorial tab for learning materials and an instructional video!

Task
Given a string, , of length  that is indexed from  to , print its even-indexed and odd-indexed characters as  space-separated strings on a single line (see the Sample below for more detail).

Note:  is considered to be an even index.

Input Format

The first line contains an integer,  (the number of test cases).
Each line  of the  subsequent lines contain a String, .

Constraints

Output Format

For each String  (where ), print 's even-indexed characters, followed by a space, followed by 's odd-indexed characters.

Sample Input

2
Hacker
Rank
Sample Output

Hce akr
Rn ak


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int n;
        String s;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            s=sc.next();
            for(int j=0;j<s.length();j++){
                if(j%2==0){
                    System.out.print(s.charAt(j));
                }
            
            }
            System.out.print(" ");
            for(int j=0;j<s.length();j++){
                if(j%2==1){
                    System.out.print(s.charAt(j));
                }
            
            }
            System.out.println("");
        }
    }
}
