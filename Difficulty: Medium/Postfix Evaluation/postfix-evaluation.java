class Solution {
    public int evaluatePostfix(String[] arr) {
        // code here
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0;i<arr.length;i++)
        {
            try
            {
                int str = Integer.parseInt(arr[i]);
                stack.add(str);
            }
            catch(NumberFormatException e)
            {
                int num = 0;
                int opt1 = stack.pop();             
                int opt2 = stack.pop(); 
                
                if(arr[i].equals("+"))
                    num = opt1 + opt2;
                else if(arr[i].equals("-"))
                    num = opt2 - opt1;
                else if(arr[i].equals("*"))
                    num = opt1 * opt2;
                else if(arr[i].equals("/"))
                {
                    num = opt2 / opt1;
                    if(opt2%opt1!=0 && (opt1<0 ^ opt2<0))
                        num--;
                }
                else if(arr[i].equals("^"))
                    num = (int)Math.pow(opt2,opt1);
                
                stack.push(num);
            }
        }
        return stack.peek();
    }
}