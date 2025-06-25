

//User function Template for Java

class Solution {
    boolean sameFreq(String s) {
        // code here
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char x = s.charAt(i);
            hm.put(x, hm.getOrDefault(x,0)+1);
        }
        
        int max = Integer.MIN_VALUE;
        int maxCount = 0;
        int minCount = 0;
        int min = Integer.MAX_VALUE;
        for(Map.Entry<Character,Integer> entry : hm.entrySet())
        {
            max = Math.max(max,entry.getValue());
            min = Math.min(min,entry.getValue());
        }
        
        for(Map.Entry<Character,Integer> entry : hm.entrySet())
        {
            if(max==entry.getValue())
                maxCount++;
            if(min==entry.getValue())
                minCount++;
        }
        if((max==min) || (max-min==1 && maxCount==1))
            return true;
        if(min==1 && minCount==1 && (maxCount+minCount==hm.size()))
            return true;
        return false;
    }
}