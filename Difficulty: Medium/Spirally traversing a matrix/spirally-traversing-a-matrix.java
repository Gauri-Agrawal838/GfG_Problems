//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int r = sc.nextInt();
            int c = sc.nextInt();

            int matrix[][] = new int[r][c];

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();

            System.out.println("~");
        }
    }
}
// } Driver Code Ends




class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int matrix[][]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int top=0, bottom=matrix.length-1;
        int left=0, right=matrix[0].length-1;
        int dir = 1; //direction
        
        while(left<=right && top<=bottom)
        {
            if(dir==1)
            {
                for(int i=left;i<=right;i++)
                    list.add(matrix[top][i]);
                top++;
                dir = 2;
            }
            else if(dir==2)
            {
                for(int i=top;i<=bottom;i++)
                    list.add(matrix[i][right]);
                right--;
                dir = 3;
            }
            else if(dir==3)
            {
                for(int i=right;i>=left;i--)
                    list.add(matrix[bottom][i]);
                bottom--;
                dir = 4;
            }
            else if(dir==4)
            {
                for(int i=bottom;i>=top;i--)
                    list.add(matrix[i][left]);
                left++;
                dir = 1;
            }
        }
        return list;
    }
}
