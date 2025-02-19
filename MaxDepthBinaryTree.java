class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

public class MaxDepthBinaryTree {
    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        // Example 1: [3,9,20,null,null,15,7]
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(15);
        root1.right.right = new TreeNode(7);

        // Example 2: [1, null, 2]
        TreeNode root2 = new TreeNode(1);
        root2.right = new TreeNode(2);

        System.out.println(maxDepth(root1));  // Output: 3
        System.out.println(maxDepth(root2));  // Output: 2
    }
}
