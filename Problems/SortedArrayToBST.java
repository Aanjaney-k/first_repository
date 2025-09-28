class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class SortedArrayToBST {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        TreeNode root = sortedArrayToBST(nums, 0, nums.length - 1);
        System.out.print("Inorder Traversal of BST: ");
        inorder(root);
    }

    public static TreeNode sortedArrayToBST(int[] nums, int left, int right) {
        if (left > right) return null;

        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[mid]);

        node.left = sortedArrayToBST(nums, left, mid - 1); 
        node.right = sortedArrayToBST(nums, mid + 1, right);

        return node;
    }

    public static void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
}
