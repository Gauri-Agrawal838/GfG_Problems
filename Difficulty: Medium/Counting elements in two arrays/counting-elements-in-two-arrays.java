class Solution {
    public static ArrayList<Integer> countLessEq(int a[], int b[]) {
        // code here
        Arrays.sort(b);
        int ln=b.length;
        // int[] fin=new int[a.length];
        //  4 8 7 5 1
        //  0 1 1 3 4 5 48 
        ArrayList<Integer> ar=new ArrayList<Integer>();
        for(int i=0;i<a.length;i++)
        {
            int val=a[i];
            int k=bs(b,val,ln);
            if(k==-1)
            {
                ar.add(0);
                continue;
            }

            ar.add(k+1);
        }
        return ar;
        
    }
    public static int bs(int b[],int v,int n)
    {
        int l=0;
        int h=n-1;
        int ans=-1;
        while(l<=h)
        {
            int m=(l+h)/2;
            if(b[m]<=v)
            {
                ans=m;
                l=m+1;
            }
            else if(b[m]>v)
            {
                h=m-1;
            }
        }
        return ans;
        
    }
}