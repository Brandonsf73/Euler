/*
Brandon F - 8/6/2019
Project Euler Problem #3
Given a value N, find the largest Palindrome that is the product of integer numbers
*/
import java.io.*;
import java.util.*;
import java.lang.Math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	String s;
	int max = 0;
	int sq = (int) Math.sqrt(n);
	int j;
	
	/*
	find a product of i and j, convert it to s string and reverse it, see if its equal
	If it is and its greater than the last maximum we found set that as the new Max
	Some Optimizations:
		both i and j will start at 100 since the smallest value we want is a 3 digit numbers
		i will never exceed the square root of our limit since only one value can be larger than the square root of N
		j will be set to the max/i each time to prune away un-needed repetitions
	*/
	for(int i = 100; i <= sq; i++)
	{
		if(max == 0)
			j = 100;
		else
			j = max/i;
		
		for(; j <= 999; j++)
		{
			Integer k = i*j;
			if(k >= n)
				break;
			s = k.toString();
			StringBuilder sb = new StringBuilder(s);
			if( s.equals(sb.reverse().toString()) && max < k)
				max = k;
		}
	}
	System.out.println(max);
    }
}

