import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int []prices={7,2,3,8,9};
		int minPrice=prices[0];
		int maxProfit = 0;
	for(int i=1;i<prices.length;i++){
	    if(prices[i]<minPrice){
	        minPrice=prices[i];
	    }
	      int profit = prices[i] - minPrice;
	       maxProfit = Math.max(maxProfit, profit);
	}
System.out.println(maxProfit);
	}
}
