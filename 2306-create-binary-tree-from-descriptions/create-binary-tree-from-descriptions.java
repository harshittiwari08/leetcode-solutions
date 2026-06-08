/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        Set<Integer> set = new HashSet<>();
        HashMap<Integer, TreeNode> map = new HashMap<>();
        for(int[] node : descriptions){
            int p = node[0];
            int c = node[1];
            int isLeft = node[2];
            TreeNode parent, child;
            set.add(c);
            if(map.containsKey(p))
                parent = map.get(p);
            else{
                parent = new TreeNode(p);
                map.put(p,parent);
            }
            if(map.containsKey(c))
                child = map.get(c);
            else{
                child = new TreeNode(c);
                map.put(c,child);
            }
            if(isLeft == 1)
                parent.left = child;
            else
                parent.right = child;
        }
        for(int[] node : descriptions){
            if(!set.contains(node[0]))
                return map.get(node[0]);
        }
        return null;
    }
}