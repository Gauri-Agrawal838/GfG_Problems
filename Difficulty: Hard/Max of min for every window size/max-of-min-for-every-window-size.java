


class Solution {
    public ArrayList<Integer> maxOfMins(int[] arr) {
        // Your code here
        int[]prevsmaller=previous(arr);
        int[]nextsmaller=next(arr);
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(arr.length, 0));
        for(int i=0;i<arr.length;i++){
            int len=(nextsmaller[i]-prevsmaller[i]-1);
            ans.set(len-1,Math.max(ans.get(len-1),arr[i]));
        }
        for(int j=arr.length-2;j>=0;j--){
        ans.set(j,Math.max(ans.get(j),ans.get(j+1)));
        }
        return ans;
    }
    public static int[] previous(int[]arr){
        int[]prev=new int[arr.length];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty()&&arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                prev[i]=-1;
            }else{
                prev[i]=st.peek();
            }
            st.push(i);
        }
        return prev;
    }
    public static int[] next(int[] arr){
       int[]next=new int[arr.length];
       Stack<Integer>st=new Stack<>();
       for(int i=arr.length-1;i>=0;i--){
           while(!st.isEmpty()&&arr[st.peek()]>=arr[i]){
               st.pop();
           }
           if(st.isEmpty()){
               next[i]=arr.length;
           }else{
               next[i]=st.peek();
           }
           st.push(i);
       }
       return next;
    }
}