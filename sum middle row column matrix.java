
// java  program to find sum of  
// middle row and column in matrix 
  
import java.io.*; 
  
class GFG { 
      
  
static  int MAX = 100; 
  
 static void middlesum(int mat[][], int n) 
{ 
  
    int row_sum = 0, col_sum = 0; 
      
    // loop for sum of row 
    for (int i = 0; i < n; i++) 
        row_sum += mat[n / 2][i]; 
      
    System.out.println ( "Sum of middle row = "
                  + row_sum); 
      
    // loop for sum of column 
    for (int i = 0; i < n; i++) 
        col_sum += mat[i][n / 2]; 
      
    System.out.println ( "Sum of middle column = "
                 + col_sum); 
} 
  
// Driver function 
    public static void main (String[] args) { 
        int mat[][] = {{2, 5, 7}, 
                    {3, 7, 2},  
                    {5, 6, 9}}; 
      
        middlesum(mat, 3); 
      
    } 
} 