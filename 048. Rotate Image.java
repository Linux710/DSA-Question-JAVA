// Rotate matrix 90 degree clockwise 

class Solution {
    public void rotate(int[][] matrix) {
        
        // transpose of matrix
        for(int i=0 ; i<matrix.length ; i++)
        {
            for(int j=i ; j<matrix[0].length ; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    
    // reverse the rows element in the matrix
    
         for(int i=0 ; i<matrix.length ; i++)
         {
             for(int j=0 ; j<matrix.length/2 ; j++) 
                 // j = matrix.length/2 because after reversing elements of first half , the second half will already been reversed by the time
             {
                 int temp = matrix[i][j];
                 matrix[i][j] = matrix[i][matrix.length-1-j];
                 matrix[i][matrix.length-1-j] = temp;
             }
         }
     }
}
