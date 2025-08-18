class Solution {
    public int hIndex(int[] citations) {
        // code here
        Arrays.sort(citations);
        int H=0;;
       
        for(int i=0;i<citations.length;i++){
            int h=citations.length-i;
            if(citations[i]>=h){
                H++;
            }
        }
        return H;
    }
}