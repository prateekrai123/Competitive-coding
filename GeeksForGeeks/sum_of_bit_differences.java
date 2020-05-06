/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int a[] = new int[n];
		    for(int i=0;i<n;i++){
		        int temp = sc.nextInt();
		        a[i] = Integer.parseInt(Integer.toBinaryString(temp));
		    }
		    int count = 0;
		    for(int i=1;i<n;i++){
		        for(int j=0;j<=i;j++) {
		            if(i==j)
		                continue;
		        	StringBuilder s1 = new StringBuilder("");
			        StringBuilder s2 = new StringBuilder("");
			        int temp = 8-String.valueOf(a[i]).length();
			        for(int j1=0;j1<temp;j1++){
			            s1.append("0");
			        }
			        s1.append(a[i]);
			        temp = 8-String.valueOf(a[j]).length();
			        for(int j1=0;j1<temp;j1++){
			            s2.append("0");
			        }
			        s2.append(a[j]);
			        for(int k=0;k<s1.length();k++){
			            if(s1.charAt(k)!=s2.charAt(k)){
			                count++;
			            }
			        }
		        }
		    }
		    System.out.println(count*2);
		}
	}
}