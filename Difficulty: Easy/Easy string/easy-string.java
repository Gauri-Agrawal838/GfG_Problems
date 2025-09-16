// User function Template for Java
class Solution {
    String transform(String S) {
        // code here
        S = S.toLowerCase();
        char ch[] = S.toCharArray();
        StringBuilder ans = new StringBuilder();
        int count = 1;
        for(int i=1;i<ch.length;i++)
        {
            if(ch[i]==ch[i-1])
                count++;
            else
            {
                ans.append(count).append(ch[i-1]);
                count = 1;
            }
        }
        
        ans.append(count).append(ch[ch.length-1]);
        return ans.toString();
    }
}