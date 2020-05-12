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
		    boolean isBleak = true;
		    for(int i=n-1;i>=0;i--){
		        String s = Integer.toBinaryString(i);
		        if(s.length()+i<n){
		            isBleak = true;
		            break;
		        }
		        else{
		            int count = 0;
		            for(int j=0;j<s.length();j++){
		                if(s.charAt(j)=='1'){
		                    count++;
		                }
		            }
		            if((count+i)==n){
		                isBleak = false;
		                break;
		            }
		        }
		    }
		    if(isBleak){
		        System.out.println("1");
		    }else{
		        System.out.println("0");
		    }
		}
	}
}