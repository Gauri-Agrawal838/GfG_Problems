class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
                list.add(matrix[i][j]);
            }
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++)
        {
            if(i==(k-1))
                return list.get(i);
        }
        return -1;
    }
}

