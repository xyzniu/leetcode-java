/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> rst = new ArrayList<Integer>();
        preorder(root, rst);
        return rst;
    }
    
    private void preorder(Node root, List<Integer> rst){
        if(root==null){
            return;
        }
        rst.add(root.val);
        List<Node> children = root.children;
        for(int i = 0; i < children.size(); i++){
            preorder(children.get(i), rst);
        }
    }
    
        public List<Integer> preorder(Node root) {
        List<Integer> rst = new ArrayList<>();
        if(root==null){
            return rst;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.empty()){
            Node node = stack.pop();
            rst.add(node.val);
            List<Node> children = node.children;
            for(int i = children.size()-1; i>=0; i--){
                Node temp = children.get(i);
                stack.push(temp);
            }
        }
        return rst;
    }
}
