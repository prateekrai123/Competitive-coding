/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    StringBuilder s = new StringBuilder(Integer.toBinaryString(n));
		    s = s.reverse();
		    while(s.length()<8){
		        s.append('0');
		    }
		    s = s.reverse();
		    StringBuilder s1 = new StringBuilder("");
		    for(int i=4;i<8;i++){
		        s1.append(s.charAt(i));
		    }
		    for(int i=0;i<=3;i++){
		        s1.append(s.charAt(i));
		    }
		    s1 = s1.reverse();
		    int res = 0;
		    for(int i=0;i<s1.length();i++){
		        if(s1.charAt(i)=='1'){
		            res += (int)Math.pow(2,i);
		        }
		    }
		    System.out.println(res);
		}
	}
}