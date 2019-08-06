/*
Brandon F - 8/6/2019
Project Euler #2
Find the sum of all even number in the Fibonacci sequence that are less than the value n
*/
import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
	
      Scanner in = new Scanner(System.in);
		  long n = in.nextLong();
			
		  /*
		  Rotating 3 slot buffer.
  		Calculating each unique Fibonacci number is recursive and is O(N^2)
  		Instead store the last two values in a buffer, since they will never change
  		Initalize the buffer with the first two values Fibonacci values F(0) = 1 and F(1) = 1
  		*/
  		long[] buffer = {0, 1, 1};
  		int j = 0, k = 1, l = 2;
  		
  		/*
  		Calculate the actual value by rotating through the buffer using the module operator
  		Once the Fibonacci values exceed the value stored in the last used buffer, stop
  		*/
  		long sum = 0;
  		
  		while(true) {
  		
        buffer[j%3] = buffer[k%3] + buffer[l%3];
        if(buffer[j%3] > n)
          break;
  			 //add the value to the sum if the last calculated value was even
        else if (buffer[j%3]%2 == 0)
          sum += buffer[j%3];
        //Increment the counters
  			j++;k++;l++;
  		}
  		System.out.println(sum);
    }
}
