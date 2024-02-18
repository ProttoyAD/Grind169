package Grind169.MaxLevelSumBST1161;


import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
//        TreeNode treeNode4 =new TreeNode(3);
//        TreeNode treeNode5 =new TreeNode(1);
//        TreeNode treeNode6 =new TreeNode(5);
//        TreeNode treeNode2 =new TreeNode(1, treeNode4, null);
//        TreeNode treeNode3 =new TreeNode(4, treeNode5, treeNode6);
//        TreeNode treeNode1 =new TreeNode(3, treeNode2, treeNode3);
////        bfs(treeNode1);
//        System.out.println(maxLevelSum(treeNode1));
        Integer[] nodes={-100,-200,-300,-20,-5,-10,null};
        TreeNode node=createBinaryTree(nodes);
//        bfs(node);
        System.out.println(maxLevelSum(node));
    }

    public static int maxLevelSum(TreeNode root) {
        int max=Integer.MIN_VALUE;
        int sub=0;
        int level=0;
        int result=0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                queue.offer(null);
                level++;
                if (sub>max) {
                    max=sub;
                    result=level;
                }
                sub=0;
                if (queue.size()==1) break;
                continue;
            }
            sub+=node.val;
            if(node.left!=null) queue.offer(node.left);
            if( node.right!=null) queue.offer(node.right);
        }
        return result;
    }

    public static void bfs(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                queue.offer(null);
                System.out.println();
                System.out.println("---------");
                if (queue.size()==1) break;
                continue;
            }
            System.out.print(node.val+" ");
            if(node.left!=null) queue.offer(node.left);
            if( node.right!=null) queue.offer(node.right);
            }
        }


    public static TreeNode createBinaryTree(Integer[] nodes) {
        if (nodes == null || nodes.length == 0) return null;

        // Create the root node
        TreeNode root = new TreeNode(nodes[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1; // Start index for the list of nodes
        while (i < nodes.length) {
            TreeNode current = queue.poll();

            // Process the left child
            if (nodes[i] != null) {
                current.left = new TreeNode(nodes[i]);
                queue.add(current.left);
            }
            i++;

            // Check if there's more nodes to process
            if (i >= nodes.length) break;

            // Process the right child
            if (nodes[i] != null) {
                current.right = new TreeNode(nodes[i]);
                queue.add(current.right);
            }
            i++;
        }

        return root;
    }
}
