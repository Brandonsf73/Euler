/*
Brandon F - 08/07/2019
Project Euler Solution #8

*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        Queue<Long> q = new LinkedList<>();
        int n = in.nextInt();
        int k = in.nextInt();
        String num = in.next();

        long product = 1;
        long max = 0;
        q.clear();
        for(int i = 0; i < n; i++)
        {
            long lastchar = (long) Character.getNumericValue(num.charAt(i));
            if(lastchar == 0)
            {
                /*
                Once a zero is found the buffer has to be reset since 
                all values in range of the zero will be zeroed-out
                */
                q.clear();
                product = 1;
            }
            else if(q.size() < k)
            {
                product *= lastchar;
                q.add(lastchar);
		//Catch fringe cases were the an exact
                if(q.size() == k && product > max)
                    max = product;
            }
            else
            {
                /*
                For each new character found we should multiple the product
                by its value and add that value to the buffer, also remove
                the last value in the buffer
                */
                product /= q.remove();
                product *= lastchar;
                q.add(lastchar);
                if(product > max)
                    max = product;
            }
        }
        System.out.println(max);
        }
    }
}

