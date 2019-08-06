/*
Brandon F - 5/5/2019
Project Euler #1
find the summation of all numbers less N that are multiples of 3 and 5
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long sum = 0;
        /*
        Calculate the number of multiples that exist between 3|5 and n
		Since we are not actually counting to n we subtract it by 1
        The multiples of 15 are calculated to be removed 
        from the final summation to prevent over counting
        */
		n--;
        long three_max = n/3;
        long five_max = n/5;
        long fifthteen_max = n/15;

        /*
        Sequence formula S(n) = (n * (n+1)) / 2 sums all numbers in the set {1,n}
        this is done because the summation that we are looking for is equal to the formula
        3*S(n) + 5*S(n) - 15*S(n)
        */
        long sum_three = three_max * (three_max + 1) / 2;
        long sum_five = five_max * (five_max + 1) / 2;
        long sum_fifthteen = fifthteen_max * (fifthteen_max + 1) /2;

        sum = (long) (3*sum_three + (5*(sum_five)) - (15*sum_fifthteen) );
        
        System.out.println(sum);
    }
}
