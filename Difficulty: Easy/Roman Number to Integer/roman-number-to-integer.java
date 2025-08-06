

// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);
        
        int n = str.length();
        
        int res = hm.get(str.charAt(n-1));
        
        //Example : MMCXLIV
        
        for(int i=n-2;i>=0;i--)
        {
            int curr = hm.get(str.charAt(i));
            int last = hm.get(str.charAt(i+1));
            
            if(curr<last)
                res -= curr;
            else
                res += curr;
        }
        return res;
    }
}