

//User function Template for Java

class Solution {
    static int substrCount(String s, int K) {
        // code here
        int count = 0;
        int[] map = new int[256];
        int ans = 0, i = 0;
        
        for(; i < K; i++){
            char c = s.charAt(i);
            
            if(map[c] == 0){
                count++;
            }
            map[c]++;
        }
        
        if(count == K-1) ans++;
        
        for(; i < s.length(); i++){
            char c = s.charAt(i);
            char r = s.charAt(i - K);
            if(map[c]++ == 0) count++;
            
            if(map[r]-- == 1) count--;
            
            if(count == (K-1)) ans++;
        }
        return ans;
    }
};