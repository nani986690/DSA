import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int [] arr={0,1,0,1,0,1,1,1,1,1};
	    int maxcount=0;
	    int count=1;
	    for(int i=1;i<arr.length;i++){
	        if(arr[i]==arr[i-1]){
	            count++;
	        }
	        else{
	             maxcount = Math.max(maxcount, count);
	                count = 1;
	        }
	    }
	    maxcount = Math.max(maxcount, count);
	    System.out.println(maxcount);
	}
}
