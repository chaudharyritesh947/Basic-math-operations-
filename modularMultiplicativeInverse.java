
// Java program to find modular inverse  
// of a under modulo m 
import java.io.*; 
  
class GFG { 
      
    // A naive method to find modulor  
    // multiplicative inverse of 'a'  
    // under modulo 'm' 
    static int modInverse(int a, int m) 
    { 
        a = a % m; 
        for (int x = 1; x < m; x++) 
           if ((a * x) % m == 1) 
              return x; 
        return 1; 
    } 
       
    // Driver Program 
    public static void main(String args[]) 
    { 
        int a = 3, m = 11; 
        System.out.println(modInverse(a, m)); 
    } 
} 
  
  
 when m and a are coprimes .


// C++ program to find multiplicative modulo inverse using 
// Extended Euclid algorithm. 
#include<iostream> 
using namespace std; 
  
// C function for extended Euclidean Algorithm 
int gcdExtended(int a, int b, int *x, int *y); 
  
// Function to find modulo inverse of a 
void modInverse(int a, int m) 
{ 
    int x, y; 
    int g = gcdExtended(a, m, &x, &y); 
    if (g != 1) 
        cout << "Inverse doesn't exist"; 
    else
    { 
        // m is added to handle negative x 
        int res = (x%m + m) % m; 
        cout << "Modular multiplicative inverse is " << res; 
    } 
} 
  
// C function for extended Euclidean Algorithm 
int gcdExtended(int a, int b, int *x, int *y) 
{ 
    // Base Case 
    if (a == 0) 
    { 
        *x = 0, *y = 1; 
        return b; 
    } 
  
    int x1, y1; // To store results of recursive call 
    int gcd = gcdExtended(b%a, a, &x1, &y1); 
  
    // Update x and y using results of recursive 
    // call 
    *x = y1 - (b/a) * x1; 
    *y = x1; 
  
    return gcd; 
} 
  
// Driver Program 
int main() 
{ 
    int a = 3, m = 11; 
    modInverse(a, m); 
    return 0; 
} 






when m is prime .




// Java program to find modular  
// inverse of a under modulo m 
// This program works only if  
// m is prime. 
import java.io.*; 
  
class GFG { 
  
    // Function to find modular inverse of a  
    // under modulo m Assumption: m is prime 
    static void modInverse(int a, int m) 
    { 
        int g = gcd(a, m); 
        if (g != 1) 
            System.out.println("Inverse doesn't exist"); 
        else 
        { 
            // If a and m are relatively prime, then modulo inverse 
            // is a^(m-2) mode m 
            System.out.println("Modular multiplicative inverse is " + 
                                power(a, m - 2, m)); 
        } 
    } 
      
    // To compute x^y under modulo m 
    static int power(int x, int y, int m)  
    { 
        if (y == 0) 
            return 1; 
          
        int p = power(x, y / 2, m) % m; 
        p = (p * p) % m; 
      
        if (y % 2 == 0) 
            return p; 
        else
            return (x * p) % m; 
    } 
      
    // Function to return gcd of a and b 
    static int gcd(int a, int b)  
    { 
        if (a == 0) 
            return b; 
        return gcd(b % a, a); 
    } 
      
    // Driver Program 
    public static void main(String args[]) 
    { 
        int a = 3, m = 11; 
        modInverse(a, m); 
    } 
} 
  
// This code is contributed by Nikita Tiwari. 
