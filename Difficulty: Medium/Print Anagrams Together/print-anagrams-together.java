//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends
class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] str) {
        // code here
        int n=str.length;
        HashMap<String,ArrayList<String>> hm=new HashMap<>();
        ArrayList<ArrayList<String>> list=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            char [] ch=str[i].toCharArray();
            Arrays.sort(ch);
            String temp=new String(ch);
            if(hm.containsKey(temp)){
                hm.get(temp).add(str[i]);
            }
            else{
                ArrayList<String> t=new ArrayList<>();
                t.add(str[i]);
                hm.put(temp,t);
            }
        }
        
        for(String key:hm.keySet()){
            list.add(hm.get(key));
        }
        
        return list;
    }
}


//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Ignore the newline after the test case input
        while (t-- > 0) {
            String inputLine = sc.nextLine();
            String[] arr = inputLine.split(" ");

            Solution ob = new Solution();
            ArrayList<ArrayList<String>> result = ob.anagrams(arr);
            result.sort(Comparator.comparing(a -> a.get(0)));
            for (ArrayList<String> group : result) {
                for (String word : group) {
                    System.out.print(word + " ");
                }
                System.out.println();
            }
            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends