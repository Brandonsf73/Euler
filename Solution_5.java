/*
Brandon F - 8/6/2019
Project Euler #5
Find the smaller number that is divisible by all values less than N.
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int product = 1;

        /*
        Generate a list of factors that range from {0,N}
        For each value i remove all factors that are already in the list by dividing them out
        Multiple the entire list together to get the final product
        */
        ArrayList<Integer> primeList = new ArrayList<Integer>();
        for(int i = 1; i <= n; i++)
        {
            int k = i;
            for(int j = 0; j < primeList.size(); j++)
            {
                if(k%primeList.get(j) == 0)
                    k /= primeList.get(j);
            }
            primeList.add(k);
            product *= k;
        }
        System.out.println(product);
    }
}
