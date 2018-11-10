
// Java program to compute exponential value using (2^k) 
// -ary method. 
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class exp_sq { 
    static long N = 1000000007L; // prime modulo value 
    public static void main(String[] args) 
    { 
        long base = 5; 
        long exp = 100000; 
  
        long modulo = exponentiation(base, exp); 
        System.out.println(modulo); 
    } 
  
    static long exponentiation(long base, long exp) 
    { 
        long t = 1L; 
        while (exp > 0) { 
  
            // for cases where exponent 
            // is not an even value 
            if (exp % 2 != 0) 
                t = (t * base) % N; 
  
            base = (base * base) % N; 
            exp /= 2; 
        } 
        return t % N; 
    } 
} 