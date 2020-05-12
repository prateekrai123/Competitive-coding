/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<>();
		for(int i=1;i<=1000000;i+=2){
		    a.add(i);
		}
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int x = n;
		    int sum = 0;
		    while(n>0){
		        n /= 2;
		        sum++;
		    }
		    int temp = (int)(x-Math.pow(2,sum-1));
		    System.out.println(a.get(temp));
		}
	}
}