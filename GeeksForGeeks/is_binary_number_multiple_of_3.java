/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    String s = sc.next();
		    int even = 0,odd=0;
		    for(int i=0;i<s.length();i++){
		        if((i)%2==0){
		            if(s.charAt(i)=='1'){
		                even++;
		            }
		        }
		        else{
		            if(s.charAt(i)=='1'){
		                odd++;
		            }
		        }
		    }
		    if(Math.abs(even-odd)%3==0){
		        System.out.println(1);
		    }
		    else{
		        System.out.println(0);
		    }
		}
	}
}