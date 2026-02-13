class Solution {
    public boolean check(int n,int sumValue,int d){
        
        
        if((n-sumValue)>=d)return true;
        
        return false;
        
        
    }
    
    
    public int sumDigits(int n){
        
        
        
        ArrayList<Integer> list=new ArrayList<>();
        
        
        while(n>0){
            
            list.add(n%10);
            n=n/10;
            
            
        }
        
        Collections.reverse(list);
        
        int sum=0;
        
        
        for(int i=0;i<list.size();i++){
            
            sum+=list.get(i);
            
            
        }
        
        return sum;
        
        
        
    }
    
    
    
    public int getCount(int n, int d) {
      
        Solution s=new Solution();
        
        int left=10;
        
        int right=n;
        
        
        
        
        int count=-1;
        
        
        while(left<=right){
            
            
            int mid=left+(right-left)/2;
            
            
            int sumValue=s.sumDigits(mid);
            
           if( s.check(mid,sumValue,d)){
               
                count=mid;
               
               
               right=mid-1;
               
              
           }
           else{
               
               left=mid+1;
               
               
           }
          
        }
        
        
        if(count==-1) return 0;
        
        
        
        return n-count+1;
       
    }
};