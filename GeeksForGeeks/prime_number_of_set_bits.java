/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> prime = new ArrayList<>();
		boolean b[] = new boolean[100];
		for(int i=0;i<b.length;i++){
		    b[i] = true;
		}
		for(int i=2;i*i<=99;i++){
		    if(b[i]){
		        for(int j=i*i;j<=99;j+=i){
		            b[j] = false;
		        }
		    }
		}
		for(int i=2;i<=99;i++){
		    if(b[i]){
		        prime.add(i);
		    }
		}
		int t = sc.nextInt();
		while(t-->0){
		    int res = 0;
		    int l = sc.nextInt();
		    int r = sc.nextInt();
		    for(int i=l;i<=r;i++){
		        int count = 0;
		        String s = Integer.toBinaryString(i);
		        for(int j=0;j<s.length();j++){
		            if(s.charAt(j)=='1'){
		                count++;
		            }
		        }
		        if(prime.contains(count)){
		            res++;
		        }
		    }
		    System.out.println(res);
		}
	}
}