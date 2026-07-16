import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int [] arr={1,2,0,4,0,3,5};
	   int index=0;
	   for(int i=0;i<arr.length;i++){
	       if(arr[i]!=0){
	       int temp=arr[index];
	       arr[index]=arr[i];
	       arr[i]=temp;
	       index ++;
	       }
	   }
	   System.out.println(Arrays.toString(arr));
	}
}
