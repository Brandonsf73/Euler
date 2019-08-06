/*
Brandon f - 8/6/2019
Find the largest prime factor of some value N
*/
import java.io.*;
import java.util.*;
import java.lang.Math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long primeFactor = in.nextLong();
        long i = 3;

        /*
	Check if the number is divisible by 2
	Even numbers are not prime so we can remove all of them now
	*/
        if(primeFactor%2 == 0)
            primeFactor = dividingByTwo(primeFactor);
        /*
        Its not possible for a number to have any factor that is larger than sqrt(N)
        No point in checking evens since they were pruned earlier so we are starting with 3 for our checks
        If modulo returns 0 we found a factor
        When a factor is found remove it from the factorization by dividing it out
        reset the values and go back up to the new square root
        When we reach a square root without finding a new factor to remove we found the largest prime
        */
        long max = (long) Math.sqrt(primeFactor);

        while(i <= max){
            if(primeFactor%i == 0)
            {
                primeFactor = primeFactor/i;
                i = 1;
                max = (long) Math.sqrt(primeFactor);
            }
            i += 2;
        }
        System.out.println(primeFactor);
    }

    static long dividingByTwo(long n){
        if(n == 2 | n == 1)
            return 1;
        else if(n%2 == 0)
            return (dividingByTwo(n/2));
        else
            return n;
    }
}

