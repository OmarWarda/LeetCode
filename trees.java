import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class trees {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            result.add(root.val);
            root = root.right;
        }
        return result;
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p != null && q != null && p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        return false;
    }

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
    // **** Another solution for invertTree function by creating
    // new copy of the original tree Tree and do the inverting on this copy ******
    // This will work in isSymmetric function

    // public static TreeNode invertTree(TreeNode root) {
    // if (root == null) {
    // return null;
    // }

    // TreeNode inverted = new TreeNode(root.val);
    // inverted.left = invertTree(root.right);
    // inverted.right = invertTree(root.left);

    // return inverted;
    // }

    public static boolean isSymmetric(TreeNode root) {
        TreeNode invertedTree = invertTree(root);
        return isSameTree(root, invertedTree);
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBSTHelper(nums, 0, nums.length - 1);
    }

    public TreeNode sortedArrayToBSTHelper(int[] nums, int l, int r) {
        if (l > r) {
            return null;
        }

        int mid = l + (r - l) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBSTHelper(nums, l, mid - 1);
        root.right = sortedArrayToBSTHelper(nums, mid + 1, r);

        return root;
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return 1 + Math.max(leftDepth, rightDepth);
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;

        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);

        if (leftHeight - rightHeight > 1 || rightHeight - leftHeight > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;

        if (root.left == null) {
            return 1 + minDepth(root.right);
        }
        if (root.right == null) {
            return 1 + minDepth(root.left);
        }

        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);

        return 1 + Math.min(leftDepth, rightDepth);
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        int sum = 0;
        return hasPathSumHelper(root, targetSum, sum);
    }

    public boolean hasPathSumHelper(TreeNode root, int targetSum, int sum) {
        if (root == null) {
            return false;
        }
        sum += root.val;
        if (root.left == null && root.right == null)
            return sum == targetSum;
        return hasPathSumHelper(root.left, targetSum, sum) || hasPathSumHelper(root.right, targetSum, sum);
    }

    public boolean hasPathSum2(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        targetSum = targetSum - root.val;

        if (root.left == null && root.right == null) {
            return targetSum == 0;
        }
        return hasPathSum2(root.left, targetSum) || hasPathSum2(root.right, targetSum);
    }

    public static void main(String[] args) {
        // TreeNode root = new TreeNode(1);
        // root.right = new TreeNode(2);
        // root.left = new TreeNode(3);
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(3);

        TreeNode testing = invertTree(root);
        System.out.println(isSameTree(root, testing));

        // Expected output: [1, 3, 2]
        // List<Integer> result2 = inorderTraversal(root);
        // System.out.println("Inorder Traversal: " + result2);

        // System.out.println(isSymmetric(root));

    }
}
