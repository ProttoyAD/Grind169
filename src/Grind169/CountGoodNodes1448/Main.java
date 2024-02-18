package Grind169.CountGoodNodes1448;


public class Main {
    public static void main(String[] args) {
        TreeNode treeNode4 =new TreeNode(3);
        TreeNode treeNode5 =new TreeNode(1);
        TreeNode treeNode6 =new TreeNode(5);
        TreeNode treeNode2 =new TreeNode(1, treeNode4, null);
        TreeNode treeNode3 =new TreeNode(4, treeNode5, treeNode6);
        TreeNode treeNode1 =new TreeNode(3, treeNode2, treeNode3);
        System.out.println(goodNodes(treeNode1));
    }

    public static int goodNodes(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        else return dfs(root, root.val,0);
    }

    public static Integer dfs(TreeNode node, int max, int count){
        if(node == null) return count;
        if(node.val >= max) {
            max=node.val;
            count++;

        }
        count=dfs(node.left,max,count);
        count=dfs(node.right,max, count);
        return count;
    }
}
