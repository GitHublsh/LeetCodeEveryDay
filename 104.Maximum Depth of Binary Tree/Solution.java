 //二叉树的最大深度 解法一
    public static int maxDepth(TreeNode root) {
            if(root==null){
                return 0;
            }
            return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }

//解法二
public int maxDepth(TreeNode root) {
        if (null == root) {
            return 0;
        } else {
            int i = maxDepth(root.left);
            int j = maxDepth(root.right);
            return (i < j) ? j + 1 : i + 1;
        }
    }
