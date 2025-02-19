class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

public class SortedArrayToBST {
    public static TreeNode sortedArrayToBST(int[] nums) {
        return constructBST(nums, 0, nums.length - 1);
    }

    private static TreeNode constructBST(int[] nums, int left, int right) {
        if (left > right) return null;
        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = constructBST(nums, left, mid - 1);
        root.right = constructBST(nums, mid + 1, right);
        return root;
    }

    // Helper method to print the BST in level order
    public static void printLevelOrder(TreeNode root) {
        if (root == null) return;
        java.util.Queue<TreeNode> queue = new java.util.LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print((node != null ? node.val : "null") + " ");
            if (node != null) {
                queue.add(node.left);
                queue.add(node.right);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums1 = {-10, -3, 0, 5, 9};
        int[] nums2 = {1, 3};

        TreeNode tree1 = sortedArrayToBST(nums1);
        TreeNode tree2 = sortedArrayToBST(nums2);

        printLevelOrder(tree1);  // Output: 0 -3 9 -10 null 5
        printLevelOrder(tree2);  // Output: 3 1
    }
}
