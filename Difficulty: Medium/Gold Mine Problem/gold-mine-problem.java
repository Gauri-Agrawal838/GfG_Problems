class Solution {
    public int maxGold(int[][] M) {
        // code here
        int n = M.length;
        int m = M[0].length;
        int arr[][] = new int[n][m];
        
        for(int j=m-1; j>=0; j--){
            for(int i=0; i<n; i++){
                if(j==m-1) arr[i][j] = M[i][j];
                else{
                    int ud = (i-1)>=0?arr[i-1][j+1]:0;
                    int r = Math.max(ud,arr[i][j+1]);
                    int ld = (i+1)<n?arr[i+1][j+1]:0;
                    int max = Math.max(r,ld);
                    
                    arr[i][j] = max + M[i][j];
                }
            }
        }
        int res = 0;
        for(int i=0; i<n; i++) res = Math.max(res,arr[i][0]);
        
        return res;
    }
}