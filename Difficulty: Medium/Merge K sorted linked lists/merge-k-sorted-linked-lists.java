/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node mergeKLists(Node[] arr) {
        // code here
        List<Node> list=new ArrayList<>();
        for(Node node:arr){
            Node curr=node;
            while(curr!=null){
                list.add(curr);
                curr=curr.next;
            }
        }
        Collections.sort(list,(a,b)->a.data-b.data);
        for(int i=1;i<list.size();i++){
            list.get(i-1).next=list.get(i);
        }
        return list.get(0);
    }
}