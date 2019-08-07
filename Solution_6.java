/*
Brandon F - 8/6/2019
Project Euler #6
For the given value of N find the difference between the summation of squares and the summation of series squared
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();

        /*
        Summation of squares formula is 
        S(n) = (n * (n+1) * (2n+1)) / 6
        */
        long sumOfSquares = (n * (n+1) * (2*n+1) / 6);
        /*
        Summation of series formula is
        S(n) = (n * (n+1)) / 2
        */
        long sumOfSeries = (((n*(n+1))/2) * ((n*(n+1))/2));
        
        long diff = sumOfSeries - sumOfSquares;

        System.out.println(diff);
    }
}

