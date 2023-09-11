//{ Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}
// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
	public static int palinArray(int[] a, int n)
    {
           //add code here.
        for(int i=0;i<n;i++)
        {
            if(checkPalin(a[i])==false)
                return 0;
        }
        return 1;
    }
    
    static boolean checkPalin(int val)
    {
        int m = val;
        int rev = 0;
        while(m>0)
        {
            int rem = m%10;
            rev = (rev*10) + rem;
            m /= 10;
        }
        if(rev==val)
            return true;
        return false;
    }
}