
// Java program to find 
// n-th non-square number. 
import java.io.*; 
import java.util.*; 
import java.lang.*; 
  
class GFG 
{ 
      
// function to find the 
// nth Non-Square Number 
static int findNthNonSquare(int n) 
{ 
    // conversion from int to  
    // long double is necessary 
    // in order to preserve decimal  
    // places after square root. 
    double x = (double)n; 
  
    // calculating the result 
    double ans = x + Math.floor(0.5 +  
                     Math.sqrt(x)); 
  
    return (int)ans; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    // initializing 
    // the term number 
    int n = 16; 
  
    // Print the result 
    System.out.print("The " + n +  
                     "th Non-Square number is "); 
    System.out.print(findNthNonSquare(n)); 
} 
} 