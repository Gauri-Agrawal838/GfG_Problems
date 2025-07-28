class Solution {
    public static int balanceSums(int[][] matrix) {
        // code here
        int n = matrix.length;
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                sum += matrix[i][j];
        }
        
        int rsmax = 0;
        int csmax = 0;
        
        for(int i=0;i<n;i++)
        {
            int rs = 0;
            int cs = 0;
            
            for(int j=0;j<n;j++)
            {
                rs += matrix[i][j];
                cs += matrix[j][i];
            }
            
            rsmax = Math.max(rsmax,rs);
            csmax = Math.max(csmax, cs);
        }
        int max = Math.max(rsmax,csmax);
        int ans = (max*n) - sum;
        return ans;
    }
}