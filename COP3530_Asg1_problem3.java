/*
 * Purpose/Description: This program is to perform x^n
 *       using a sublinear recursive algorithm.
 */
package cop3530_asg1_problem3;
import java.util.*;
/**
 *
 * @author Can 
 */
public class COP3530_Asg1_problem3 {

    /**
     * 
     * @param x : the base
     * @param n : the exponent
     * @return  : x^n, using recursion
     */
    public static long exponentiation(long x, int n){
        //base case; anything to the zeroth power is '1'
        if (n == 0){
            return 1;
        }
        //recursion, divide by 2 every step
         long div = exponentiation(x, n/2);
        if (n%2 == 0){                           //if n is divisible by 2  
            return div*div;                     
        }
        else{                                    //if n isn't divisible by 2
            return x*div*div;
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //scanner object to read inputs
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter two numbers to find x^n:");
        
        
        //scan for two values to be entered
        int x = sc.nextInt();
        int n = sc.nextInt();
        
        
        
        exponentiation(x,n);                          //perform function
        
        System.out.println(exponentiation(x,n));      //print value
    }
    
}
